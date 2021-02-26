package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;

public class ObsidianCrossbow extends CrossbowItem {
    public ObsidianCrossbow() {
        super(new Item.Properties());
    }

    @Override
    public boolean isCrossbow(ItemStack stack) {
        return true;
    }
}
