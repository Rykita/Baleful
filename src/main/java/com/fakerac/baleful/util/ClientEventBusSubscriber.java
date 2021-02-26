package com.fakerac.baleful.util;

import com.fakerac.baleful.Baleful;
import com.fakerac.baleful.client.render.ArmstrongEntityRenderer;
import com.fakerac.baleful.client.render.MoobloomEntityRenderer;
import com.fakerac.baleful.client.render.MoobloomFlowerRenderer;
import com.fakerac.baleful.client.render.RayEntityRenderer;
import com.fakerac.baleful.entities.MoobloomEntity;
import com.fakerac.baleful.init.BlockInit;
import com.fakerac.baleful.init.EntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Baleful.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.BLOSSOM_PLANKS_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLOSSOM_PLANKS_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BUTTERCUP_FLOWER.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(EntityTypes.MOOBLOOM.get(), MoobloomEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypes.RAY.get(), RayEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypes.ARMSTRONG.get(), ArmstrongEntityRenderer::new);
        RenderTypeLookup.setRenderLayer(BlockInit.FLORAL_SPROUTS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PAEONIA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SYRINGA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ROSE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.AQUA_HYDRANGEA.get(), RenderType.getCutout());
    }
}
