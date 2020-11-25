package com.fakerac.baleful.blocks.petals;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CornflowerPetals extends LeavesBlock {
    public CornflowerPetals() {
        super(Block.Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.15F, 0.15F)
                .sound(SoundType.PLANT)
                .notSolid());
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 30;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face)  {
        return 30;
    }
}
