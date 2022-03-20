package com.mystic.RCKM;

import com.mystic.RCKM.Chroma.Chroma;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.MinecraftClient;

import java.util.EventListener;

public class RCKMain implements ModInitializer {

	@Override
	public void onInitialize() {
		ClientTickEvents.START_CLIENT_TICK.register(new ClientTickEvents.StartTick() {
			@Override
			public void onStartTick(MinecraftClient client) {
				Chroma.init();
			}
		});
	}
}
