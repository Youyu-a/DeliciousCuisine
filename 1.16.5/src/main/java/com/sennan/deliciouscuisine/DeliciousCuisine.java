package com.sennan.deliciouscuisine;

import com.sennan.deliciouscuisine.registry.ModFood;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class DeliciousCuisine {
    public DeliciousCuisine(){
        ModFood.FOODS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
