package com.fakerac.baleful.client.render;

import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class MoobloomEntityRenderer extends CowRenderer {

    private static final ResourceLocation COW_TEXTURE = new ResourceLocation("baleful:textures/entity/moo_bloom.png");


    public MoobloomEntityRenderer(EntityRendererManager manager) {
        super(manager);
    }

    @Nonnull
    @Override
    public ResourceLocation getEntityTexture(@Nonnull CowEntity entity) {
        return COW_TEXTURE;
    }
}
