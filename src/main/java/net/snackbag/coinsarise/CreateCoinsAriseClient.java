package net.snackbag.coinsarise;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.snackbag.coinsarise.screen.BountyBoardScreen;
import net.snackbag.coinsarise.screen.ModScreenHandlers;

public class CreateCoinsAriseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.BOUNTY_BOARD_SCREEN_HANDLER, BountyBoardScreen::new);
    }
}
