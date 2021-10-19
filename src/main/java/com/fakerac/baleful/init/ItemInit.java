package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Baleful.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Registry entries down below:

    public static final RegistryObject<Item> RHODONITE_BLOCK_ITEM = ITEMS.register("rhodonite_block", () -> new BlockItem(BlockInit.RHODONITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RHODONITE_ORE_ITEM = ITEMS.register("rhodonite_ore", () -> new BlockItem(BlockInit.RHODONITE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RHODONITE_DEEPSLATE_ORE_ITEM = ITEMS.register("rhodonite_deepslate_ore", () -> new BlockItem(BlockInit.RHODONITE_DEEPSLATE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AZURITE_BLOCK_ITEM = ITEMS.register("azurite_block", () -> new BlockItem(BlockInit.AZURITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AZURITE_ORE_ITEM = ITEMS.register("azurite_ore", () -> new BlockItem(BlockInit.AZURITE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AZURITE_DEEPSLATE_ORE_ITEM = ITEMS.register("azurite_deepslate_ore", () -> new BlockItem(BlockInit.AZURITE_DEEPSLATE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> JADE_BLOCK_ITEM = ITEMS.register("jade_block", () -> new BlockItem(BlockInit.JADE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> JADE_ORE_ITEM = ITEMS.register("jade_ore", () -> new BlockItem(BlockInit.JADE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> JADE_DEEPSLATE_ORE_ITEM = ITEMS.register("jade_deepslate_ore", () -> new BlockItem(BlockInit.JADE_DEEPSLATE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
