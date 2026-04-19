package com.fionadanger.fionamillenaire;

import com.fionadanger.fionamillenaire.block.yurt.YurtBlockEntity;
import com.fionadanger.fionamillenaire.blockentity.InitBlockEntities;
import com.fionadanger.fionamillenaire.client.renderer.YurtBlockEntityRenderer;
import com.fionadanger.fionamillenaire.item.InitItems;
import com.fionadanger.fionamillenaire.ModCreativeTabs;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.logging.LogUtils;
import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import com.fionadanger.fionamillenaire.item.InitBuildingItems;
import com.fionadanger.fionamillenaire.core.FMConstants;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod(FMConstants.MODID)
public class FionaMillenaireMod {
    public static final String MODID = FMConstants.MODID;
    public static final Logger LOGGER = LogUtils.getLogger();

    public FionaMillenaireMod(IEventBus modEventBus, ModContainer modContainer) {
        InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.register(modEventBus);
        InitBuildingItems.BUILDING_ITEM_REGISTRY.register(modEventBus);
        InitItems.ITEMS.register(modEventBus);
        InitBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }

    @EventBusSubscriber(modid = FMConstants.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BlockEntityRenderers.register(InitBlockEntities.YURT_BE.get(), YurtBlockEntityRenderer::new);
        }
    }

}