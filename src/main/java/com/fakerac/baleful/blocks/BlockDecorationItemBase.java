package com.fakerac.baleful.blocks;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.util.BalefulItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockDecorationItemBase extends BlockItem {

    public BlockDecorationItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(BalefulItemGroups.BALEFUL_DECORATIONS));
    }
}