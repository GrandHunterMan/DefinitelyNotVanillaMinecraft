package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.grandhunterman.definitelynotvanillaminecraft.blocks.BlockDNVM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This is a comment
 */
public class DNVMBlocks {

    public static Block aluminum_block;

    public static void init(){
        aluminum_block = new BlockDNVM(Material.iron).setUnlocalizedName("aluminum_block");

    }

    public static void register(){

        GameRegistry.registerBlock(aluminum_block, aluminum_block.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(aluminum_block);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
