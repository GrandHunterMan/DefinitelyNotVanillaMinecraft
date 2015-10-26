package com.grandhunterman.dnvm.proxy;

import com.grandhunterman.dnvm.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.EXPLODE);
    }
}
