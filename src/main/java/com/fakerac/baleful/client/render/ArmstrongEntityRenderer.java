package com.fakerac.baleful.client.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class ArmstrongEntityRenderer extends ZombieRenderer {

    private static final ResourceLocation ZOMBIE_TEXTURE = new ResourceLocation("baleful:textures/entity/armstrong.png");


    public ArmstrongEntityRenderer(EntityRendererManager manager) {
        super(manager);
    }

    @Nonnull
    @Override
    public ResourceLocation getEntityTexture(@Nonnull ZombieEntity entity) {
        return ZOMBIE_TEXTURE;
    }
}
