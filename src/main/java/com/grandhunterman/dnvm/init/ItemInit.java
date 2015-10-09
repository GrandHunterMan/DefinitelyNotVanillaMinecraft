package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.items.ItemDNVM;
import com.grandhunterman.dnvm.items.ItemSalt;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */

public class ItemInit {
    public static final ItemDNVM itemSalt = new ItemSalt();

    public static void init(){
        GameRegistry.registerItem(itemSalt, "Salt");
    }
}
