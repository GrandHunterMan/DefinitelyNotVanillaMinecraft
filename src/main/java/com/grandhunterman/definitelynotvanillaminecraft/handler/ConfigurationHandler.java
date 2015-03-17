package com.grandhunterman.definitelynotvanillaminecraft.handler;

import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.tools.nsc.doc.model.Public;

import java.io.File;


public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //Resync Configs
        }
    }

    private static void loadConfiguration(){

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Test Config");

        if (configuration.hasChanged()){

            configuration.save();
        }
    }
}
