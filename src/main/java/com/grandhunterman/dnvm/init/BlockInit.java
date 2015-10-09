package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.blocks.BlockDNVM;
import com.grandhunterman.dnvm.blocks.BlockSalt;
import com.grandhunterman.dnvm.blocks.BlockTitanium;
import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
@GameRegistry.ObjectHolder(General.MOD_ID)

public class BlockInit {
    public static final BlockDNVM blockSalt = new BlockSalt();
    public static final BlockDNVM blockTitanium = new BlockTitanium();

    public static void init(){
        GameRegistry.registerBlock(blockSalt, "blockSalt");
        GameRegistry.registerBlock(blockTitanium, "blockTitanium");
    }
}
