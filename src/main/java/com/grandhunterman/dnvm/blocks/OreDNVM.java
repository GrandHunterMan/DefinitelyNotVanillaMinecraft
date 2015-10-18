package com.grandhunterman.dnvm.blocks;

import com.grandhunterman.dnvm.handler.CreativeTab;
import com.grandhunterman.dnvm.reference.General;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class OreDNVM extends Block {
    public OreDNVM(Material material){
        super(material);
    }
    public OreDNVM(){
        this(Material.rock);
        this.setCreativeTab(CreativeTab.DNVM_GENERAL);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", General.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
