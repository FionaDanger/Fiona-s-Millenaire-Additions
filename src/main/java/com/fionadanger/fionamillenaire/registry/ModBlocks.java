package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.FionaMillenaire;
import com.fionadanger.fionamillenaire.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, FionaMillenaire.MODID);

    // ------------------------------------------------------------
    // Wicker + Stickwall (like planks)
    // ------------------------------------------------------------

    public static final Supplier<Block> WICKER = BLOCKS.register("wicker",
            () -> new WickerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final Supplier<Block> STICKWALLBLOCK = BLOCKS.register("stickwall",
            () -> new StickwallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // ------------------------------------------------------------
    // Palm Thatch (like bamboo planks but weaker)
    // ------------------------------------------------------------

    public static final Supplier<Block> PALMTHATCHBLOCK = BLOCKS.register("palmthatchblock",
            () -> new PalmThatchBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.6F) // weaker than bamboo planks
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()));

    public static final Supplier<Block> PALMTHATCHSLAB = BLOCKS.register("palmthatchslab",
            () -> new PalmThatchSlab(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.6F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()));

    public static final Supplier<Block> PALMTHATCHSTAIRS = BLOCKS.register("palmthatchstairs",
            () -> new PalmThatchStairs(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.6F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()));

    // ------------------------------------------------------------
    // Caribou Hide (like wool)
    // ------------------------------------------------------------

    public static final Supplier<Block> CARIBOUHIDEBLOCK = BLOCKS.register("caribouhideblock",
            () -> new CaribouHideBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final Supplier<Block> CARIBOUHIDESLAB = BLOCKS.register("caribouhideslab",
            () -> new CaribouHideSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final Supplier<Block> CARIBOUHIDESTAIRS = BLOCKS.register("caribouhidestairs",
            () -> new CaribouHideStairs(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    // ------------------------------------------------------------
    // Sealskin (like wool)
    // ------------------------------------------------------------

    public static final Supplier<Block> SEALSKINBLOCK = BLOCKS.register("sealskinblock",
            () -> new SealskinBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final Supplier<Block> SEALSKINSLAB = BLOCKS.register("sealskinslab",
            () -> new SealskinSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

    public static final Supplier<Block> SEALSKINSTAIRS = BLOCKS.register("sealskinstairs",
            () -> new SealskinStairs(
                    BlockBehaviour.Properties.of()
                            .strength(0.8F)
                            .sound(SoundType.WOOL)
                            .ignitedByLava()
            ));));

    // ------------------------------------------------------------
    // Whitewashed Bricks (like bricks)
    // ------------------------------------------------------------

    public static final Supplier<Block> WHITEWASHEDBRICKS = BLOCKS.register("whitewashedbricks",
            () -> new WhitewashedBricks(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final Supplier<Block> WHITEWASHEDBRICKSLAB = BLOCKS.register("whitewashedbrickslab",
            () -> new WhitewashedBrickSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final Supplier<Block> WHITEWASHEDBRICKSTAIRS = BLOCKS.register("whitewashedbrickstairs",
            () -> new WhitewashedBrickStairs(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    // ------------------------------------------------------------
    // Shingles (like bricks)
    // ------------------------------------------------------------

    public static final Supplier<Block> SHINGLESBLOCK = BLOCKS.register("shinglesblock",
            () -> new ShinglesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final Supplier<Block> SHINGLESSLAB = BLOCKS.register("shinglesslab",
            () -> new ShinglesSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final Supplier<Block> SHINGLESSTAIRS = BLOCKS.register("shinglesstairs",
            () -> new ShinglesStairs(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    // ------------------------------------------------------------
    // Tan Stucco Bricks (like bricks)
    // ------------------------------------------------------------

    public static final Supplier<Block> TANSTUCCOBRICKS = BLOCKS.register("tanstuccobricks",
            () -> new TanStuccoBricks(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final Supplier<Block> TANSTUCCOBRICKSLAB = BLOCKS.register("tanstuccobrickslab",
            () -> new TanStuccoBrickSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)));

    public static final Supplier<Block> TANSTUCCOBRICKSTAIRS = BLOCKS.register("tanstuccobrickstairs",
            () -> new TanStuccoBrickStairs(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS)));

    // ------------------------------------------------------------
    // Ornate Cuman Brick (like bricks)
    // ------------------------------------------------------------

    public static final Supplier<Block> ORNATECUMANBRICK = BLOCKS.register("ornatecumanbrick",
            () -> new OrnateCumanBrick(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    // ------------------------------------------------------------
    // Hide Bedroll (like wool)
    // ------------------------------------------------------------

    public static final Supplier<Block> HIDE_BEDROLL = BLOCKS.register("hide_bedroll",
            () -> new HideBedrollBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .noOcclusion()
                    .strength(0.2F)));
}
