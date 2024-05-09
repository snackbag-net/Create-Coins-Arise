package net.snackbag.coinsarise;

import net.fabricmc.api.ModInitializer;

import net.snackbag.coinsarise.block.ModBlocks;
import net.snackbag.coinsarise.item.ModItemGroups;
import net.snackbag.coinsarise.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCoinsArise implements ModInitializer {
	public static final String MOD_ID = "coins_arise";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Create: Coins Arise...");
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		ModItemGroups.registerItemGroups();
	}
}