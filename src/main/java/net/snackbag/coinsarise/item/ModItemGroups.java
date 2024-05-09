package net.snackbag.coinsarise.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.snackbag.coinsarise.CreateCoinsArise;

public class ModItemGroups {
    public static final ItemGroup NUMISMATIC_COINS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateCoinsArise.MOD_ID, "coins_arise"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.coins_arise"))
                    .icon(() -> new ItemStack(ModItems.SPUR_CASTING_MOLD)).entries((displayContext, entries) -> {
                        // Coin stuff
                        entries.add(ModItems.SPUR_CASTING_MOLD);
                        entries.add(ModItems.BEVEL_CASTING_MOLD);
                        entries.add(ModItems.SPROCKET_CASTING_MOLD);

                        entries.add(ModItems.MOLTEN_COPPER); // spur
                        entries.add(ModItems.MOLTEN_ZINC); // bevel
                        entries.add(ModItems.MOLTEN_IRON); // sprocket

                        // Plate stuff
                        entries.add(ModItems.SPLATTERED_DIAMOND_GRAINS);
                        entries.add(ModItems.SPLATTERED_EMERALD_GRAINS);

                        entries.add(ModItems.UNPROCESSED_DIAMOND_PLATE);
                        entries.add(ModItems.UNPROCESSED_EMERALD_PLATE);

                        entries.add(ModItems.DIAMOND_PLATE);
                        entries.add(ModItems.EMERALD_PLATE);
                    })
                    .build());

    public static void registerItemGroups() {
        CreateCoinsArise.LOGGER.info("Registering item groups...");
    }
}
