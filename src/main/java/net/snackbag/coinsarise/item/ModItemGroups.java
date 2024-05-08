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
                        entries.add(ModItems.SPUR_CASTING_MOLD);
                    })
                    .build());

    public static void registerItemGroups() {
        CreateCoinsArise.LOGGER.info("Registering item groups...");
    }
}
