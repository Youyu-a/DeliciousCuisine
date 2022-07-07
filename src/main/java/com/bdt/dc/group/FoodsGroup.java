package com.bdt.dc.group;

import com.bdt.dc.food.FoodRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoodsGroup extends ItemGroup
{
    public FoodsGroup()
    {
        super("delicious_cuisine");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(FoodRegistry.dough.get());
    }
}
