package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.items.*;
import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
@GameRegistry.ObjectHolder(General.MOD_ID)

public class ItemInit {
    //Raw Materials
    public static final ItemDNVM dustSalt = new ItemSalt();
    public static final ItemDNVM ingotTitanium = new ItemTitaniumIngot();
    public static final ItemDNVM ingotAluminum = new ItemAluminumIngot();
    public static final ItemDNVM crystalRutile = new ItemRutileCrystal();
    public static final ItemDNVM crystalCryolite = new ItemCryoliteCrystal();
    public static final ItemDNVM ingotCopper = new ItemCopperIngot();
    public static final ItemDNVM ingotChrome = new ItemChromeIngot();


    public static void init(){
        //Raw Materials
        GameRegistry.registerItem(dustSalt, "dustSalt");
        GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
        GameRegistry.registerItem(ingotAluminum, "ingotAluminum");
        GameRegistry.registerItem(crystalRutile, "crystalRutile");
        GameRegistry.registerItem(crystalCryolite, "crystalCryolite");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotChrome, "ingotChrome");
    }
}
