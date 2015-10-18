package com.grandhunterman.dnvm.handler;

import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean grass_recipe = true;

    public static void init(File configFile) {
       if (configuration == null){
           configuration = new Configuration(configFile);
           loadConfiguration();
       }

    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(General.MOD_ID))
        {
            loadConfiguration();
        }
    }



    private static void loadConfiguration(){
        grass_recipe = configuration.getBoolean("grassRecipe", configuration.CATEGORY_GENERAL, true, "Can craft grass blocks with seeds and dirt");
        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}
