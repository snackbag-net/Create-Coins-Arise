package net.snackbag.coinsarise.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.snackbag.coinsarise.CreateCoinsArise;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BountyBoardScreenHandler> BOUNTY_BOARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(CreateCoinsArise.MOD_ID, "bounty_board_screen_handler"),
                    new ExtendedScreenHandlerType<>(BountyBoardScreenHandler::new));

    public static void registerScreenHandlers() {
        CreateCoinsArise.LOGGER.info("Registering Coins Arise screen handlers...");
    }
}
