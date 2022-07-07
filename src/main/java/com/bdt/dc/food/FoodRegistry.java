package com.bdt.dc.food;

import com.bdt.dc.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodRegistry
{
  public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS,Utils.MOD_ID);
  public static final RegistryObject<Item> dough = FOODS.register("dough",Dough::new);
}
