package net.snackbag.coinsarise.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snackbag.coinsarise.CreateCoinsArise;

public class ModItems {
    public static final Item SPUR_CASTING_MOLD = registerItem("spur_casting_mold", new Item(new FabricItemSettings()));
    public static final Item BEVEL_CASTING_MOLD = registerItem("bevel_casting_mold", new Item(new FabricItemSettings()));
    public static final Item SPROCKET_CASTING_MOLD = registerItem("sprocket_casting_mold", new Item(new FabricItemSettings()));

    public static final Item MOLTEN_COPPER = registerItem("molten_copper", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_ZINC = registerItem("molten_zinc", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_IRON = registerItem("molten_iron", new Item(new FabricItemSettings()));

    public static final Item SPLATTERED_DIAMOND_GRAINS = registerItem("splattered_diamond_grains", new Item(new FabricItemSettings()));
    public static final Item SPLATTERED_EMERALD_GRAINS = registerItem("splattered_emerald_grains", new Item(new FabricItemSettings()));

    public static final Item UNPROCESSED_DIAMOND_PLATE = registerItem("unprocessed_diamond_plate", new Item(new FabricItemSettings()));
    public static final Item UNPROCESSED_EMERALD_PLATE = registerItem("unprocessed_diamond_plate", new Item(new FabricItemSettings()));

    public static final Item DIAMOND_PLATE = registerItem("diamond_plate", new Item(new FabricItemSettings()));
    public static final Item EMERALD_PLATE = registerItem("emerald_plate", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCoinsArise.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateCoinsArise.LOGGER.info("Registering Coins Arise items...");
    }
}
