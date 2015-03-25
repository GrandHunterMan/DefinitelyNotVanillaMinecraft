package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.item.*;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import com.grandhunterman.definitelynotvanillaminecraft.utility.LogHelper;
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
public class DNVMItems {

    public static Item aluminum_ingot;
    public static Item salt;
    public static Item titanium_ingot;
    public static Item cryolite_crystal;
    public static Item rutile_crystal;
    public static Item coaly_iron_ingot;
    public static Item steel_ingot;

    public static void init(){
        aluminum_ingot = new ItemAluminumIngot().setUnlocalizedName("aluminum_ingot");
        salt = new ItemSalt().setUnlocalizedName("salt");
        titanium_ingot = new ItemTitaniumIngot().setUnlocalizedName("titanium_ingot");
        cryolite_crystal = new ItemTitaniumIngot().setUnlocalizedName("cryolite_crystal");
        rutile_crystal = new ItemTitaniumIngot().setUnlocalizedName("rutile_crystal");
        coaly_iron_ingot = new ItemCoalyIron().setUnlocalizedName("coaly_iron_ingot");
        steel_ingot = new ItemSteel().setUnlocalizedName("steel_ingot");
    }

    public static void Register(){
        GameRegistry.registerItem(aluminum_ingot, aluminum_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(titanium_ingot, titanium_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cryolite_crystal, cryolite_crystal.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rutile_crystal, rutile_crystal.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(coaly_iron_ingot, coaly_iron_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steel_ingot, steel_ingot.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        RegisterRender(aluminum_ingot);
        RegisterRender(salt);
        RegisterRender(titanium_ingot);
        RegisterRender(cryolite_crystal);
        RegisterRender(rutile_crystal);
        RegisterRender(coaly_iron_ingot);
        RegisterRender(steel_ingot);


    }

    public static void RegisterRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        LogHelper.debug("Items Loaded");
    }


}

