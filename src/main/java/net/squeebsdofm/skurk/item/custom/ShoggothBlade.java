package net.squeebsdofm.skurk.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.entry.RegistryEntry;
import net.squeebsdofm.skurk.effect.GlimpseOfCthugha;

import static net.squeebsdofm.skurk.effect.ModEffects.GLIMPSE_OF_CTHUGHA;

public class ShoggothBlade extends SwordItem {

    public ShoggothBlade(ToolMaterial material, Item.Settings settings) {
        super(material,  settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance((RegistryEntry<StatusEffect>)GLIMPSE_OF_CTHUGHA, 200, 1));
        }
        return super.postHit(stack, target, attacker);
    }
}
