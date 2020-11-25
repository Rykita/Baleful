package com.fakerac.baleful.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RayEntity extends ZombieEntity {

    public RayEntity(EntityType<? extends RayEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 200.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 8.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 40.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 60.0F)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS, 0.0D)
                .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 5.0D);

    }



    @Override
    public void tick() {
        super.tick();
    }


    @Override
    public boolean isImmuneToFire() {
        return true;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLOCK_LAVA_AMBIENT;
    }
}
