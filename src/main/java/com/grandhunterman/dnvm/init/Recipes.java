package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.handler.ConfigurationHandler;
import com.grandhunterman.dnvm.items.ItemDNVM;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class Recipes{
    public static void init(){
        if( ConfigurationHandler.grass_recipe == true) GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass), Items.wheat_seeds, Blocks.dirt);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.ingotPoorNichrome), "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotChromium", "ingotChromium"));
        }
}
