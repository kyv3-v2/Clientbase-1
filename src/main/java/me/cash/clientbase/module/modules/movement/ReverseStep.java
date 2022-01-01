package me.cash.clientbase.module.modules.movement;

import me.cash.clientbase.module.Category;
import me.cash.clientbase.module.Module;

/**
 * @author cash
 */

public class ReverseStep extends Module {
	public ReverseStep() {
		super("ReverseStep", "Step down blocks", Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(mc.player != null || mc.world != null) {
			mc.player.motionY -= 1.0;
		}
	}
}
