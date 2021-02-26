package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.blocks.BlockDecorationItemBase;
import com.fakerac.baleful.blocks.BlockItemBase;
import com.fakerac.baleful.blocks.BlockRedstoneItemBase;
import com.fakerac.baleful.items.ItemEnchantGlintUncommon;
import com.fakerac.baleful.tools.BalefulItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Baleful.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> STAR_PIECES = ITEMS.register("star_pieces", ItemEnchantGlintUncommon::new);
    public static final RegistryObject<Item> STARDUST = ITEMS.register("stardust", ItemEnchantGlintUncommon::new);
    public static final RegistryObject<Item> UNSTABLE_ARDORIUM_INGOT = ITEMS.register("unstable_ardorium_ingot", () -> new Item(new Item.Properties().group(BalefulItemGroups.BALEFUL_MISCELLANEOUS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<Item> ARDORIUM_INGOT = ITEMS.register("ardorium_ingot", () -> new Item(new Item.Properties().group(BalefulItemGroups.BALEFUL_MISCELLANEOUS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<Item> TOURMALINE_SHARDS =  ITEMS.register("tourmaline_shards", () -> new Item(new Item.Properties().group(BalefulItemGroups.BALEFUL_MISCELLANEOUS)));
    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline", () -> new Item(new Item.Properties().group(BalefulItemGroups.BALEFUL_MISCELLANEOUS)));

    //Tools
    public static final RegistryObject<ShovelItem> ARDORIUM_SHOVEL = ITEMS.register("ardorium_shovel", () -> new ShovelItem(BalefulItemTier.ARDORIUM, 6, -3.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<PickaxeItem> ARDORIUM_PICKAXE = ITEMS.register("ardorium_pickaxe", () -> new PickaxeItem(BalefulItemTier.ARDORIUM, 6, -2.8F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<AxeItem> ARDORIUM_AXE = ITEMS.register("ardorium_axe", () -> new AxeItem(BalefulItemTier.ARDORIUM, 10, -3.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<HoeItem> ARDORIUM_HOE = ITEMS.register("ardorium_hoe", () -> new HoeItem(BalefulItemTier.ARDORIUM, 1, 0.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ShovelItem> NYDARYX_SHOVEL = ITEMS.register("nydaryx_shovel", () -> new ShovelItem(BalefulItemTier.NYDARYX, 7, -3.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.EPIC).isImmuneToFire()));
    public static final RegistryObject<PickaxeItem> NYDARYX_PICKAXE = ITEMS.register("nydaryx_pickaxe", () -> new PickaxeItem(BalefulItemTier.NYDARYX, 7, -2.8F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.EPIC).isImmuneToFire()));
    public static final RegistryObject<AxeItem> NYDARYX_AXE = ITEMS.register("nydaryx_axe", () -> new AxeItem(BalefulItemTier.NYDARYX, 11, -3.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.EPIC).isImmuneToFire()));
    public static final RegistryObject<HoeItem> NYDARYX_HOE = ITEMS.register("nydaryx_hoe", () -> new HoeItem(BalefulItemTier.NYDARYX, 1, 0.0F, new Item.Properties().group(BalefulItemGroups.BALEFUL_TOOLS).rarity(Rarity.EPIC).isImmuneToFire()));

    //Block Items
    public static final RegistryObject<Item> BLOSSOM_PLANKS_ITEM = ITEMS.register("blossom_planks", () -> new BlockItemBase(BlockInit.BLOSSOM_PLANKS.get()));
    public static final RegistryObject<Item> BLOSSOM_STEM_ITEM = ITEMS.register("blossom_stem", () -> new BlockItemBase(BlockInit.BLOSSOM_STEM.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_STAIRS_ITEM = ITEMS.register("blossom_planks_stairs", () -> new BlockItemBase(BlockInit.BLOSSOM_PLANKS_STAIRS.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_SLAB_ITEM = ITEMS.register("blossom_planks_slab", () -> new BlockItemBase(BlockInit.BLOSSOM_PLANKS_SLAB.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_FENCE_ITEM = ITEMS.register("blossom_planks_fence", () -> new BlockDecorationItemBase(BlockInit.BLOSSOM_PLANKS_FENCE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_FENCEGATE_ITEM = ITEMS.register("blossom_planks_fencegate", () -> new BlockRedstoneItemBase(BlockInit.BLOSSOM_PLANKS_FENCEGATE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_BUTTON_ITEM = ITEMS.register("blossom_planks_button", () -> new BlockRedstoneItemBase(BlockInit.BLOSSOM_PLANKS_BUTTON.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_PRESSURE_PLATE_ITEM = ITEMS.register("blossom_planks_pressure_plate", () -> new BlockRedstoneItemBase(BlockInit.BLOSSOM_PLANKS_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_DOOR_ITEM = ITEMS.register("blossom_planks_door", () -> new BlockRedstoneItemBase(BlockInit.BLOSSOM_PLANKS_DOOR.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_TRAPDOOR_ITEM = ITEMS.register("blossom_planks_trapdoor", () -> new BlockRedstoneItemBase(BlockInit.BLOSSOM_PLANKS_TRAPDOOR.get()));
    public static final RegistryObject<Item> BLOSSOM_STEM_STRIPPED_ITEM = ITEMS.register("blossom_stem_stripped", () -> new BlockItemBase(BlockInit.BLOSSOM_STEM_STRIPPED.get()));
    public static final RegistryObject<Item> BLOSSOM_WOOD_ITEM = ITEMS.register("blossom_wood", () -> new BlockItemBase(BlockInit.BLOSSOM_WOOD.get()));
    public static final RegistryObject<Item> BLOSSOM_WOOD_STRIPPED_ITEM = ITEMS.register("blossom_wood_stripped", () -> new BlockItemBase(BlockInit.BLOSSOM_WOOD_STRIPPED.get()));
    public static final RegistryObject<Item> ARDORIUM_BLOCK_ITEM = ITEMS.register("ardorium_block", () -> new BlockItemBase(BlockInit.ARDORIUM_BLOCK.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_PETALS_ITEM = ITEMS.register("blue_orchid_petals", () -> new BlockDecorationItemBase(BlockInit.BLUE_ORCHID_PETALS.get()));
    public static final RegistryObject<Item> BUTTERCUP_FLOWER_ITEM = ITEMS.register("buttercup_flower", () -> new BlockDecorationItemBase(BlockInit.BUTTERCUP_FLOWER.get()));
    public static final RegistryObject<Item> ALLIUM_PETALS_ITEM = ITEMS.register("allium_petals", () -> new BlockDecorationItemBase(BlockInit.ALLIUM_PETALS.get()));
    public static final RegistryObject<Item> AZURE_BLUET_PETALS_ITEM = ITEMS.register("azure_bluet_petals", () -> new BlockDecorationItemBase(BlockInit.AZURE_BLUET_PETALS.get()));
    public static final RegistryObject<Item> BUTTERCUP_PETALS_ITEM = ITEMS.register("buttercup_petals", () -> new BlockDecorationItemBase(BlockInit.BUTTERCUP_PETALS.get()));
    public static final RegistryObject<Item> CORNFLOWER_PETALS_ITEM = ITEMS.register("cornflower_petals", () -> new BlockDecorationItemBase(BlockInit.CORNFLOWER_PETALS.get()));
    public static final RegistryObject<Item> DANDELION_PETALS_ITEM = ITEMS.register("dandelion_petals", () -> new BlockDecorationItemBase(BlockInit.DANDELION_PETALS.get()));
    public static final RegistryObject<Item> LILYOFTHEVALLEY_PETALS_ITEM = ITEMS.register("lilyofthevalley_petals", () -> new BlockDecorationItemBase(BlockInit.LILYOFTHEVALLEY_PETALS.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_PETALS_ITEM = ITEMS.register("oxeye_daisy_petals", () -> new BlockDecorationItemBase(BlockInit.OXEYE_DAISY_PETALS.get()));
    public static final RegistryObject<Item> PAEONIA_PETALS_ITEM = ITEMS.register("paeonia_petals", () -> new BlockDecorationItemBase(BlockInit.PAEONIA_PETALS.get()));
    public static final RegistryObject<Item> POPPY_PETALS_ITEM = ITEMS.register("poppy_petals", () -> new BlockDecorationItemBase(BlockInit.POPPY_PETALS.get()));
    public static final RegistryObject<Item> PINK_TULIP_PETALS_ITEM = ITEMS.register("pink_tulip_petals", () -> new BlockDecorationItemBase(BlockInit.PINK_TULIP_PETALS.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_PETALS_ITEM = ITEMS.register("orange_tulip_petals", () -> new BlockDecorationItemBase(BlockInit.ORANGE_TULIP_PETALS.get()));
    public static final RegistryObject<Item> RED_TULIP_PETALS_ITEM = ITEMS.register("red_tulip_petals", () -> new BlockDecorationItemBase(BlockInit.RED_TULIP_PETALS.get()));
    public static final RegistryObject<Item> ROSE_PETALS_ITEM = ITEMS.register("rose_petals", () -> new BlockDecorationItemBase(BlockInit.ROSE_PETALS.get()));
    public static final RegistryObject<Item> SYRINGA_PETALS_ITEM = ITEMS.register("syringa_petals", () -> new BlockDecorationItemBase(BlockInit.SYRINGA_PETALS.get()));
    public static final RegistryObject<Item> WHITE_TULIP_PETALS_ITEM = ITEMS.register("white_tulip_petals", () -> new BlockDecorationItemBase(BlockInit.WHITE_TULIP_PETALS.get()));
    public static final RegistryObject<Item> WITHER_ROSE_PETALS_ITEM = ITEMS.register("wither_rose_petals", () -> new BlockDecorationItemBase(BlockInit.WITHER_ROSE_PETALS.get()));
    public static final RegistryObject<Item> TOURMALINE_ORE_ITEM = ITEMS.register("tourmaline_ore", () -> new BlockItemBase(BlockInit.TOURMALINE_ORE.get()));
    public static final RegistryObject<Item> FLORAL_SPROUTS_ITEM = ITEMS.register("floral_sprouts", () -> new BlockDecorationItemBase(BlockInit.FLORAL_SPROUTS.get()));
    public static final RegistryObject<Item> PAEONIA_ITEM = ITEMS.register("paeonia", () -> new BlockDecorationItemBase(BlockInit.PAEONIA.get()));
    public static final RegistryObject<Item> ROSE_ITEM = ITEMS.register("rose", () -> new BlockDecorationItemBase(BlockInit.ROSE.get()));
    public static final RegistryObject<Item> AQUA_HYDRANGEA_ITEM = ITEMS.register("aqua_hydrangea", () -> new BlockDecorationItemBase(BlockInit.AQUA_HYDRANGEA.get()));
    public static final RegistryObject<Item> SYRINGA_ITEM = ITEMS.register("syringa", () -> new BlockDecorationItemBase(BlockInit.SYRINGA.get()));
    public static final RegistryObject<Item> NYDARYX_BLOCK_ITEM = ITEMS.register("nydaryx_block", () -> new BlockItemBase(BlockInit.NYDARYX_BLOCK.get()));
    public static final RegistryObject<Item> TRINITITE_ITEM = ITEMS.register("trinitite", () -> new BlockItemBase(BlockInit.TRINITITE.get()));
}
