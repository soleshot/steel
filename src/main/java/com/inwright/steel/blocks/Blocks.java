package com.inwright.steel.blocks;

import net.minecraft.block.Block;

/**
 * Created by Sysop on 11/23/2014.
 */
public final class Blocks {
    public static Block steelBlock;

    public static void init() {
        steelBlock = new SteelBlock();
    }
}
