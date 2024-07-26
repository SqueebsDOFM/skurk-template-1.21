package net.squeebsdofm.skurk;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.squeebsdofm.skurk.effect.ModEffects;
import net.squeebsdofm.skurk.item.ModItemGroups;
import net.squeebsdofm.skurk.item.ModItems;
import net.squeebsdofm.skurk.util.ModLootTableModifers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skurk implements ModInitializer {
	public static final String MOD_ID = "skurk";
	public static final Logger LOGGER = LoggerFactory.getLogger("skurk");


	@Override
	public void onInitialize()	{
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTableModifers.modifyLootTable();
		ModEffects.registerModEffects();
	}


}
