package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMBlocks;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
public class DNVMSmelting {
    public static void smelting(){
        GameRegistry.addSmelting(DNVMBlocks.copper_ore, new ItemStack(DNVMItems.copper_ingot), 2f);
        GameRegistry.addSmelting(DNVMBlocks.silver_ore, new ItemStack(DNVMItems.silver_ingot), 2f);
        GameRegistry.addSmelting(DNVMBlocks.lead_ore, new ItemStack(DNVMItems.lead_ingot), 2f);
        GameRegistry.addSmelting(DNVMBlocks.tin_ore, new ItemStack(DNVMItems.tin_ingot), 2f);
        GameRegistry.addSmelting(DNVMBlocks.nickel_ore, new ItemStack(DNVMItems.nickel_ingot), 2f);
        GameRegistry.addSmelting(DNVMBlocks.chrome_ore, new ItemStack(DNVMItems.chrome_ingot), 2f);
    }
}
