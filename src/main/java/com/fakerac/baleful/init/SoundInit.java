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
    public static final RegistryObject<SoundEvent> ENDGRASS_STEP = SOUNDS.register("block.endgrass_step", () -> new SoundEvent(new ResourceLocation(Baleful.MOD_ID, "block.endgrass_step")));
    public static final RegistryObject<SoundEvent> ENDGRASS_BREAK = SOUNDS.register("block.endgrass_break", () -> new SoundEvent(new ResourceLocation(Baleful.MOD_ID, "block.endgrass.break")));
    public static final RegistryObject<SoundEvent> EMBER_MALLET_SLAM = SOUNDS.register("item.ember_mallet_slam", () -> new SoundEvent(new ResourceLocation(Baleful.MOD_ID, "item.ember_mallet_slam")));
}
