package com.grandhunterman.definitelynotvanillaminecraft.blocks;

import com.grandhunterman.definitelynotvanillaminecraft.CreativeTabDNVM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * This is a comment
 */
public class BlockDNVM extends Block {
    public BlockDNVM(Material materialIn) {
        super(materialIn);
        this.setCreativeTab(CreativeTabDNVM.DNVM_TAB);
    }
}
