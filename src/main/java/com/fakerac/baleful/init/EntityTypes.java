package com.fakerac.baleful.init;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.entities.ArmstrongEntity;
import com.fakerac.baleful.entities.MoobloomEntity;
import com.fakerac.baleful.entities.RayEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Baleful.MOD_ID);

    public static final RegistryObject<EntityType<MoobloomEntity>> MOOBLOOM = ENTITY_TYPES.register("moobloom", () -> EntityType.Builder.<MoobloomEntity>create(MoobloomEntity::new, EntityClassification.CREATURE)
            .size(0.9F, 1.4F)
            .build(new ResourceLocation(Baleful.MOD_ID, "moobloom").toString()));

    public static final RegistryObject<EntityType<RayEntity>> RAY = ENTITY_TYPES.register("ray", () -> EntityType.Builder.<RayEntity>create(RayEntity::new, EntityClassification.MONSTER)
    .size(0.6F, 1.95F)
    .build(new ResourceLocation(Baleful.MOD_ID, "ray").toString()));

    public static final RegistryObject<EntityType<ArmstrongEntity>> ARMSTRONG = ENTITY_TYPES.register("armstrong", () -> EntityType.Builder.<ArmstrongEntity>create(ArmstrongEntity::new, EntityClassification.MONSTER)
    .size(0.6F, 1.95F)
    .build(new ResourceLocation(Baleful.MOD_ID, "armstrong").toString()));
}
