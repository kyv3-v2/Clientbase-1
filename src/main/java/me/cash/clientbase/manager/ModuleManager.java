package me.cash.clientbase.manager;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import me.cash.clientbase.module.Category;
import me.cash.clientbase.module.Module;
import me.cash.clientbase.module.modules.movement.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class ModuleManager {
	private static final ArrayList<me.cash.clientbase.module.Module> modules = new ArrayList<>();
	
	public ModuleManager() {
		
		// Movement
		modules.add(new Sprint());
		modules.add(new NoSlowDown());
		modules.add(new Step());
		modules.add(new ReverseStep());

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if(Keyboard.getEventKeyState() && Keyboard.getEventKey() > 0) {
			for(final Module module : getModules()) {
				if(module.getBind() == Keyboard.getEventKey()) module.toggle();
			}
		}
	}

	public static void onUpdate() {
		modules.stream().filter(Module::isEnabled).forEach(Module::onUpdate);
	}
	
	public ArrayList<Module> getModules() {
		return this.modules;
	}
	
	public Module getModule(String name) {
		for(Module module : this.modules) {
			if(!module.getName().equalsIgnoreCase(name)) continue;
			return module;
		}
		return null;
	}
	
	public ArrayList<Module> getModules(Category category) {
		ArrayList<Module> mods = new ArrayList<Module>();
		for(Module module : this.modules) {
			if(!module.getCategory().equals((Object)category)) continue;
			mods.add(module);
		}
		return mods;
	}
}
