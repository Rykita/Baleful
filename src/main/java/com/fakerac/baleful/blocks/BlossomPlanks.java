package com.fakerac.baleful.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class BlossomPlanks extends Block {

    public BlossomPlanks() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f,3.0f)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD)
                .harvestLevel(0));
    }
    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face)  {
        return 5;
    }
}
