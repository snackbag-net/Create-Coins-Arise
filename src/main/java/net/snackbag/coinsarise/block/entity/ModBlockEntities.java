package net.snackbag.coinsarise.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snackbag.coinsarise.CreateCoinsArise;
import net.snackbag.coinsarise.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<BountyBoardBlockEntity> BOUNTY_BOARD_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CreateCoinsArise.MOD_ID, "bounty_board_block_entity"),
                    FabricBlockEntityTypeBuilder.create(BountyBoardBlockEntity::new,
                            ModBlocks.BOUNTY_BOARD_BLOCK).build());

    public static void registerBlockEntities() {
        CreateCoinsArise.LOGGER.info("Registering Coins Arise block entities...");
    }
}
