package com.fionadanger.fionamillenaire.client;

import com.fionadanger.fionamillenaire.blockentity.InitBlockEntities;
import com.fionadanger.fionamillenaire.client.renderer.YurtBlockEntityRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

@EventBusSubscriber(modid = "fionamillenaire", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

         BlockEntityRenderers.register(InitBlockEntities.YURT_BE.get(),
               context -> new YurtBlockEntityRenderer(context));
        });
    }
}