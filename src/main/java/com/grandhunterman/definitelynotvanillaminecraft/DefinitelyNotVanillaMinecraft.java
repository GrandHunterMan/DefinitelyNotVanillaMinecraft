package com.grandhunterman.definitelynotvanillaminecraft;

/*
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

import com.grandhunterman.definitelynotvanillaminecraft.handler.ConfigurationHandler;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMSmelting;
import com.grandhunterman.definitelynotvanillaminecraft.handler.OreDicRegistry;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMBlocks;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMItems;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMRecipes;
import com.grandhunterman.definitelynotvanillaminecraft.proxy.IProxy;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import com.grandhunterman.definitelynotvanillaminecraft.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DefinitelyNotVanillaMinecraft
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        DNVMItems.init();
        DNVMItems.Register();
        DNVMBlocks.init();
        DNVMBlocks.register();
        LogHelper.info("Pre-Init Complete");
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.registerRenders();
        DNVMRecipes.crafting();
        DNVMSmelting.smelting();
        OreDicRegistry.RegOres();
        LogHelper.info("Recipes Loaded");
        LogHelper.info("Init Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post-Init Complete");

    }

}
