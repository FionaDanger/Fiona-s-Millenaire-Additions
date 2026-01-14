package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fionamillenaire.MODID);

    public static final RegistryObject<CreativeModeTab> FIONA_TAB =
            CREATIVE_TABS.register("fionamillenaire",
                    () -> CreativeModeTab.builder()
                            .title(Component.literal("Fiona's Millenaire"))
                            .icon(() -> new ItemStack(ModItems.HIDE_BEDROLL.get()))
                            .displayItems((params, output) -> {
                                output.accept(ModItems.HIDE_BEDROLL.get());
                            })
                            .build()
            );
}
