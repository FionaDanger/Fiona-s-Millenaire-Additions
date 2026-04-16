package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.core.FMConstants;
import com.fionadanger.fionamillenaire.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class InitBuildingBlocks
{
    public static final DeferredRegister.Blocks BUILDING_BLOCK_REGISTRY =
            DeferredRegister.createBlocks(FMConstants.MODID);

    // Wicker + Stickwall (like planks)
    public static final DeferredBlock<WickerBlock> WICKER =
            BUILDING_BLOCK_REGISTRY.register("wicker",
                    () -> new WickerBlock(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StickwallBlock> STICKWALLBLOCK =
            BUILDING_BLOCK_REGISTRY.register("stickwall",
                    () -> new StickwallBlock(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // Palm Thatch (like bamboo planks but weaker)
    public static final DeferredBlock<PalmThatchBlock> PALMTHATCHBLOCK =
            BUILDING_BLOCK_REGISTRY.register("palmthatchblock",
                    () -> new PalmThatchBlock(Block.Properties.of()
                            .mapColor(MapColor.COLOR_YELLOW)
                            .strength(0.6F)
                            .sound(SoundType.BAMBOO_WOOD)
                            .ignitedByLava()));

    public static final DeferredBlock<PalmThatchSlab> PALMTHATCHSLAB =
            BUILDING_BLOCK_REGISTRY.register("palmthatchslab",
                    () -> new PalmThatchSlab(Block.Properties.of()
                            .mapColor(MapColor.COLOR_YELLOW)
                            .strength(0.6F)
                            .sound(SoundType.BAMBOO_WOOD)
                            .ignitedByLava()));

    public static final DeferredBlock<PalmThatchStairs> PALMTHATCHSTAIRS =
            BUILDING_BLOCK_REGISTRY.register("palmthatchstairs",
                    () -> new PalmThatchStairs(Block.Properties.of()
                            .mapColor(MapColor.COLOR_YELLOW)
                            .strength(0.6F)
                            .sound(SoundType.BAMBOO_WOOD)
                            .ignitedByLava()));

    // Caribou Hide (like wool)
    public static final DeferredBlock<CaribouHideBlock> CARIBOUHIDEBLOCK =
            BUILDING_BLOCK_REGISTRY.register("caribouhideblock",
                    () -> new CaribouHideBlock(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final DeferredBlock<CaribouHideSlab> CARIBOUHIDESLAB =
            BUILDING_BLOCK_REGISTRY.register("caribouhideslab",
                    () -> new CaribouHideSlab(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final DeferredBlock<CaribouHideStairs> CARIBOUHIDESTAIRS =
            BUILDING_BLOCK_REGISTRY.register("caribouhidestairs",
                    () -> new CaribouHideStairs(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    // Sealskin (like wool)
    public static final DeferredBlock<SealskinBlock> SEALSKINBLOCK =
            BUILDING_BLOCK_REGISTRY.register("sealskinblock",
                    () -> new SealskinBlock(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final DeferredBlock<SealskinSlab> SEALSKINSLAB =
            BUILDING_BLOCK_REGISTRY.register("sealskinslab",
                    () -> new SealskinSlab(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final DeferredBlock<SealskinStairs> SEALSKINSTAIRS =
            BUILDING_BLOCK_REGISTRY.register("sealskinstairs",
                    () -> new SealskinStairs(Block.Properties.of()
                            .strength(0.8F)
                            .sound(SoundType.WOOL)
                            .ignitedByLava()));

    // Whitewashed Bricks (like bricks)
    public static final DeferredBlock<WhitewashedBricks> WHITEWASHEDBRICKS =
            BUILDING_BLOCK_REGISTRY.register("whitewashedbricks",
                    () -> new WhitewashedBricks(Block.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<WhitewashedBrickSlab> WHITEWASHEDBRICKSLAB =
            BUILDING_BLOCK_REGISTRY.register("whitewashedbrickslab",
                    () -> new WhitewashedBrickSlab(Block.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final DeferredBlock<WhitewashedBrickStairs> WHITEWASHEDBRICKSTAIRS =
            BUILDING_BLOCK_REGISTRY.register("whitewashedbrickstairs",
                    () -> new WhitewashedBrickStairs(Block.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    public static final DeferredBlock<WhitewashedBrickWall> WHITEWASHED_BRICK_WALL =
            BUILDING_BLOCK_REGISTRY.register("whitewashedbrickwall",
                    () -> new WhitewashedBrickWall(Block.Properties.ofFullCopy(Blocks.BRICK_WALL)));

    // Shingles (like bricks)
    public static final DeferredBlock<ShinglesBlock> SHINGLESBLOCK =
            BUILDING_BLOCK_REGISTRY.register("shinglesblock",
                    () -> new ShinglesBlock(Block.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<ShinglesSlab> SHINGLESSLAB =
            BUILDING_BLOCK_REGISTRY.register("shinglesslab",
                    () -> new ShinglesSlab(Block.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final DeferredBlock<ShinglesStairs> SHINGLESSTAIRS =
            BUILDING_BLOCK_REGISTRY.register("shinglesstairs",
                    () -> new ShinglesStairs(Block.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    // Tan Stucco Bricks (like bricks)
    public static final DeferredBlock<TanStuccoBricks> TANSTUCCOBRICKS =
            BUILDING_BLOCK_REGISTRY.register("tanstuccobricks",
                    () -> new TanStuccoBricks(Block.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<TanStuccoBrickSlab> TANSTUCCOBRICKSLAB =
            BUILDING_BLOCK_REGISTRY.register("tanstuccobrickslab",
                    () -> new TanStuccoBrickSlab(Block.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final DeferredBlock<TanStuccoBrickStairs> TANSTUCCOBRICKSTAIRS =
            BUILDING_BLOCK_REGISTRY.register("tanstuccobrickstairs",
                    () -> new TanStuccoBrickStairs(Block.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    public static final DeferredBlock<TanStuccoBrickWall> TANSTUCCOBRICKWALL =
            BUILDING_BLOCK_REGISTRY.register("tanstuccobrickwall",
                    () -> new TanStuccoBrickWall(Block.Properties.ofFullCopy(Blocks.BRICK_WALL)));

    // Ornate Cuman Brick (like bricks)
    public static final DeferredBlock<OrnateCumanBrick> ORNATECUMANBRICK =
            BUILDING_BLOCK_REGISTRY.register("ornatecumanbrick",
                    () -> new OrnateCumanBrick(Block.Properties.ofFullCopy(Blocks.BRICKS)));

    // Hide Bedroll (like wool, no occlusion)
    public static final DeferredBlock<HideBedrollBlock> HIDE_BEDROLL =
            BUILDING_BLOCK_REGISTRY.register("hide_bedroll",
                    () -> new HideBedrollBlock(Block.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                            .noOcclusion()
                            .strength(0.2F)));
}
