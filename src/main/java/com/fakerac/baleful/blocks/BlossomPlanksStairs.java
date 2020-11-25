package com.fakerac.baleful.blocks;

import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class BlossomPlanksStairs extends StairsBlock {

    public BlossomPlanksStairs() {
        super(RegistryHandler.BLOSSOM_PLANKS.get().getDefaultState(), Block.Properties.create(Material.WOOD)
        .hardnessAndResistance(2.0F,3.0F)
        .harvestLevel(0)
        .harvestTool(ToolType.AXE)
        .sound(SoundType.WOOD));
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 5;
    }
}
