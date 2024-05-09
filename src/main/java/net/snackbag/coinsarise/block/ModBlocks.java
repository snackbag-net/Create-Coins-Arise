package net.snackbag.coinsarise.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.snackbag.coinsarise.CreateCoinsArise;
import net.snackbag.coinsarise.block.custom.BountyBoardBlock;

public class ModBlocks {
    public static final Block BOUNTY_BOARD_BLOCK = registerBlock("bounty_board",
            new BountyBoardBlock(FabricBlockSettings.create()
                    .strength(0)
                    .sounds(BlockSoundGroup.WOOD)
                    .breakInstantly()
                    .collidable(true)
                    .hardness(0)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateCoinsArise.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCoinsArise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        CreateCoinsArise.LOGGER.info("Registering Coins Arise blocks...");
    }
}
