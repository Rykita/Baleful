package com.fakerac.baleful.datagen.client;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Baleful.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        axisBlock((RotatedPillarBlock) RegistryHandler.BLOSSOM_STEM_STRIPPED.get());

    }
}
