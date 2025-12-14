package me.erbium08.allaydrumsticks;

import me.erbium08.allaydrumsticks.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Allaydrumsticks implements ModInitializer {
	public static final String MOD_ID = "allaydrumsticks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}