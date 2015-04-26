package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.item.*;
import com.grandhunterman.definitelynotvanillaminecraft.item.minerals.*;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.ca)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class DNVMItems {

    //ingots
    public static Item aluminum_ingot;
    public static Item titanium_ingot;
    public static Item copper_ingot;
    public static Item tin_ingot;
    public static Item silver_ingot;
    public static Item lead_ingot;
    public static Item nickel_ingot;
    public static Item chrome_ingot;
    public static Item coaly_iron_ingot;
    public static Item steel_ingot;
    public static Item low_nichrome_ingot;

    //Minerals
    public static Item salt;
    public static Item cryolite_crystal;
    public static Item rutile_crystal;

    //Other
    public static Item improvised_circuit_board;
    public static Item basic_switch;
    public static Item basic_capacitor;
    public static Item basic_resistor;
    public static Item basic_plug;
    public static Item low_nichrome_wire;
    public static Item bread_board;
    public static Item standard_machine_frame;
    public static Item gold_pan;
    public static Item aluminum_foil;
    public static Item copper_foil;
    //food
    public static Item g;


    public static void init(){
        //Ingots
        aluminum_ingot = new ItemAluminumIngot().setUnlocalizedName("aluminum_ingot");
        titanium_ingot = new ItemTitaniumIngot().setUnlocalizedName("titanium_ingot");
        copper_ingot = new ItemCopperIngot().setUnlocalizedName("copper_ingot");
        tin_ingot = new ItemTinIngot().setUnlocalizedName("tin_ingot");
        silver_ingot = new ItemSilverIngot().setUnlocalizedName("silver_ingot");
        lead_ingot = new ItemLeadIngot().setUnlocalizedName("lead_ingot");
        nickel_ingot = new ItemNickelIngot().setUnlocalizedName("nickel_ingot");
        chrome_ingot = new ItemChromiumIngot().setUnlocalizedName("chrome_ingot");
        coaly_iron_ingot = new ItemCoalyIron().setUnlocalizedName("coaly_iron_ingot");
        steel_ingot = new ItemSteel().setUnlocalizedName("steel_ingot");
        low_nichrome_ingot = new ItemLowNichromeIngot().setUnlocalizedName("low_nichrome_ingot");

        //Minerals
        salt = new ItemSalt().setUnlocalizedName("salt");
        cryolite_crystal = new ItemCryoliteCrystal().setUnlocalizedName("cryolite_crystal");
        rutile_crystal = new ItemRutileCrystal().setUnlocalizedName("rutile_crystal");

        //Other
        standard_machine_frame = new ItemStandardMachineFrame().setUnlocalizedName("standard_machine_frame");
        bread_board = new ItemBreadBoard().setUnlocalizedName("bread_board");
        low_nichrome_wire = new ItemLowNichromeWire().setUnlocalizedName("low_nichrome_wire");
        basic_resistor = new ItemBasicResistor().setUnlocalizedName("basic_resistor");
        basic_capacitor = new ItemBasicCapacitor().setUnlocalizedName("basic_capacitor");
        basic_switch = new ItemBasicSwitch().setUnlocalizedName("basic_switch");
        basic_plug = new ItemBasicPlug().setUnlocalizedName("basic_plug");
        improvised_circuit_board = new ItemImprovisedCircuitBoard().setUnlocalizedName("improvised_circuit_board");
        gold_pan = new ItemGoldPan().setUnlocalizedName("gold_pan");
        aluminum_foil = new ItemAluminumFoil().setUnlocalizedName("aluminum_foil");
        copper_foil = new ItemCopperFoil().setUnlocalizedName("copper_foil");
        //food
    }

    public static void Register(){
        GameRegistry.registerItem(aluminum_ingot, aluminum_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(titanium_ingot, titanium_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(tin_ingot, tin_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(silver_ingot, silver_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lead_ingot, lead_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(nickel_ingot, nickel_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(chrome_ingot, chrome_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(coaly_iron_ingot, coaly_iron_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steel_ingot, steel_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(low_nichrome_ingot, low_nichrome_ingot.getUnlocalizedName().substring(5));

        //Minerals
        GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cryolite_crystal, cryolite_crystal.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rutile_crystal, rutile_crystal.getUnlocalizedName().substring(5));

        //Other
        GameRegistry.registerItem(standard_machine_frame, standard_machine_frame.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bread_board, bread_board.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(low_nichrome_wire, low_nichrome_wire.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(basic_resistor, basic_resistor.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(basic_capacitor, basic_capacitor.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(basic_switch, basic_switch.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(basic_plug, basic_plug.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(improvised_circuit_board, improvised_circuit_board.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(gold_pan, gold_pan.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(aluminum_foil, aluminum_foil.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_foil, copper_foil.getUnlocalizedName().substring(5));
        //food
    }

    public static void registerRenders(){
       //Ingots
        RegisterRender(aluminum_ingot);
        RegisterRender(titanium_ingot);
        RegisterRender(copper_ingot);
        RegisterRender(tin_ingot);
        RegisterRender(silver_ingot);
        RegisterRender(lead_ingot);
        RegisterRender(nickel_ingot);
        RegisterRender(chrome_ingot);
        RegisterRender(coaly_iron_ingot);
        RegisterRender(steel_ingot);
        RegisterRender(low_nichrome_ingot);

        //Minerals
        RegisterRender(salt);
        RegisterRender(cryolite_crystal);
        RegisterRender(rutile_crystal);

        //Other
        RegisterRender(standard_machine_frame);
        RegisterRender(bread_board);
        RegisterRender(low_nichrome_wire);
        RegisterRender(basic_resistor);
        RegisterRender(basic_capacitor);
        RegisterRender(basic_switch);
        RegisterRender(basic_plug);
        RegisterRender(improvised_circuit_board);
        RegisterRender(gold_pan);
        RegisterRender(aluminum_foil);
        RegisterRender(copper_foil);
        //food


    }

    public static void RegisterRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}

