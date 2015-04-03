package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.blocks.*;
import com.grandhunterman.definitelynotvanillaminecraft.blocks.ore.*;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
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
    public static Block aluminum_ore;
    public static Block cryolite_ore;
    public static Block rutile_ore;
    public static Block copper_ore;
    public static Block tin_ore;
    public static Block lead_ore;
    public static Block silver_ore;
    public static Block nickel_ore;
    public static Block chrome_ore;

    //Machines
    public static Block drill_press;


    public static void init(){
        aluminum_block = new BlockAluminumBlock().setUnlocalizedName("aluminum_block");
        titanium_block = new BlockTitaniumBlock().setUnlocalizedName("titanium_block");
        cryolite_block = new BlockCryoliteBlock().setUnlocalizedName("cryolite_block");
        rutile_block = new BlockRutileBlock().setUnlocalizedName("rutile_block");
        //Block-Ore
        aluminum_ore = new BlockAluminumOre().setUnlocalizedName("aluminum_ore");
        cryolite_ore = new BlockCryoliteOre().setUnlocalizedName("cryolite_ore");
        rutile_ore = new BlockRutileOre().setUnlocalizedName("rutile_ore");
        copper_ore = new BlockCopperOre().setUnlocalizedName("copper_ore");
        tin_ore = new BlockTinOre().setUnlocalizedName("tin_ore");
        lead_ore = new BlockLeadOre().setUnlocalizedName("lead_ore");
        silver_ore = new BlockSilverOre().setUnlocalizedName("silver_ore");
        nickel_ore = new BlockNickelOre().setUnlocalizedName("nickel_ore");
        chrome_ore = new BlockChromiumOre().setUnlocalizedName("chrome_ore");

        //Machines
        drill_press = new BlockDrillPress().setUnlocalizedName("drill_press");
    }

    public static void register(){
        //substring gets rid of .tile
        GameRegistry.registerBlock(aluminum_block, aluminum_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(titanium_block, titanium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cryolite_block, cryolite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rutile_block, rutile_block.getUnlocalizedName().substring(5));
        //Block-Ore
        GameRegistry.registerBlock(aluminum_ore, aluminum_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cryolite_ore, cryolite_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rutile_ore, rutile_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(copper_ore, copper_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tin_ore, tin_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lead_ore, lead_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(silver_ore, silver_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nickel_ore, nickel_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(chrome_ore, chrome_ore.getUnlocalizedName().substring(5));

        //Machines
        GameRegistry.registerBlock(drill_press, drill_press.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
       //Tells registerRender to register the render
        registerRender(aluminum_block);
        registerRender(titanium_block);
        registerRender(cryolite_block);
        registerRender(rutile_block);
        //Block-Ore
        registerRender(aluminum_ore);
        registerRender(cryolite_ore);
        registerRender(rutile_ore);
        registerRender(copper_ore);
        registerRender(tin_ore);
        registerRender(lead_ore);
        registerRender(silver_ore);
        registerRender(nickel_ore);
        registerRender(chrome_ore);
        //Machines
        registerRender(drill_press);
        //so many rendering problems...
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
