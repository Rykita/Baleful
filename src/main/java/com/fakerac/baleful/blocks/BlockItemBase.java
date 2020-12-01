package com.fakerac.baleful.blocks;

import com.fakerac.baleful.util.BalefulItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(BalefulItemGroups.BALEFUL_BUILDING_BLOCKS));
    }
}
