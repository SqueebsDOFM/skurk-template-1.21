package net.squeebsdofm.skurk.effect;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.squeebsdofm.skurk.Skurk;

public class ModEffects implements ModInitializer {
    public static final StatusEffect TATER_EFFECT;
    public static final StatusEffect GLIMPSE_OF_CTHUGHA;


    static {
        GLIMPSE_OF_CTHUGHA = Registry.register(Registries.STATUS_EFFECT, Identifier.of("skurk","glimpse of cthugha"),new GlimpseOfCthugha());
        TATER_EFFECT = Registry.register(Registries.STATUS_EFFECT, Identifier.of("skurk","tatereffect"),new TaterEffect());

    }
    @Override
    public void onInitialize() {

    }
        public static void registerModEffects(){
            Skurk.LOGGER.info("Registering ModEffects for"+Skurk.MOD_ID);
        } ;


}
