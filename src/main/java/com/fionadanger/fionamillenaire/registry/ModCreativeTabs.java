package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.fionadanger.fionamillenaire.block.*;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fionamillenaire.MODID);

    public static final RegistryObject<CreativeModeTab> FIONA_TAB =
            CREATIVE_TABS.register("fionamillenaire",
                    () -> CreativeModeTab.builder()
                            .title(Component.literal("Fiona's Millenaire"))
                            .icon(() -> ModItems.HIDE_BEDROLL.get().getDefaultInstance()) // FIXED
                            .displayItems((params, output) -> {
                                // Bedroll
                                output.accept(ModBlocks.HIDE_BEDROLL.get());

                                // Wicker + Stickwall
                                output.accept(ModBlocks.WICKER.get());
                                output.accept(ModBlocks.STICKWALLBLOCK.get());

                                // Palm Thatch
                                output.accept(ModBlocks.PALMTHATCHBLOCK.get());
                                output.accept(ModBlocks.PALMTHATCHSLAB.get());
                                output.accept(ModBlocks.PALMTHATCHSTAIRS.get());

                                // Caribou Hide
                                output.accept(ModBlocks.CARIBOUHIDEBLOCK.get());
                                output.accept(ModBlocks.CARIBOUHIDESLAB.get());
                                output.accept(ModBlocks.CARIBOUHIDESTAIRS.get());

                                // Sealskin
                                output.accept(ModBlocks.SEALSKINBLOCK.get());
                                output.accept(ModBlocks.SEALSKINSLAB.get());
                                output.accept(ModBlocks.SEALSKINSTAIRS.get());

                                // Whitewashed Bricks
                                output.accept(ModBlocks.WHITEWASHEDBRICKS.get());
                                output.accept(ModBlocks.WHITEWASHEDBRICKSLAB.get());
                                output.accept(ModBlocks.WHITEWASHEDBRICKSTAIRS.get());

                                // Shingles
                                output.accept(ModBlocks.SHINGLESBLOCK.get());
                                output.accept(ModBlocks.SHINGLESSLAB.get());
                                output.accept(ModBlocks.SHINGLESSTAIRS.get());

                                // Tan Stucco Bricks
                                output.accept(ModBlocks.TANSTUCCOBRICKS.get());
                                output.accept(ModBlocks.TANSTUCCOBRICKSLAB.get());
                                output.accept(ModBlocks.TANSTUCCOBRICKSTAIRS.get());
                            })
                            .build()
            );
}
