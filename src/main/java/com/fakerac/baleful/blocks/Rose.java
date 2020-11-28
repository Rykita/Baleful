package com.fakerac.baleful.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class Rose extends BushBlock {

    protected static final VoxelShape NORMAL = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 9.0D, 10.0D);


    public AbstractBlock.OffsetType getOffsetType() {
        return AbstractBlock.OffsetType.XZ;
    }

    public Rose() {
        super(Block.Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .notSolid()
                .doesNotBlockMovement()
                .hardnessAndResistance(0.1F, 0.1F));
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face)  {
        return 60;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {
        Vector3d vector3d = state.getOffset(worldIn, pos);
        return NORMAL.withOffset(vector3d.x, vector3d.y, vector3d.z);
    }
}