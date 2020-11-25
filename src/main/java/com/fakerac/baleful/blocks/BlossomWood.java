package com.fakerac.baleful.blocks;

import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlossomWood extends RotatedPillarBlock {

    public BlossomWood() {
        super(Block.Properties.create(Material.WOOD)
        .hardnessAndResistance(2.0F, 3.0F)
        .harvestTool(ToolType.AXE)
        .harvestLevel(0)
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

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {
        if (toolType == ToolType.AXE) {
            return RegistryHandler.BLOSSOM_WOOD_STRIPPED.get().getDefaultState().with(AXIS, state.get(AXIS));
        }
        return super.getToolModifiedState(state, world, pos, player, stack, toolType);
    }
}
