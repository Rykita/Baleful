package com.fakerac.baleful.world.gen;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WorldGen {

    public static final DeferredRegister<Feature<?>> worldGenFeature = DeferredRegister.create(ForgeRegistries.FEATURES, Baleful.MOD_ID);


    public static ConfiguredFeature<?, ?> TOURMALINE_ORE;

    public static void addConfigFeatures(RegistryEvent.Register<Feature<?>> event) {
        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;
        TOURMALINE_ORE = Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.TOURMALINE_ORE.get().getDefaultState(), 10))
                .range(64).square();


        Registry.register(registry, new ResourceLocation("baleful:tourmaline_ore"), TOURMALINE_ORE);
    }

    public static void handleWorldGen(BiomeLoadingEvent event) {
        RegistryKey<Biome> biome = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        if(event.getCategory() == Biome.Category.NETHER
                || event.getCategory() == Biome.Category.THEEND
                || BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID)) return;

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, TOURMALINE_ORE);
    }
}
