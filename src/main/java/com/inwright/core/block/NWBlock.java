package com.inwright.core.block;

import com.inwright.steel.Steel;
import com.inwright.steel.tabs.Tabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NWBlock extends Block {
    public NWBlock(String name) {
        super(Material.rock);

        this.setBlockName(Steel.ID + "_" + name);
        this.setBlockTextureName(Steel.ID + ":" + name);
        GameRegistry.registerBlock(this, name);
        this.setCreativeTab(Tabs.steelTab);
    }
}
