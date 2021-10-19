package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Baleful.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Registry entries down below:

    public static final RegistryObject<Block> RHODONITE_BLOCK = BLOCKS.register("rhodonite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RHODONITE_ORE = BLOCKS.register("rhodonite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHODONITE_DEEPSLATE_ORE = BLOCKS.register("rhodonite_deepslate_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AZURITE_BLOCK = BLOCKS.register("azurite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AZURITE_ORE = BLOCKS.register("azurite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AZURITE_DEEPSLATE_ORE = BLOCKS.register("azurite_deepslate_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JADE_BLOCK = BLOCKS.register("jade_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.METAL)));
    public static final RegistryObject<Block> JADE_ORE = BLOCKS.register("jade_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JADE_DEEPSLATE_ORE = BLOCKS.register("jade_deepslate_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)));
}
