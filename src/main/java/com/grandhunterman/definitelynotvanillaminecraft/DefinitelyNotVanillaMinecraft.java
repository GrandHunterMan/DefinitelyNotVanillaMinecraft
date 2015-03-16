package com.grandhunterman.definitelynotvanillaminecraft;

import com.grandhunterman.definitelynotvanillaminecraft.configuration.ConfigurationHandler;
import com.grandhunterman.definitelynotvanillaminecraft.proxy.IProxy;
import com.grandhunterman.definitelynotvanillaminecraft.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class DefinitelyNotVanillaMinecraft
{

    @SidedProxy(clientSide = "com.grandhunterman.definitelynotvanillaminecraft.proxy.ClientProxy", serverSide = "com.grandhunterman.definitelynotvanillaminecraft.proxy.ServerProxy")
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }




}
