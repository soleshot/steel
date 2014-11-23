package com.inwright.steel.blocks;

import com.inwright.steel.Steel;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Sysop on 11/23/2014.
 */
public class SteelBlock extends Block {
    private String name = "Steel";

    public SteelBlock() {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(Steel.ID + "_" + name);
        this.setBlockTextureName(Steel.ID + ":" + name);
        GameRegistry.registerBlock(this, name);
    }
}
