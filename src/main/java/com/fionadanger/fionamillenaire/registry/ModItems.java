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

    public static final RegistryObject<Item> WICKER = ITEMS.register("wicker",
            () -> new BlockItem(ModBlocks.WICKER.get(), new Item.Properties()));

    public static final RegistryObject<Item> STICKWALLBLOCK = ITEMS.register("stickwall",
            () -> new BlockItem(ModBlocks.STICKWALLBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> PALMTHATCHBLOCK = ITEMS.register("palmthatchblock",
            () -> new BlockItem(ModBlocks.PALMTHATCHBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> PALMTHATCHSLAB = ITEMS.register("palmthatchslab",
            () -> new BlockItem(ModBlocks.PALMTHATCHSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> PALMTHATCHSTAIRS = ITEMS.register("palmthatchstairs",
            () -> new BlockItem(ModBlocks.PALMTHATCHSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> CARIBOUHIDEBLOCK = ITEMS.register("caribouhideblock",
            () -> new BlockItem(ModBlocks.CARIBOUHIDEBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> CARIBOUHIDESLAB = ITEMS.register("caribouhideslab",
            () -> new BlockItem(ModBlocks.CARIBOUHIDESLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> CARIBOUHIDESTAIRS = ITEMS.register("caribouhidestairs",
            () -> new BlockItem(ModBlocks.CARIBOUHIDESTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> SEALSKINBLOCK = ITEMS.register("sealskinblock",
            () -> new BlockItem(ModBlocks.SEALSKINBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> SEALSKINSLAB = ITEMS.register("sealskinslab",
            () -> new BlockItem(ModBlocks.SEALSKINSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> SEALSKINSTAIRS = ITEMS.register("sealskintairs",
            () -> new BlockItem(ModBlocks.SEALSKINSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITEWASHEDBRICKS = ITEMS.register("whitewashedbricks",
            () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITEWASHEDBRICKSLAB = ITEMS.register("whitewashedbrickslab",
            () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITEWASHEDBRICKSTAIRS = ITEMS.register("whitewashedbrickstairs",
            () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> SHINGLESBLOCK = ITEMS.register("shinglesblock",
            () -> new BlockItem(ModBlocks.SHINGLESBLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> SHINGLESSLAB = ITEMS.register("shinglesslab",
            () -> new BlockItem(ModBlocks.SHINGLESSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> SHINGLESSTAIRS = ITEMS.register("shinglesstairs",
            () -> new BlockItem(ModBlocks.SHINGLESSTAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TANSTUCCOBRICKS = ITEMS.register("tanstuccobricks",
            () -> new BlockItem(ModBlocks.TANSTUCCOBRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TANSTUCCOBRICKSLAB = ITEMS.register("tanstuccobrickslab",
            () -> new BlockItem(ModBlocks.TANSTUCCOBRICKSLAB.get(), new Item.Properties()));

    public static final RegistryObject<Item> TANSTUCCOBRICKSTAIRS = ITEMS.register("tanstuccobrickstairs",
            () -> new BlockItem(ModBlocks.TANSTUCCOBRICKSTAIRS.get(), new Item.Properties()));

}
