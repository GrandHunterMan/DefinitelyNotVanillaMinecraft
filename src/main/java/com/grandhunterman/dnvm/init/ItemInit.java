package com.grandhunterman.dnvm.init;

import com.grandhunterman.dnvm.items.*;
import com.grandhunterman.dnvm.items.electronics.ItemBasicCapacitor;
import com.grandhunterman.dnvm.items.electronics.ItemBreadBoard;
import com.grandhunterman.dnvm.items.electronics.ItemToggleSwitch;
import com.grandhunterman.dnvm.items.ingots.*;
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
    public static final ItemDNVM ingotPoorNichrome = new ItemPNichromeIngot();
    public static final ItemDNVM ingotNickel = new ItemNickelIngot();
    public static final ItemDNVM ingotTin = new ItemTinIngot();
    public static final ItemDNVM ingotLead = new ItemLeadIngot();
    public static final ItemDNVM ingotSilver = new ItemSilverIngot();
    //Electronics
    public static final ItemDNVM breadBoard = new ItemBreadBoard();
    public static final ItemDNVM basicCapacitor = new ItemBasicCapacitor();
    public static final ItemDNVM toggleSwitch = new ItemToggleSwitch();

    public static void init(){
        //Raw Materials
        GameRegistry.registerItem(dustSalt, "dustSalt");
        GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
        GameRegistry.registerItem(ingotAluminum, "ingotAluminum");
        GameRegistry.registerItem(crystalRutile, "crystalRutile");
        GameRegistry.registerItem(crystalCryolite, "crystalCryolite");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotChrome, "ingotChrome");
        GameRegistry.registerItem(ingotPoorNichrome, "ingotPoorNichrome");
        GameRegistry.registerItem(ingotNickel, "ingotNickel");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(ingotLead, "ingotLead");
        GameRegistry.registerItem(ingotSilver, "ingotSilver");
        //Electronics
        GameRegistry.registerItem(breadBoard, "breadBoard");
        GameRegistry.registerItem(basicCapacitor, "basicCapacitor");
        GameRegistry.registerItem(toggleSwitch, "toggleSwitch");
    }
}
