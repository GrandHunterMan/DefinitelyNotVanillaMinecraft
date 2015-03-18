package com.grandhunterman.definitelynotvanillaminecraft;


import com.grandhunterman.definitelynotvanillaminecraft.init.ModItems;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This is a comment
 */
public class CreativeTabDNVM {
    public static final CreativeTabs DNVM_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            return ModItems.aluminum_ingot;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Definitely Not Vanilla Minecraft";
        }
    };
}