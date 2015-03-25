package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.blocks.*;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import com.grandhunterman.definitelynotvanillaminecraft.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.ca)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class DNVMBlocks {
    //To be honest, I have no idea what I'm doing
    public static Block aluminum_block;
    public static Block titanium_block;
    public static Block cryolite_block;
    public static Block rutile_block;
    //Block-Ore
    public static Block titanium_ore;
    public static Block aluminum_ore;
    public static Block cryolite_ore;
    public static Block rutile_ore;

    public static void init(){
        aluminum_block = new BlockAluminumBlock().setUnlocalizedName("aluminum_block");
        titanium_block = new BlockTitaniumBlock().setUnlocalizedName("titanium_block");
        cryolite_block = new BlockCryoliteBlock().setUnlocalizedName("cryolite_block");
        rutile_block = new BlockRutileBlock().setUnlocalizedName("rutile_block");
        //Block-Ore
        titanium_ore = new BlockTitaniumOre().setUnlocalizedName("titanium_ore");
        aluminum_ore = new BlockAluminumOre().setUnlocalizedName("aluminum_ore");
        cryolite_ore = new BlockCryoliteOre().setUnlocalizedName("cryolite_ore");
        rutile_ore = new BlockRutileOre().setUnlocalizedName("rutile_ore");
    }

    public static void register(){
        //substring gets rid of .tile
        GameRegistry.registerBlock(aluminum_block, aluminum_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(titanium_block, titanium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cryolite_block, cryolite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rutile_block, rutile_block.getUnlocalizedName().substring(5));
        //Block-Ore
        GameRegistry.registerBlock(titanium_ore, titanium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(aluminum_ore, aluminum_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cryolite_ore, cryolite_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rutile_ore, rutile_ore.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
       //Tells registerRender to register the render
        registerRender(aluminum_block);
        registerRender(titanium_block);
        registerRender(cryolite_block);
        registerRender(rutile_block);
        //Block-Ore
        registerRender(titanium_ore);
        registerRender(aluminum_ore);
        registerRender(cryolite_ore);
        registerRender(rutile_ore);
        //so many rendering problems...
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        // Logging successful load
        LogHelper.info("Blocks Loaded");
    }

}
