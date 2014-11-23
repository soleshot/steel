package com.inwright.steel;


import com.inwright.steel.blocks.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Steel.ID, name = Steel.NAME, version = Steel.VERSION)
public class Steel {

    public static final String ID = "nw-steel";
    public static final String NAME = "Inwright Steel";
    public static final String VERSION = "0.1.0";

    @Mod.Instance(Steel.ID)
    public static Steel instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Blocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
