package net.squeebsdofm.skurk.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.entry.RegistryEntry;
import net.squeebsdofm.skurk.Skurk;
import net.squeebsdofm.skurk.effect.GlimpseOfCthugha;
import net.squeebsdofm.skurk.effect.ModEffects;

import static net.minecraft.registry.RegistryKeys.STATUS_EFFECT;
import static net.squeebsdofm.skurk.effect.ModEffects.GLIMPSE_OF_CTHUGHA;
import static net.squeebsdofm.skurk.effect.ModEffects.registerModEffects;


public class EmberCrag extends SwordItem {

    public EmberCrag(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance((RegistryEntry<StatusEffect>) GLIMPSE_OF_CTHUGHA, 200, 1)); // 200 ticks duration
        }
        return super.postHit(stack, target, attacker);
    }
}
