package com.sennan.deliciouscuisine;

import net.minecraft.item.Food;

public class FoodValues {

    public static final Food EdibleCrops = (new Food.Builder().nutrition(2).saturationMod(0.4f).build());
    public static final Food NonEdibleCrops = (new Food.Builder().nutrition(0).saturationMod(0).build());
}
