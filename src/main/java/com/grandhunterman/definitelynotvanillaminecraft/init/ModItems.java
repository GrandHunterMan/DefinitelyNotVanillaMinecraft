package com.grandhunterman.definitelynotvanillaminecraft.init;

import com.grandhunterman.definitelynotvanillaminecraft.item.ItemAluminumIngot;
import com.grandhunterman.definitelynotvanillaminecraft.item.ItemDNVM;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This is a comment
 */
public class ModItems {

    public static Item aluminum_ingot;
    public static Item salt;

    public static void init(){
        aluminum_ingot = new Item().setUnlocalizedName("aluminum_ingot");
        salt = new Item().setUnlocalizedName("salt");

    }

    public static void Register(){
        GameRegistry.registerItem(aluminum_ingot, aluminum_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));

    }

    public static void registerRenders(){
        RegisterRender(aluminum_ingot);
        RegisterRender(salt);

    }

    public static void RegisterRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}

