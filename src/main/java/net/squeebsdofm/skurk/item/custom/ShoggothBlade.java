package net.squeebsdofm.skurk.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ShoggothBlade extends SwordItem {

    public ShoggothBlade(ToolMaterial material, Item.Settings settings) {
        super(material,  settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getWorld().isClient()) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1));
        }
        return super.postHit(stack, target, attacker);
    }
}
