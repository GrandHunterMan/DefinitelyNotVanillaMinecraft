package com.grandhunterman.dnvm.client;

import com.grandhunterman.dnvm.handler.ConfigurationHandler;
import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class DnvmGuiConfig extends GuiConfig {
    public DnvmGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
        General.MOD_ID,
        false,
        false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}
