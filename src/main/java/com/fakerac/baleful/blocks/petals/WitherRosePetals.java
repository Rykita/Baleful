package com.fakerac.baleful.blocks.petals;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WitherRosePetals extends LeavesBlock {
    public WitherRosePetals() {
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

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        if (entityIn instanceof LivingEntity) {
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.WITHER, 40));
        }
    }
}