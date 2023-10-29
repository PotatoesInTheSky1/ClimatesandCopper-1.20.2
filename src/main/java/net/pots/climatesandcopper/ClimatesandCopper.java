package net.pots.climatesandcopper;

import net.fabricmc.api.ModInitializer;

import net.pots.climatesandcopper.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClimatesandCopper implements ModInitializer {
	public static final String MOD_ID = "climatesandcopper";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}