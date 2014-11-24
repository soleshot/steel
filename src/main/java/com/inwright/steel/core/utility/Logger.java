package com.inwright.steel.core.utility;

import com.inwright.steel.Steel;
import cpw.mods.fml.common.FMLLog;

import org.apache.logging.log4j.Level;

public class Logger {
    public static void log(Level level, Object object) {
        FMLLog.log(Steel.NAME, level, "%s", object);
    }

    public static void error(Object object) {
        log(Level.ERROR, object);
    }

    public static void info(Object object) {
        log(Level.INFO, object);
    }
}
