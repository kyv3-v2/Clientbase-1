package me.cash.clientbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

import me.cash.clientbase.manager.ModuleManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "client", name = "Client", version = "0.0.1")
public class Client {
	
	public static final Logger logger = LogManager.getLogger("Client");	
	
	public static ModuleManager moduleManager;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Display.setTitle("Client - v0.0.1");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		moduleManager = new ModuleManager();
	}
}
