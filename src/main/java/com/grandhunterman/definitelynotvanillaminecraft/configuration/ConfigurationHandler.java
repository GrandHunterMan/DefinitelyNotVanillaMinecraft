package com.grandhunterman.definitelynotvanillaminecraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Thomas Keehn on 2015-03-12.
 */
public class ConfigurationHandler {
    public static void init(File configFile) {

        Configuration configuration = new Configuration();

        try
        {
            //load config file
            configuration.load();
            //read it
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is a testing value").getBoolean(true);
        }

        catch (Exception e) {
        //log stuff
        }

        finally
        {
            //save config file
            configuration.save();
        }
    }
}
