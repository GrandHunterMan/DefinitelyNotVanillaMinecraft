package com.grandhunterman.definitelynotvanillaminecraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.ca)
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class DNVMRecipes {
    public static void crafting() {
        //Blocks
        GameRegistry.addShapedRecipe(new ItemStack(DNVMBlocks.titanium_block), new Object[]{"iii", "iii", "iii", 'i', DNVMItems.titanium_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(DNVMBlocks.aluminum_block), new Object[]{"iii", "iii", "iii", 'i', DNVMItems.aluminum_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(DNVMBlocks.cryolite_block), new Object[]{"iii", "iii", "iii", 'i', DNVMItems.cryolite_crystal});
        GameRegistry.addShapedRecipe(new ItemStack(DNVMBlocks.rutile_block), new Object[]{"iii", "iii", "iii", 'i', DNVMItems.rutile_crystal});
        //Ingots
        GameRegistry.addShapelessRecipe(new ItemStack(DNVMItems.titanium_ingot, 9), DNVMBlocks.titanium_block);
        GameRegistry.addShapelessRecipe(new ItemStack(DNVMItems.aluminum_ingot, 9), DNVMBlocks.aluminum_block);
        GameRegistry.addShapelessRecipe(new ItemStack(DNVMItems.cryolite_crystal, 9), DNVMBlocks.cryolite_block);
        GameRegistry.addShapelessRecipe(new ItemStack(DNVMItems.rutile_crystal, 9), DNVMBlocks.rutile_block);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.coaly_iron_ingot, 8), new Object[]{"iii", "iii", "iic", 'i', "ingotIron", 'c', Items.coal}));
        //Electronics
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.basic_resistor), new Object[]{"iii", "csc", "iii", 'i', DNVMItems.low_nichrome_wire, 'c', "ingotCopper", 's', "stickWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.basic_capacitor), new Object[]{"sws", "sws", "c c", 's', "ingotSilver", 'w', "plankWood", 'c', "ingotCopper"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.basic_switch), new Object[]{" s ", "wxw", "c c", 'x', "ingotSilver", 'w', "plankWood", 'c', "ingotCopper", 's', "stickWood"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(DNVMItems.improvised_circuit_board), DNVMItems.bread_board, DNVMItems.basic_capacitor, DNVMItems.basic_capacitor, DNVMItems.basic_capacitor, DNVMItems.basic_resistor, DNVMItems.basic_resistor, DNVMItems.basic_switch, DNVMItems.basic_plug));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.basic_plug), new Object[]{"wcw", "ccc", "s s", 'w', "plankWood", 'c', "ingotCopper", 's', "ingotSilver"}));
        //Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.bread_board), new Object[]{"pp ", "pps", "pp ", 'p', "plankWood", 's', "stickWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.standard_machine_frame), new Object[]{"sss", "s s", "sss", 's', "ingotSteel"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(DNVMItems.low_nichrome_ingot, 9), "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotNickel", "ingotChromium", "ingotChromium"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMItems.low_nichrome_wire, 32), new Object[]{"iii", "i i", "iii", 'i', DNVMItems.low_nichrome_ingot}));
        //Basic Machines
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DNVMBlocks.drill_press), new Object[]{"isi", "tmt", "ici", 'm', "machineFrame", 'i', "ingotIron", 'c', 's', Items.stick, 't', "ingotTin", DNVMItems.improvised_circuit_board}));
    }

}