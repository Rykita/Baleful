package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Baleful.MOD_ID);


    public static final RegistryObject<SoundEvent> ARMSTRONG_AMBIENT = SOUNDS.register("entity.armstrong_ambient", () -> new SoundEvent(new ResourceLocation(Baleful.MOD_ID, "entity.armstrong_ambient")));
    public static final RegistryObject<SoundEvent> ARMSTRONG_HURT = SOUNDS.register("entity.armstrong_hurt", () -> new SoundEvent(new ResourceLocation(Baleful.MOD_ID, "entity.armstrong_hurt")));

}
