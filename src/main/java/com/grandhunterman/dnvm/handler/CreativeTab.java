package com.grandhunterman.dnvm.handler;

import com.grandhunterman.dnvm.init.ItemInit;
import com.grandhunterman.dnvm.reference.General;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class CreativeTab {
    public static final CreativeTabs DNVM_GENERAL = new CreativeTabs(General.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ItemInit.ingotPoorNichrome;
        }
    };

}
