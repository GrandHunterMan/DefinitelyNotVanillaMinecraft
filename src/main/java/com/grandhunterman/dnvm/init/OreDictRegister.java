package com.grandhunterman.dnvm.init;

import static net.minecraftforge.oredict.OreDictionary.registerOre;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class OreDictRegister {
    public static void Register(){
        registerOre("ingotTitanium", ItemInit.ingotTitanium);
        registerOre("ingotAluminum", ItemInit.ingotAluminum);
        registerOre("ingotNickel", ItemInit.ingotNickel);
        registerOre("ingotChromium", ItemInit.ingotChrome);
        registerOre("ingotCopper", ItemInit.ingotCopper);
        registerOre("ingotTin", ItemInit.ingotTin);
        registerOre("ingotLead", ItemInit.ingotLead);
        registerOre("ingotSilver", ItemInit.ingotSilver);

    }
}
