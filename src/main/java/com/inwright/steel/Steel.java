package com.inwright.steel;


import com.inwright.core.proxy.IProxy;
import com.inwright.steel.blocks.Blocks;
import com.inwright.steel.config.Config;
import com.inwright.steel.items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Steel.ID, name = Steel.NAME, version = Steel.VERSION)
public class Steel {

    public static final String ID = "nw-steel";
    public static final String NAME = "Inwright Steel";
    public static final String VERSION = "0.1.0";
    public static final String CLIENT_PROXY = "com.inwright.steel.core.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.inwright.steel.core.proxy.ServerProxy";

    @Mod.Instance(Steel.ID)
    public static Steel instance;

    @SidedProxy(clientSide = Steel.CLIENT_PROXY, serverSide = Steel.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.init(event.getSuggestedConfigurationFile());

        Blocks.init();
        Items.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
