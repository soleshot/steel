package com.inwright.steel.config;


import com.inwright.steel.Steel;
import com.inwright.steel.core.utility.Logger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {
    public static Configuration configuration;
    public static Boolean testValue;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
        load();
    }

    public static void load() {
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Test configuration value").getBoolean();

        if (configuration.hasChanged()) {
            configuration.save();
        }
        Logger.info("Configuration loaded");
    }

    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Steel.ID)) {
            load();
        }
    }
}
