package com.fionadanger.fionamillenaire.item;

import com.fionadanger.fionamillenaire.core.FMConstants;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class InitItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FMConstants.MODID);

    // Color items
    public static final DeferredHolder<Item, Item> WHITEFELT =
            ITEMS.register("whitefelt", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> REDFELT =
            ITEMS.register("redfelt", () -> new Item(new Item.Properties()));

    // Pattern items
    public static final DeferredHolder<Item, Item> WATERPATTERNFELT =
            ITEMS.register("waterpatternfelt", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> RAMPATTERNFELT =
            ITEMS.register("rampatternfelt", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> AMULETPATTERNFELT =
            ITEMS.register("amuletpatternfelt", () -> new Item(new Item.Properties()));
}