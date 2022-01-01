package me.cash.clientbase.module.modules.movement;

import me.cash.clientbase.module.Category;
import me.cash.clientbase.module.Module;

/**
 * @author cash
 */

public class Step extends Module {
	public Step() {
		super("Step", "Step up blocks", Category.MOVEMENT);
	}
	
	@Override
	public void onEnable() {
		if(mc.player != null || mc.world != null) {
			mc.player.stepHeight = 2.0f;
		}
	}
	
	@Override
	public void onDisable() {
		mc.player.stepHeight = 0.5f;
	}
}
