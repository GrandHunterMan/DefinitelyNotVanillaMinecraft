package com.grandhunterman.definitelynotvanillaminecraft;

import com.grandhunterman.definitelynotvanillaminecraft.handler.ConfigurationHandler;
import com.grandhunterman.definitelynotvanillaminecraft.init.DNVMBlocks;
import com.grandhunterman.definitelynotvanillaminecraft.init.ModItems;
import com.grandhunterman.definitelynotvanillaminecraft.proxy.IProxy;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import com.grandhunterman.definitelynotvanillaminecraft.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DefinitelyNotVanillaMinecraft
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModItems.Register();
        DNVMBlocks.init();
        DNVMBlocks.register();
        LogHelper.info("DNVM Pre-Init Complete");
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.registerRenders();
        LogHelper.info("DNVM Init Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("DNVM Post-Init Complete");

    }

}
