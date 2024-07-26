package net.squeebsdofm.skurk.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class GlimpseOfCthugha extends StatusEffect {

    public GlimpseOfCthugha() {
        super(StatusEffectCategory.HARMFUL, 0x98D982); // Category and color
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 100 == 0;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient) {
            entity.setOnFireFor(5 * (amplifier + 1));
        }
        return true;
    }
}
