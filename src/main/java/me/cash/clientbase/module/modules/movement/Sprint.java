package me.cash.clientbase.module.modules.movement;

import me.cash.clientbase.module.Category;
import me.cash.clientbase.module.Module;

/**
 * @author cash
 */

public class Sprint extends Module {
	public Sprint() {
		super("Sprint", "Automatically Sprints for you", Category.MOVEMENT);
		this.setBind(24); // Keyboard.KEY_O if you wanna be specific
	}
	
	@Override
	public void onUpdate() {
		if(mc.player != null && mc.player.moveForward > 0 && !mc.player.isSprinting()) {
			mc.player.setSprinting(true);
		}
	}
}
