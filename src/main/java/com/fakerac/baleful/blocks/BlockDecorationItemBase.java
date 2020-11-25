package com.fakerac.baleful.blocks;

import com.fakerac.baleful.Baleful;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockDecorationItemBase extends BlockItem {

    public BlockDecorationItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(Baleful.BALEFUL_DECORATIONS));
    }
}