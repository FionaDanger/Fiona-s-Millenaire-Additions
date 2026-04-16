package com.fionadanger.fionamillenaire;

import com.mojang.logging.LogUtils;
import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import com.fionadanger.fionamillenaire.item.InitBuildingItems;
import com.fionadanger.fionamillenaire.core.FMConstants;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod(FMConstants.MODID)
public class FionaMillenaireMod
{
    public static final String MODID = FMConstants.MODID;
    public static final Logger LOGGER = LogUtils.getLogger();

    public FionaMillenaireMod(IEventBus modEventBus, ModContainer modContainer)
    {
        InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.register(modEventBus);
        InitBuildingItems.BUILDING_ITEM_REGISTRY.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);

    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Client-only setup (renderers, keybinds, etc.) goes here
        }
    }
}
