package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.CreativeTabDNVM;
import com.grandhunterman.definitelynotvanillaminecraft.item.ItemDNVM;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
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

    public static void init(){
        aluminum_ingot = new Item().setUnlocalizedName("aluminum_ingot").setCreativeTab(CreativeTabDNVM.DNVM_TAB);
        salt = new Item().setUnlocalizedName("salt").setCreativeTab(CreativeTabDNVM.DNVM_TAB);
    }

    public static void Register(){
        GameRegistry.registerItem(aluminum_ingot, aluminum_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));

    }

    public static void registerRenders(){
        RegisterRender(aluminum_ingot);
        RegisterRender(salt);

    }

    public static void RegisterRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}

