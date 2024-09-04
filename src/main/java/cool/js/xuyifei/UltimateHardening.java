package cool.js.xuyifei;

import cool.js.xuyifei.item.ModItemGroups;
import cool.js.xuyifei.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateHardening implements ModInitializer {
	public static final String MOD_ID = "ultimatehardening";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		LOGGER.info("UltimateHardening[终极硬化]");
	}
}