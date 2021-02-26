package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.tools.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WeaponInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Baleful.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Weapons
    public static final RegistryObject<SwordItem> MURASAMA = ITEMS.register("murasama", Murasama::new);
    public static final RegistryObject<SwordItem> ARDORIUM_SWORD = ITEMS.register("ardorium_sword", () -> new SwordItem(BalefulItemTier.ARDORIUM, 8, -2.4F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON).isImmuneToFire()));
    public static final RegistryObject<SwordItem> NYDARYX_SWORD = ITEMS.register("nydaryx_sword", () -> new SwordItem(BalefulItemTier.NYDARYX, 9, -2.4F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.EPIC).isImmuneToFire()));
    public static final RegistryObject<AxeItem> KINGS_AXE = ITEMS.register("kings_axe", () -> new AxeItem(BalefulItemTier.TIER1_WEAPON_TYPE, 11, -2.8F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.RARE)));
}
