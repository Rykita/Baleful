package com.fakerac.baleful.client.render;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.MooshroomMushroomLayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class MoobloomFlowerRenderer extends MooshroomMushroomLayer   {
    public MoobloomFlowerRenderer(IEntityRenderer rendererIn) {
        super(rendererIn);
    }

    private static final ResourceLocation MOOSHROOM_MUSHROOM_LAYER_TEXTURES  = new ResourceLocation("baleful:textures/entity/moo_bloom.png");

    @Nonnull
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull Entity entityIn) {
        return MOOSHROOM_MUSHROOM_LAYER_TEXTURES;

    }
}
