package com.inwright.steel.tabs;

import com.inwright.steel.Steel;
import com.inwright.steel.items.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs {
    public static final CreativeTabs steelTab = new CreativeTabs(Steel.ID) {
        @Override
        public Item getTabIconItem() {
            return Items.steelRod;
        }
    };
}
