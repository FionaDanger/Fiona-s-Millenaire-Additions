package com.fionadanger.fionamillenaire;

import com.fionadanger.fionamillenaire.core.FMConstants;
import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FMConstants.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FIONA_TAB =
            TABS.register("fionamillenaire",
                    () -> CreativeModeTab.builder()
                            .title(Component.literal("Fiona’s Millénaire"))
                            .icon(() -> new ItemStack(InitBuildingBlocks.WICKER.get()))
                            .displayItems((params, output) -> {

                                // Automatically add ALL registered blocks
                                InitBuildingBlocks.BUILDING_BLOCK_REGISTRY.getEntries().forEach(entry -> {
                                    output.accept(entry.get());
                                });

                            })
                            .build());
}
