package com.fionadanger.FionaMillenaire.registry;

import com.fionadanger.FionaMillenaire.FionaMillenaire;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, fionamillenaire.MODID);

    public static final Set<Supplier<Item>> CREATIVE_TAB_ITEMS = new LinkedHashSet<>();

    private static Supplier<Item> registerWithTab(String name, Supplier<Item> supplier) {
        Supplier<Item> item = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    private static Supplier<Item> registerHidden(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    private static Item.Properties props() {
        return new Item.Properties();
    }

    // -------------------------
    // BLOCK ITEMS
    // -------------------------

    public static final Supplier<Item> HIDE_BEDROLL =
            registerWithTab("hide_bedroll",
                    () -> new BlockItem(ModBlocks.HIDE_BEDROLL.get(), props()));

    public static final Supplier<Item> WICKER =
            registerWithTab("wicker",
                    () -> new BlockItem(ModBlocks.WICKER.get(), props()));

    public static final Supplier<Item> STICKWALLBLOCK =
            registerWithTab("stickwall",
                    () -> new BlockItem(ModBlocks.STICKWALLBLOCK.get(), props()));

    public static final Supplier<Item> PALMTHATCHBLOCK =
            registerWithTab("palmthatchblock",
                    () -> new BlockItem(ModBlocks.PALMTHATCHBLOCK.get(), props()));

    public static final Supplier<Item> PALMTHATCHSLAB =
            registerWithTab("palmthatchslab",
                    () -> new BlockItem(ModBlocks.PALMTHATCHSLAB.get(), props()));

    public static final Supplier<Item> PALMTHATCHSTAIRS =
            registerWithTab("palmthatchstairs",
                    () -> new BlockItem(ModBlocks.PALMTHATCHSTAIRS.get(), props()));

    public static final Supplier<Item> CARIBOUHIDEBLOCK =
            registerWithTab("caribouhideblock",
                    () -> new BlockItem(ModBlocks.CARIBOUHIDEBLOCK.get(), props()));

    public static final Supplier<Item> CARIBOUHIDESLAB =
            registerWithTab("caribouhideslab",
                    () -> new BlockItem(ModBlocks.CARIBOUHIDESLAB.get(), props()));

    public static final Supplier<Item> CARIBOUHIDESTAIRS =
            registerWithTab("caribouhidestairs",
                    () -> new BlockItem(ModBlocks.CARIBOUHIDESTAIRS.get(), props()));

    public static final Supplier<Item> SEALSKINBLOCK =
            registerWithTab("sealskinblock",
                    () -> new BlockItem(ModBlocks.SEALSKINBLOCK.get(), props()));

    public static final Supplier<Item> SEALSKINSLAB =
            registerWithTab("sealskinslab",
                    () -> new BlockItem(ModBlocks.SEALSKINSLAB.get(), props()));

    public static final Supplier<Item> SEALSKINSTAIRS =
            registerWithTab("sealskinstairs",
                    () -> new BlockItem(ModBlocks.SEALSKINSTAIRS.get(), props()));

    public static final Supplier<Item> WHITEWASHEDBRICKS =
            registerWithTab("whitewashedbricks",
                    () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKS.get(), props()));

    public static final Supplier<Item> WHITEWASHEDBRICKSLAB =
            registerWithTab("whitewashedbrickslab",
                    () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKSLAB.get(), props()));

    public static final Supplier<Item> WHITEWASHEDBRICKSTAIRS =
            registerWithTab("whitewashedbrickstairs",
                    () -> new BlockItem(ModBlocks.WHITEWASHEDBRICKSTAIRS.get(), props()));

    public static final Supplier<Item> SHINGLESBLOCK =
            registerWithTab("shinglesblock",
                    () -> new BlockItem(ModBlocks.SHINGLESBLOCK.get(), props()));

    public static final Supplier<Item> SHINGLESSLAB =
            registerWithTab("shinglesslab",
                    () -> new BlockItem(ModBlocks.SHINGLESSLAB.get(), props()));

    public static final Supplier<Item> SHINGLESSTAIRS =
            registerWithTab("shinglesstairs",
                    () -> new BlockItem(ModBlocks.SHINGLESSTAIRS.get(), props()));

    public static final Supplier<Item> TANSTUCCOBRICKS =
            registerWithTab("tanstuccobricks",
                    () -> new BlockItem(ModBlocks.TANSTUCCOBRICKS.get(), props()));

    public static final Supplier<Item> TANSTUCCOBRICKSLAB =
            registerWithTab("tanstuccobrickslab",
                    () -> new BlockItem(ModBlocks.TANSTUCCOBRICKSLAB.get(), props()));

    public static final Supplier<Item> TANSTUCCOBRICKSTAIRS =
            registerWithTab("tanstuccobrickstairs",
                    () -> new BlockItem(ModBlocks.TANSTUCCOBRICKSTAIRS.get(), props()));
}
