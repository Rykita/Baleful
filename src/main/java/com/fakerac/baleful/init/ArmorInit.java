package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.armor.BalefulArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Baleful.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Ardorium
    public static final RegistryObject<ArmorItem> ARDORIUM_HELMET = ITEMS.register("ardorium_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.HEAD, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ArmorItem> ARDORIUM_CHESTPLATE = ITEMS.register("ardorium_chestplate", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.CHEST, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ArmorItem> ARDORIUM_LEGGINGS = ITEMS.register("ardorium_leggings", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.LEGS, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));

    public static final RegistryObject<ArmorItem> ARDORIUM_BOOTS = ITEMS.register("ardorium_boots", () ->
            new ArmorItem(BalefulArmorMaterial.ARDORIUM, EquipmentSlotType.FEET, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));



    //Nydaryx

    public static final RegistryObject<ArmorItem> NYDARYX_HELMET = ITEMS.register("nydaryx_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.NYDARYX, EquipmentSlotType.HEAD, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).isImmuneToFire().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> NYDARYX_CHESTPLATE = ITEMS.register("nydaryx_chestplate", () ->
            new ArmorItem(BalefulArmorMaterial.NYDARYX, EquipmentSlotType.CHEST, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).isImmuneToFire().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> NYDARYX_LEGGINGS = ITEMS.register("nydaryx_leggings", () ->
            new ArmorItem(BalefulArmorMaterial.NYDARYX, EquipmentSlotType.LEGS, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).isImmuneToFire().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> NYDARYX_BOOTS = ITEMS.register("nydaryx_boots", () ->
            new ArmorItem(BalefulArmorMaterial.NYDARYX, EquipmentSlotType.FEET, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).isImmuneToFire().rarity(Rarity.EPIC)));



    //Masks
    public static final RegistryObject<ArmorItem> MARQEYE_HELMET = ITEMS.register("marqeye_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.MARQEYE, EquipmentSlotType.HEAD, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> SEAOFPIXELS_HELMET = ITEMS.register("sop_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.SEAOFPIXELS, EquipmentSlotType.HEAD, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> FAKERAC_HELMET = ITEMS.register("fakerac_helmet", () ->
            new ArmorItem(BalefulArmorMaterial.FAKERAC, EquipmentSlotType.HEAD, new Item.Properties().rarity(Rarity.EPIC)));
}
