package com.grandhunterman.dnvm;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */

import com.grandhunterman.dnvm.client.handler.KeyInputEventHandler;
import com.grandhunterman.dnvm.handler.ConfigurationHandler;
import com.grandhunterman.dnvm.init.BlockInit;
import com.grandhunterman.dnvm.init.ItemInit;
import com.grandhunterman.dnvm.init.OreDictRegister;
import com.grandhunterman.dnvm.init.Recipes;
import com.grandhunterman.dnvm.network.NetworkHandler;
import com.grandhunterman.dnvm.proxy.IProxy;
import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


@Mod(modid = General.MOD_ID, name = General.MOD_NAME, version = General.MOD_VERSION, guiFactory = General.GUI_FACTORY)
public class dnvm {

   @Mod.Instance(General.MOD_ID)
   public static dnvm instance;

 @SidedProxy(clientSide = General.CLIENT_SIDE_PROXY , serverSide = General.SERVER_SIDE_PROXY)
 public static IProxy proxy;


    //PREINIT
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
       ConfigurationHandler.init(event.getSuggestedConfigurationFile());
       FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
       ItemInit.init();
       BlockInit.init();
       OreDictRegister.Register();
       proxy.registerKeyBindings();
       NetworkHandler.init();

    }

    //INIT
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
       Recipes.init();
       FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }

    //POSTINIT
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){

    }
}
