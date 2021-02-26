package com.fakerac.baleful.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ArdoriumBlock extends Block {
    public ArdoriumBlock() {
        super(Block.Properties.create(Material.IRON)
        .hardnessAndResistance(50, 3600000)
        .harvestLevel(4)
        .harvestTool(ToolType.PICKAXE)
        .sound(SoundType.NETHERITE)
        .setRequiresTool().harvestTool(ToolType.PICKAXE));
    }


}
