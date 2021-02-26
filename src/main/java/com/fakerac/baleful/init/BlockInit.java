package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.blocks.*;
import com.fakerac.baleful.blocks.ores.TourmalineOre;
import com.fakerac.baleful.blocks.petals.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Baleful.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
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
    public static final RegistryObject<Block> FLORAL_SPROUTS = BLOCKS.register("floral_sprouts", FloralSprouts::new);
    public static final RegistryObject<Block> ROSE = BLOCKS.register("rose", Rose::new);
    public static final RegistryObject<Block> SYRINGA = BLOCKS.register("syringa", Syringa::new);
    public static final RegistryObject<Block> PAEONIA = BLOCKS.register("paeonia", Paeonia::new);
    public static final RegistryObject<Block> AQUA_HYDRANGEA = BLOCKS.register("aqua_hydrangea", AquaHydrangea::new);
    public static final RegistryObject<Block> NYDARYX_BLOCK = BLOCKS.register("nydaryx_block", () -> new Block(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(50, 360000)
            .harvestLevel(6)
            .sound(SoundType.NETHERITE)
            .setRequiresTool().harvestTool(ToolType.PICKAXE)
            .harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> TRINITITE = BLOCKS.register("trinitite", () -> new Block(Block.Properties.create(Material.ROCK)
    .hardnessAndResistance(35, 1200)
    .harvestLevel(5)
    .sound(SoundType.STONE)
    .setRequiresTool().harvestTool(ToolType.PICKAXE)
    .harvestTool(ToolType.PICKAXE)));
}
