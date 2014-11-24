package com.inwright.core.item;

import com.inwright.steel.Steel;
import com.inwright.steel.tabs.Tabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class NWItem extends Item {
    public NWItem(String name) {
        super();

        this.setUnlocalizedName(Steel.ID + "_" + name);
        this.setTextureName(Steel.ID + ":" + name);
        this.setCreativeTab(Tabs.steelTab);
        GameRegistry.registerItem(this, name);
    }
}
