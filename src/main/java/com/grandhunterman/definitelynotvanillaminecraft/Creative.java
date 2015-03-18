package com.grandhunterman.definitelynotvanillaminecraft;

import com.grandhunterman.definitelynotvanillaminecraft.item.ItemDNVM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This is a comment
 */
public class Creative extends CreativeTabs {
    public Creative(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return ItemDNVM.coord_cache;
    }
}


