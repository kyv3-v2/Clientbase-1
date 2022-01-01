package me.cash.clientbase.module.modules.movement;

import me.cash.clientbase.module.Category;
import me.cash.clientbase.module.Module;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * this is from postman i didn't make it credits to srgantmoomoo
 * https://github.com/srgantmoomoo/postman/blob/master/src/main/java/me/srgantmoomoo/postman/client/module/modules/movement/NoSlow.java
 */

public class NoSlowDown extends Module {
	public NoSlowDown() {
		super("NoSlowDown", "doesnt slow you down when items are used", Category.MOVEMENT);
	}
	
	@SubscribeEvent
	public void onEvent(InputUpdateEvent event) {
		if(mc.player.isHandActive() && !mc.player.isRiding() && mc.player != null || mc.world != null) {
			event.getMovementInput().moveStrafe *= 5;
			event.getMovementInput().moveForward *= 5;
		}
	}
}
