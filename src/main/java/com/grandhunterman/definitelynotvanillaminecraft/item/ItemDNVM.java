package com.grandhunterman.definitelynotvanillaminecraft.item;

import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * This is a comment
 */
public class ItemDNVM extends Item {
    public ItemDNVM(){
            super();
    }



    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }
}
