package com.fionadanger.fionamillenaire;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import com.fionadanger.fionamillenaire.core.FMConstants;
import com.fionadanger.fionamillenaire.item.InitItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FMConstants.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FIONA_TAB =
            CREATIVE_MODE_TABS.register("fionamillenairetab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("fionamillenairetab"))
                    .icon(() -> new ItemStack(InitBuildingBlocks.WICKER.get(), 1))
                    .displayItems((params, output) -> {
                        // Blocks - ALL with explicit count = 1
                        output.accept(new ItemStack(InitBuildingBlocks.WICKER.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.STICKWALLBLOCK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.PALMTHATCHBLOCK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.PALMTHATCHSLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.PALMTHATCHSTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.CARIBOUHIDEBLOCK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.CARIBOUHIDESLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.CARIBOUHIDESTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SEALSKINBLOCK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SEALSKINSLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SEALSKINSTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.WHITEWASHEDBRICKS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.WHITEWASHEDBRICKSLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.WHITEWASHEDBRICKSTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.WHITEWASHEDBRICKWALL.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SHINGLESBLOCK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SHINGLESSLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.SHINGLESSTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.TANSTUCCOBRICKS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.TANSTUCCOBRICKSLAB.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.TANSTUCCOBRICKSTAIRS.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.TANSTUCCOBRICKWALL.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.ORNATECUMANBRICK.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.HIDE_BEDROLL.get(), 1));
                        output.accept(new ItemStack(InitBuildingBlocks.YURT.get(), 1));

                        // Items - ALL with explicit count = 1
                        output.accept(new ItemStack(InitItems.WHITEFELT.get(), 1));
                        output.accept(new ItemStack(InitItems.REDFELT.get(), 1));
                        output.accept(new ItemStack(InitItems.AMULETPATTERNFELT.get(), 1));
                        output.accept(new ItemStack(InitItems.WATERPATTERNFELT.get(), 1));
                        output.accept(new ItemStack(InitItems.RAMPATTERNFELT.get(), 1));
                    })
                    .build());
}