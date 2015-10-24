package com.grandhunterman.dnvm.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class BlockActivator extends BlockDNVM {
    public BlockActivator() {

        super();
        setBlockName("blockActivator");
    }

         // Called upon block activation (right click on the block.)
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ) {
       world.playSoundEffect(x, y, z, "dnvm:swooshActivate", 1.0F, 1.0F);

        return true;
    }
}

