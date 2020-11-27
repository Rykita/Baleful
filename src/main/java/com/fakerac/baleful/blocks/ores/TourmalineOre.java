package com.fakerac.baleful.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class TourmalineOre extends OreBlock {

    public TourmalineOre() {
        super(Block.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.0F, 3.0F)
        .sound(SoundType.STONE)
        .harvestLevel(4)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool().harvestTool(ToolType.PICKAXE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
       return 3;
    }
}
