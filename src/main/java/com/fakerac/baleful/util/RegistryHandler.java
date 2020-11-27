package com.fakerac.baleful.util;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.armor.BalefulArmorMaterial;
import com.fakerac.baleful.blocks.*;
import com.fakerac.baleful.blocks.ores.TourmalineOre;
import com.fakerac.baleful.blocks.petals.*;
import com.fakerac.baleful.items.ItemEnchantGlintUncommon;
import com.fakerac.baleful.tools.BalefulItemTier;
import com.fakerac.baleful.tools.Murasama;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Baleful.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Baleful.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    //Items
    public static final RegistryObject<Item> STAR_PIECES = ITEMS.register("star_pieces", ItemEnchantGlintUncommon::new);
    public static final RegistryObject<Item> STARDUST = ITEMS.register("stardust", ItemEnchantGlintUncommon::new);
    public static final RegistryObject<Item> UNSTABLE_ARDORIUM_INGOT = ITEMS.register("unstable_ardorium_ingot", () -> new Item(new Item.Properties().group(Baleful.BALEFUL_MISCELLANEOUS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<Item> ARDORIUM_INGOT = ITEMS.register("ardorium_ingot", () -> new Item(new Item.Properties().group(Baleful.BALEFUL_MISCELLANEOUS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<Item> MINOR_TOURMALINE =  ITEMS.register("minor_tourmaline", () -> new Item(new Item.Properties().group(Baleful.BALEFUL_MISCELLANEOUS)));
    public static final RegistryObject<Item> MODEST_TOURMALINE = ITEMS.register("modest_tourmaline", () -> new Item(new Item.Properties().group(Baleful.BALEFUL_MISCELLANEOUS)));
    public static final RegistryObject<Item> MAJOR_TOURMALINE = ITEMS.register("major_tourmaline", () -> new Item(new Item.Properties().group(Baleful.BALEFUL_MISCELLANEOUS)));



    //Tools
    public static final RegistryObject<SwordItem> MURASAMA = ITEMS.register("murasama", Murasama::new);
    public static final RegistryObject<SwordItem> ARDORIUM_SWORD = ITEMS.register("ardorium_sword", () -> new SwordItem(BalefulItemTier.ARDORIUM, 8, -2.4F, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<ShovelItem> ARDORIUM_SHOVEL = ITEMS.register("ardorium_shovel", () -> new ShovelItem(BalefulItemTier.ARDORIUM, 6, -3F, new Item.Properties().group(Baleful.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<PickaxeItem> ARDORIUM_PICKAXE = ITEMS.register("ardorium_pickaxe", () -> new PickaxeItem(BalefulItemTier.ARDORIUM, 6, -2.8F, new Item.Properties().group(Baleful.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<AxeItem> ARDORIUM_AXE = ITEMS.register("ardorium_axe", () -> new AxeItem(BalefulItemTier.ARDORIUM, 10, -3F, new Item.Properties().group(Baleful.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<HoeItem> ARDORIUM_HOE = ITEMS.register("ardorium_hoe", () -> new HoeItem(BalefulItemTier.ARDORIUM, 1, 0F, new Item.Properties().group(Baleful.BALEFUL_TOOLS).rarity(Rarity.UNCOMMON).isImmuneToFire()));



    //Armor
    public static final RegistryObject<ArmorItem> ARDORIUM_HELMET = ITEMS.register("ardorium_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.HEAD, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ArmorItem> ARDORIUM_CHESTPLATE = ITEMS.register("ardorium_chestplate", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.CHEST, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ArmorItem> ARDORIUM_LEGGINGS = ITEMS.register("ardorium_leggings", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.LEGS, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));


    public static final RegistryObject<ArmorItem> ARDORIUM_BOOTS = ITEMS.register("ardorium_boots", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.FEET, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));


    //Masks
    public static final RegistryObject<ArmorItem> MARQEYE_HELMET = ITEMS.register("marqeye_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.MARQEYE, EquipmentSlotType.HEAD, new Item.Properties().group(Baleful.MASKS).rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> SEAOFPIXELS_HELMET = ITEMS.register("sop_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.SEAOFPIXELS, EquipmentSlotType.HEAD, new Item.Properties().group(Baleful.MASKS).rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> FAKERAC_HELMET = ITEMS.register("fakerac_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.FAKERAC, EquipmentSlotType.HEAD, new Item.Properties().group(Baleful.MASKS).rarity(Rarity.EPIC)));



    /*Blocks
    * Some blocks use classes, some don't, it's kind of inconsistent but it just works TM
    * I might work on organizing these things more in the future
    * Although most of them use their own classes in case I need to override something.
    */
    public static final RegistryObject<Block> BLOSSOM_PLANKS = BLOCKS.register("blossom_planks", BlossomPlanks::new );
    public static final RegistryObject<Block> BLOSSOM_STEM = BLOCKS.register("blossom_stem", BlossomStem::new);
    public static final RegistryObject<Block> BLOSSOM_PLANKS_STAIRS = BLOCKS.register("blossom_planks_stairs", BlossomPlanksStairs::new);
    public static final RegistryObject<Block> BLOSSOM_PLANKS_FENCE = BLOCKS.register("blossom_planks_fence", BlossomPlanksFence::new);
    public static final RegistryObject<Block> BLOSSOM_PLANKS_SLAB = BLOCKS.register("blossom_planks_slab", BlossomPlanksSlab::new);
    public static final RegistryObject<Block> BLOSSOM_PLANKS_FENCEGATE = BLOCKS.register("blossom_planks_fencegate", BlossomPlanksFenceGate::new);
    public static final RegistryObject<Block> BLOSSOM_PLANKS_BUTTON = BLOCKS.register("blossom_planks_button", () -> new BlossomPlanksButton(Block.Properties.create(Material.WOOD) .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLOSSOM_PLANKS_PRESSURE_PLATE = BLOCKS.register("blossom_planks_pressure_plate", () -> new BlossomPlanksPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD) .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLOSSOM_PLANKS_DOOR = BLOCKS.register("blossom_planks_door", () -> new BlossomPlanksDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BLOSSOM_PLANKS_TRAPDOOR = BLOCKS.register("blossom_planks_trapdoor", () -> new BlossomPlanksTrapdoor(Block.Properties.from(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> BLOSSOM_STEM_STRIPPED = BLOCKS.register("blossom_stem_stripped", BlossomStemStripped::new);
    public static final RegistryObject<Block> BLOSSOM_WOOD = BLOCKS.register("blossom_wood", BlossomWood::new);
    public static final RegistryObject<Block> BLOSSOM_WOOD_STRIPPED = BLOCKS.register("blossom_wood_stripped", BlossomWoodStripped::new);
    public static final RegistryObject<Block> ARDORIUM_BLOCK = BLOCKS.register("ardorium_block", ArdoriumBlock::new);
    public static final RegistryObject<Block> BLUE_ORCHID_PETALS = BLOCKS.register("blue_orchid_petals", BlueOrchidPetals::new);
    public static final RegistryObject<Block> BUTTERCUP_FLOWER = BLOCKS.register("buttercup_flower", ButtercupFlower::new);
    public static final RegistryObject<Block> ALLIUM_PETALS = BLOCKS.register("allium_petals", AlliumPetals::new);
    public static final RegistryObject<Block> AZURE_BLUET_PETALS = BLOCKS.register("azure_bluet_petals", AzureBluetPetals::new);
    public static final RegistryObject<Block> BUTTERCUP_PETALS = BLOCKS.register("buttercup_petals", ButtercupPetals::new);
    public static final RegistryObject<Block> CORNFLOWER_PETALS = BLOCKS.register("cornflower_petals", CornflowerPetals::new);
    public static final RegistryObject<Block> DANDELION_PETALS = BLOCKS.register("dandelion_petals", DandelionPetals::new);
    public static final RegistryObject<Block> LILYOFTHEVALLEY_PETALS = BLOCKS.register("lilyofthevalley_petals", LilyOfTheValleyPetals::new);
    public static final RegistryObject<Block> OXEYE_DAISY_PETALS = BLOCKS.register("oxeye_daisy_petals", OxeyeDaisyPetals::new);
    public static final RegistryObject<Block> PAEONIA_PETALS = BLOCKS.register("paeonia_petals", PaeoniaPetals::new);
    public static final RegistryObject<Block> POPPY_PETALS = BLOCKS.register("poppy_petals", PoppyPetals::new);
    public static final RegistryObject<Block> PINK_TULIP_PETALS = BLOCKS.register("pink_tulip_petals", PinkTulipPetals::new);
    public static final RegistryObject<Block> ORANGE_TULIP_PETALS = BLOCKS.register("orange_tulip_petals", OrangeTulipPetals::new);
    public static final RegistryObject<Block> RED_TULIP_PETALS = BLOCKS.register("red_tulip_petals", RedTulipPetals::new);
    public static final RegistryObject<Block> ROSE_PETALS = BLOCKS.register("rose_petals", RosePetals::new);
    public static final RegistryObject<Block> SYRINGA_PETALS = BLOCKS.register("syringa_petals", SyringaPetals::new);
    public static final RegistryObject<Block> WHITE_TULIP_PETALS = BLOCKS.register("white_tulip_petals", WhiteTulipPetals::new);
    public static final RegistryObject<Block> WITHER_ROSE_PETALS = BLOCKS.register("wither_rose_petals", WitherRosePetals::new);
    public static final RegistryObject<Block> TOURMALINE_ORE = BLOCKS.register("tourmaline_ore", TourmalineOre::new);








    //Block Items
    public static final RegistryObject<Item> BLOSSOM_PLANKS_ITEM = ITEMS.register("blossom_planks", () -> new BlockItemBase(BLOSSOM_PLANKS.get()));
    public static final RegistryObject<Item> BLOSSOM_STEM_ITEM = ITEMS.register("blossom_stem", () -> new BlockItemBase(BLOSSOM_STEM.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_STAIRS_ITEM = ITEMS.register("blossom_planks_stairs", () -> new BlockItemBase(BLOSSOM_PLANKS_STAIRS.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_SLAB_ITEM = ITEMS.register("blossom_planks_slab", () -> new BlockItemBase(BLOSSOM_PLANKS_SLAB.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_FENCE_ITEM = ITEMS.register("blossom_planks_fence", () -> new BlockDecorationItemBase(BLOSSOM_PLANKS_FENCE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_FENCEGATE_ITEM = ITEMS.register("blossom_planks_fencegate", () -> new BlockRedstoneItemBase(BLOSSOM_PLANKS_FENCEGATE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_BUTTON_ITEM = ITEMS.register("blossom_planks_button", () -> new BlockRedstoneItemBase(BLOSSOM_PLANKS_BUTTON.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_PRESSURE_PLATE_ITEM = ITEMS.register("blossom_planks_pressure_plate", () -> new BlockRedstoneItemBase(BLOSSOM_PLANKS_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_DOOR_ITEM = ITEMS.register("blossom_planks_door", () -> new BlockRedstoneItemBase(BLOSSOM_PLANKS_DOOR.get()));
    public static final RegistryObject<Item> BLOSSOM_PLANKS_TRAPDOOR_ITEM = ITEMS.register("blossom_planks_trapdoor", () -> new BlockRedstoneItemBase(BLOSSOM_PLANKS_TRAPDOOR.get()));
    public static final RegistryObject<Item> BLOSSOM_STEM_STRIPPED_ITEM = ITEMS.register("blossom_stem_stripped", () -> new BlockItemBase(BLOSSOM_STEM_STRIPPED.get()));
    public static final RegistryObject<Item> BLOSSOM_WOOD_ITEM = ITEMS.register("blossom_wood", () -> new BlockItemBase(BLOSSOM_WOOD.get()));
    public static final RegistryObject<Item> BLOSSOM_WOOD_STRIPPED_ITEM = ITEMS.register("blossom_wood_stripped", () -> new BlockItemBase(BLOSSOM_WOOD_STRIPPED.get()));
    public static final RegistryObject<Item> ARDORIUM_BLOCK_ITEM = ITEMS.register("ardorium_block", () -> new BlockItemBase(ARDORIUM_BLOCK.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_PETALS_ITEM = ITEMS.register("blue_orchid_petals", () -> new BlockDecorationItemBase(BLUE_ORCHID_PETALS.get()));
    public static final RegistryObject<Item> BUTTERCUP_FLOWER_ITEM = ITEMS.register("buttercup_flower", () -> new BlockDecorationItemBase(BUTTERCUP_FLOWER.get()));
    public static final RegistryObject<Item> ALLIUM_PETALS_ITEM = ITEMS.register("allium_petals", () -> new BlockDecorationItemBase(ALLIUM_PETALS.get()));
    public static final RegistryObject<Item> AZURE_BLUET_PETALS_ITEM = ITEMS.register("azure_bluet_petals", () -> new BlockDecorationItemBase(AZURE_BLUET_PETALS.get()));
    public static final RegistryObject<Item> BUTTERCUP_PETALS_ITEM = ITEMS.register("buttercup_petals", () -> new BlockDecorationItemBase(BUTTERCUP_PETALS.get()));
    public static final RegistryObject<Item> CORNFLOWER_PETALS_ITEM = ITEMS.register("cornflower_petals", () -> new BlockDecorationItemBase(CORNFLOWER_PETALS.get()));
    public static final RegistryObject<Item> DANDELION_PETALS_ITEM = ITEMS.register("dandelion_petals", () -> new BlockDecorationItemBase(DANDELION_PETALS.get()));
    public static final RegistryObject<Item> LILYOFTHEVALLEY_PETALS_ITEM = ITEMS.register("lilyofthevalley_petals", () -> new BlockDecorationItemBase(LILYOFTHEVALLEY_PETALS.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_PETALS_ITEM = ITEMS.register("oxeye_daisy_petals", () -> new BlockDecorationItemBase(OXEYE_DAISY_PETALS.get()));
    public static final RegistryObject<Item> PAEONIA_PETALS_ITEM = ITEMS.register("paeonia_petals", () -> new BlockDecorationItemBase(PAEONIA_PETALS.get()));
    public static final RegistryObject<Item> POPPY_PETALS_ITEM = ITEMS.register("poppy_petals", () -> new BlockDecorationItemBase(POPPY_PETALS.get()));
    public static final RegistryObject<Item> PINK_TULIP_PETALS_ITEM = ITEMS.register("pink_tulip_petals", () -> new BlockDecorationItemBase(PINK_TULIP_PETALS.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_PETALS_ITEM = ITEMS.register("orange_tulip_petals", () -> new BlockDecorationItemBase(ORANGE_TULIP_PETALS.get()));
    public static final RegistryObject<Item> RED_TULIP_PETALS_ITEM = ITEMS.register("red_tulip_petals", () -> new BlockDecorationItemBase(RED_TULIP_PETALS.get()));
    public static final RegistryObject<Item> ROSE_PETALS_ITEM = ITEMS.register("rose_petals", () -> new BlockDecorationItemBase(ROSE_PETALS.get()));
    public static final RegistryObject<Item> SYRINGA_PETALS_ITEM = ITEMS.register("syringa_petals", () -> new BlockDecorationItemBase(SYRINGA_PETALS.get()));
    public static final RegistryObject<Item> WHITE_TULIP_PETALS_ITEM = ITEMS.register("white_tulip_petals", () -> new BlockDecorationItemBase(WHITE_TULIP_PETALS.get()));
    public static final RegistryObject<Item> WITHER_ROSE_PETALS_ITEM = ITEMS.register("wither_rose_petals", () -> new BlockDecorationItemBase(WITHER_ROSE_PETALS.get()));
    public static final RegistryObject<Item> TOURMALINE_ORE_ITEM = ITEMS.register("tourmaline_ore", () -> new BlockItemBase(TOURMALINE_ORE.get()));




}
