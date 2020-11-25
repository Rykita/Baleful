package com.fakerac.baleful.entities;

import com.fakerac.baleful.init.SoundInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;

public class ArmstrongEntity extends ZombieEntity {

    public ArmstrongEntity(EntityType<? extends ArmstrongEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 800.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.50D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 40.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 17.0F)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS, 0.0D)
                .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 12.0D);

    }

    private final ServerBossInfo bossInfo = (ServerBossInfo) (new ServerBossInfo(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setCreateFog(true);


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
        return SoundInit.ARMSTRONG_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundInit.ARMSTRONG_HURT.get();
    }

    @Override
    public boolean isNonBoss() {
        return false;
    }

    public ServerBossInfo getBossInfo() {
        return bossInfo;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 1;
    }

    @Override
    public void removeTrackingPlayer(ServerPlayerEntity player) {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    @Override
    public void setCustomName(ITextComponent name) {
        super.setCustomName(name);
        this.bossInfo.setName(this.getDisplayName());
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        if (this.hasCustomName()) {
            this.bossInfo.setName((this.getDisplayName()));
        }
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }

    @Override
    public void addTrackingPlayer(ServerPlayerEntity player) {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source)) {
            return false;
        } else if (getHealth() > 0) {
            Entity entity = source.getImmediateSource();
            if (entity instanceof AbstractArrowEntity) {
                return false;
            } else {
                return true;
            }
        }
    return true;}
}
