package com.bdt.dc.food;

import com.bdt.dc.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class Dough extends Item
{
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .effect(() -> new EffectInstance(Effects.HUNGER,02,1),2)
            .nutrition(2)
            .build();

    public Dough()
    {
        super(new Properties().food(food).tab(ModGroup.foodsGroup));
    }
}
