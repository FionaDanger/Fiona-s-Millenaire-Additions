package com.fionadanger.fionamillenaire;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.fionadanger.fionamillenaire.registry.ModBlocks;
import com.fionadanger.fionamillenaire.registry.ModItems;
import com.fionadanger.fionamillenaire.registry.ModCreativeTabs;
import com.fionadanger.fionamillenaire.registry.ModBlockEntities;

@Mod(fionamillenaire.MODID)
public class fionamillenaire {

    public static final String MODID = "fionamillenaire";

    public fionamillenaire() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_TABS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
    }
}
