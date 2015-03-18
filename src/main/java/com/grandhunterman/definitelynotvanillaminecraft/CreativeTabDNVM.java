package com.grandhunterman.definitelynotvanillaminecraft;


import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMItems;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
public class CreativeTabDNVM {
    public static final CreativeTabs DNVM_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            return DNVMItems.aluminum_ingot;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Definitely Not Vanilla Minecraft";
        }
    };
}