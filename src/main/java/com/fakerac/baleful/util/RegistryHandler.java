package com.fakerac.baleful.util;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.effects.Shatter;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class RegistryHandler {

    public static DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Baleful.MOD_ID);
    public static DeferredRegister<Potion> POTION_TYPES = DeferredRegister.create(ForgeRegistries.POTION_TYPES, Baleful.MOD_ID);

    public static void init(){
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    //Armor



    //Effects
    public static final RegistryObject<Effect> SHATTER = EFFECTS.register("shatter", Shatter::new);

    //Potions
}
