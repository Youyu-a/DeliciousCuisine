package com.sennan.deliciouscuisine.group;

import com.sennan.deliciouscuisine.registry.ModFood;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoodGroup extends ItemGroup {
    public FoodGroup(){
        super("food_group");
    }

    @Override
    public ItemStack makeIcon(){
        return new ItemStack(ModFood.Purple_Sweet_Potato.get());
    }
}
