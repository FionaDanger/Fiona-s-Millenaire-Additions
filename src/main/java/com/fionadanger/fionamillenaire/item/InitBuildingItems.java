package com.fionadanger.fionamillenaire.item;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import com.fionadanger.fionamillenaire.core.FMConstants;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class InitBuildingItems
{
    public static final DeferredRegister.Items BUILDING_ITEM_REGISTRY =
            DeferredRegister.createItems(FMConstants.MODID);

    // Wicker + Stickwall
    public static final DeferredItem<BlockItem> WICKER_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("wicker", InitBuildingBlocks.WICKER);
    public static final DeferredItem<BlockItem> STICKWALLBLOCK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("stickwall", InitBuildingBlocks.STICKWALLBLOCK);

    // Palm Thatch
    public static final DeferredItem<BlockItem> PALMTHATCHBLOCK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("palmthatchblock", InitBuildingBlocks.PALMTHATCHBLOCK);
    public static final DeferredItem<BlockItem> PALMTHATCHSLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("palmthatchslab", InitBuildingBlocks.PALMTHATCHSLAB);
    public static final DeferredItem<BlockItem> PALMTHATCHSTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("palmthatchstairs", InitBuildingBlocks.PALMTHATCHSTAIRS);

    // Caribou Hide
    public static final DeferredItem<BlockItem> CARIBOUHIDEBLOCK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("caribouhideblock", InitBuildingBlocks.CARIBOUHIDEBLOCK);
    public static final DeferredItem<BlockItem> CARIBOUHIDESLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("caribouhideslab", InitBuildingBlocks.CARIBOUHIDESLAB);
    public static final DeferredItem<BlockItem> CARIBOUHIDESTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("caribouhidestairs", InitBuildingBlocks.CARIBOUHIDESTAIRS);

    // Sealskin
    public static final DeferredItem<BlockItem> SEALSKINBLOCK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("sealskinblock", InitBuildingBlocks.SEALSKINBLOCK);
    public static final DeferredItem<BlockItem> SEALSKINSLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("sealskinslab", InitBuildingBlocks.SEALSKINSLAB);
    public static final DeferredItem<BlockItem> SEALSKINSTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("sealskinstairs", InitBuildingBlocks.SEALSKINSTAIRS);

    // Whitewashed Bricks
    public static final DeferredItem<BlockItem> WHITEWASHEDBRICKS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("whitewashedbricks", InitBuildingBlocks.WHITEWASHEDBRICKS);
    public static final DeferredItem<BlockItem> WHITEWASHEDBRICKSLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("whitewashedbrickslab", InitBuildingBlocks.WHITEWASHEDBRICKSLAB);
    public static final DeferredItem<BlockItem> WHITEWASHEDBRICKSTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("whitewashedbrickstairs", InitBuildingBlocks.WHITEWASHEDBRICKSTAIRS);
    public static final DeferredItem<BlockItem> WHITEWASHEDBRICKWALL_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("whitewashedbrickwall", InitBuildingBlocks.WHITEWASHED_BRICK_WALL);

    // Shingles
    public static final DeferredItem<BlockItem> SHINGLESBLOCK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("shinglesblock", InitBuildingBlocks.SHINGLESBLOCK);
    public static final DeferredItem<BlockItem> SHINGLESSLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("shinglesslab", InitBuildingBlocks.SHINGLESSLAB);
    public static final DeferredItem<BlockItem> SHINGLESSTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("shinglesstairs", InitBuildingBlocks.SHINGLESSTAIRS);

    // Tan Stucco Bricks
    public static final DeferredItem<BlockItem> TANSTUCCOBRICKS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("tanstuccobricks", InitBuildingBlocks.TANSTUCCOBRICKS);
    public static final DeferredItem<BlockItem> TANSTUCCOBRICKSLAB_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("tanstuccobrickslab", InitBuildingBlocks.TANSTUCCOBRICKSLAB);
    public static final DeferredItem<BlockItem> TANSTUCCOBRICKSTAIRS_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("tanstuccobrickstairs", InitBuildingBlocks.TANSTUCCOBRICKSTAIRS);
    public static final DeferredItem<BlockItem> TANSTUCCOBRICKWALL_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("tanstuccobrickwall", InitBuildingBlocks.TANSTUCCOBRICKWALL);

    // Ornate Cuman Brick
    public static final DeferredItem<BlockItem> ORNATECUMANBRICK_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("ornatecumanbrick", InitBuildingBlocks.ORNATECUMANBRICK);

    // Hide Bedroll
    public static final DeferredItem<BlockItem> HIDE_BEDROLL_ITEM =
            BUILDING_ITEM_REGISTRY.registerSimpleBlockItem("hide_bedroll", InitBuildingBlocks.HIDE_BEDROLL);
}
