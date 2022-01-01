package me.cash.clientbase.event;

import me.cash.clientbase.manager.ModuleManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class UpdateEvent {
	public UpdateEvent() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onTick(TickEvent event) {
		ModuleManager.onUpdate();
	}
}
