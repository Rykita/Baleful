package com.fakerac.baleful.blocks;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockDecorationItemBase extends BlockItem {

    public BlockDecorationItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(BalefulItemGroups.BALEFUL_DECORATIONS));
    }
}