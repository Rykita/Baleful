package com.fakerac.baleful.datagen;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.datagen.client.ModBlockStateProvider;
import com.fakerac.baleful.datagen.client.ModItemModelProvider;
import com.fakerac.baleful.datagen.server.Recipes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Baleful.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeClient()) {

        gen.addProvider(new ModItemModelProvider(gen, event.getExistingFileHelper()));
        gen.addProvider(new ModBlockStateProvider(gen, event.getExistingFileHelper()));

    }
        if (event.includeServer()) {
        gen.addProvider(new Recipes(event.getGenerator()));


        }
    }
}
