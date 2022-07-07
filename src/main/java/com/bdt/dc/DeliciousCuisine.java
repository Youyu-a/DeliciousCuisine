package com.bdt.dc;

import com.bdt.dc.food.FoodRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(Utils.MOD_ID)
public class DeliciousCuisine
{
    public DeliciousCuisine()
    {
        FoodRegistry.FOODS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
