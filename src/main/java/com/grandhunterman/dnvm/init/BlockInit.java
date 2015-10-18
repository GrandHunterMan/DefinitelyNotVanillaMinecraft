package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.blocks.BlockDNVM;
import com.grandhunterman.dnvm.blocks.BlockSalt;
import com.grandhunterman.dnvm.blocks.BlockTitanium;
import com.grandhunterman.dnvm.blocks.OreDNVM;
import com.grandhunterman.dnvm.blocks.ore.*;
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
    //Ores
    public static final OreDNVM oreRutile = new BlockRutileOre();
    public static final OreDNVM oreCryolite = new BlockCryoliteOre();
    public static final OreDNVM oreAluminum = new BlockAluminumOre();
    public static final OreDNVM oreCopper = new BlockCopperOre();
    public static final OreDNVM oreLead = new BlockLeadOre();
    public static final OreDNVM oreSilver = new BlockSilverOre();
    public static final OreDNVM oreChrome = new BlockChromeOre();
    public static final OreDNVM oreNickel = new BlockNickelOre();
    public static final OreDNVM oreTin = new BlockTinOre();

    public static void init(){
        GameRegistry.registerBlock(blockSalt, "blockSalt");
        GameRegistry.registerBlock(blockTitanium, "blockTitanium");
        //Ores
        GameRegistry.registerBlock(oreRutile, "oreRutile");
        GameRegistry.registerBlock(oreCryolite, "oreCryolite");
        GameRegistry.registerBlock(oreAluminum, "oreAluminum");
        GameRegistry.registerBlock(oreCopper, "oreCopper");
        GameRegistry.registerBlock(oreLead, "oreLead");
        GameRegistry.registerBlock(oreSilver, "oreSilver");
        GameRegistry.registerBlock(oreChrome, "oreChrome");
        GameRegistry.registerBlock(oreNickel, "oreNickel");
        GameRegistry.registerBlock(oreTin, "oreTin");
    }
}
