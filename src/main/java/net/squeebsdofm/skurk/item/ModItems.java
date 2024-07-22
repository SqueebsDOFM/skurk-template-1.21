package net.squeebsdofm.skurk.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.squeebsdofm.skurk.Skurk;

public class ModItems {
    public static final Item SHOGGOTH_TOOTH = registerItem("shoggoth_tooth", new Item(new Item.Settings())) ;
    public static final Item EMPOWERED_SHOGGOTH_TOOTH = registerItem("empowered_shoggoth_tooth", new Item(new Item.Settings())) ;
    public static final Item ELDRITCH_RUNE = registerItem("eldritch_rune", new Item(new Item.Settings())) ;


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SHOGGOTH_TOOTH);
        entries.add(EMPOWERED_SHOGGOTH_TOOTH);
        entries.add(ELDRITCH_RUNE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Skurk.MOD_ID, name), item);
    }

    public static void registerModItems() {
    Skurk.LOGGER.info("Registering Mod Items" + Skurk.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
