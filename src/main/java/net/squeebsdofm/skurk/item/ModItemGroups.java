package net.squeebsdofm.skurk.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.squeebsdofm.skurk.Skurk;

public class ModItemGroups {
    public static final ItemGroup SHOGGOTH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Skurk.MOD_ID, "shoggoth"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shoggoth"))
                    .icon(() -> new ItemStack(ModItems.SHOGGOTH_TOOTH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHOGGOTH_TOOTH);
                        entries.add(ModItems.EMPOWERED_SHOGGOTH_TOOTH);
                        entries.add(ModItems.ELDRITCH_RUNE4);
                        entries.add(ModItems.ELDRITCH_RUNE3);
                        entries.add(ModItems.ELDRITCH_RUNE2);
                        entries.add(ModItems.ELDRITCH_RUNE1);
                        entries.add(ModItems.ELDRITCH_RUNE0);
                        entries.add(ModItems.SHOGGOTH_BLADE);
                        entries.add(ModItems.EMBER_CRAG);
                    }).build());

    public static void registerItemGroups(){
        Skurk.LOGGER.info("Registering Mod Item Groups for"+Skurk.MOD_ID);
    }
}
