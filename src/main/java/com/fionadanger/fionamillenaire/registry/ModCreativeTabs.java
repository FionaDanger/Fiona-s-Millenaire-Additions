package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fionamillenaire.MODID);

    public static final Supplier<CreativeModeTab> TAB_FIONA =
            CREATIVE_TABS.register("fionamillenaire",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.fionamillenaire"))
                            .icon(() -> new ItemStack(ModItems.HIDE_BEDROLL.get()))
                            .displayItems((parameters, output) ->
                                    ModItems.CREATIVE_TAB_ITEMS.forEach(item -> output.accept(item.get()))
                            )
                            .build());
}
