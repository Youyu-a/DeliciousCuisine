package com.sennan.deliciouscuisine.registry;

import com.sennan.deliciouscuisine.FoodValues;
import com.sennan.deliciouscuisine.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {
    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //crop
    public static final RegistryObject<Item> Purple_Sweet_Potato = FOODS.register("purple_sweet_potato",
            () -> new Item(new Item.Properties().food(FoodValues.EdibleCrops).tab(ModGroup.foodGroup)));
    public static final RegistryObject<Item> Sweet_Potato = FOODS.register("sweet_potato",
            () -> new Item(new Item.Properties().food(FoodValues.EdibleCrops).tab(ModGroup.foodGroup)));
    public static final RegistryObject<Item> Cotton = FOODS.register("cotton",
            () -> new Item(new Item.Properties().food(FoodValues.NonEdibleCrops).tab(ModGroup.foodGroup)));

}
