package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import com.fionadanger.fionamillenaire.block.*;
import com.fionadanger.fionamillenaire.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, fionamillenaire.MODID);

    public static final RegistryObject<Item> HIDE_BEDROLL = ITEMS.register("hide_bedroll",
            () -> new BlockItem(ModBlocks.HIDE_BEDROLL.get(), new Properties()));
}
