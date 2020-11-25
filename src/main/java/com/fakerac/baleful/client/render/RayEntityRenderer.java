package com.fakerac.baleful.client.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class RayEntityRenderer extends ZombieRenderer {

    private static final ResourceLocation ZOMBIE_TEXTURE = new ResourceLocation("baleful:textures/entity/ray.png");


    public RayEntityRenderer(EntityRendererManager manager) {
        super(manager);
    }

    @Nonnull
    @Override
    public ResourceLocation getEntityTexture(@Nonnull ZombieEntity entity) {
        return ZOMBIE_TEXTURE;
    }
}
