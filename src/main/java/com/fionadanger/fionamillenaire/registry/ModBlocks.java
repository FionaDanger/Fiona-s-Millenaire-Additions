package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import com.fionadanger.fionamillenaire.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, fionamillenaire.MODID);

    // Wicker + Stickwall
    public static final RegistryObject<Block> WICKER =
            BLOCKS.register("wicker", () -> new WickerBlock());

    public static final RegistryObject<Block> STICKWALLBLOCK =
            BLOCKS.register("stickwall", () -> new StickwallBlock());

    // PALM THATCH
    public static final RegistryObject<Block> PALMTHATCHBLOCK =
            BLOCKS.register("palmthatchblock", () -> new PalmThatchBlock());

    public static final RegistryObject<Block> PALMTHATCHSLAB =
            BLOCKS.register("palmthatchslab", () -> new PalmThatchSlab());

    public static final RegistryObject<Block> PALMTHATCHSTAIRS =
            BLOCKS.register("palmthatchstairs", () -> new PalmThatchStairs());

    // CARIBOU HIDE
    public static final RegistryObject<Block> CARIBOUHIDEBLOCK =
            BLOCKS.register("caribouhideblock", () -> new CaribouHideBlock());

    public static final RegistryObject<Block> CARIBOUHIDESLAB =
            BLOCKS.register("caribouhideslab", () -> new CaribouHideSlab());

    public static final RegistryObject<Block> CARIBOUHIDESTAIRS =
            BLOCKS.register("caribouhidestairs", () -> new CaribouHideStairs());

    // SEALSKIN
    public static final RegistryObject<Block> SEALSKINBLOCK =
            BLOCKS.register("sealskinblock", () -> new SealskinBlock());

    public static final RegistryObject<Block> SEALSKINSLAB =
            BLOCKS.register("sealskinslab", () -> new SealskinSlab());

    public static final RegistryObject<Block> SEALSKINSTAIRS =
            BLOCKS.register("sealskinstairs", () -> new SealskinStairs());

    // WHITEWASHED BRICKS
    public static final RegistryObject<Block> WHITEWASHEDBRICKS =
            BLOCKS.register("whitewashedbricks", () -> new WhitewashedBricks());

    public static final RegistryObject<Block> WHITEWASHEDBRICKSLAB =
            BLOCKS.register("whitewashedbrickslab", () -> new WhitewashedBrickSlab());

    public static final RegistryObject<Block> WHITEWASHEDBRICKSTAIRS =
            BLOCKS.register("whitewashedbrickstairs", () -> new WhitewashedBrickStairs());

    // SHINGLES
    public static final RegistryObject<Block> SHINGLESBLOCK =
            BLOCKS.register("shinglesblock", () -> new ShinglesBlock());

    public static final RegistryObject<Block> SHINGLESSLAB =
            BLOCKS.register("shinglesslab", () -> new ShinglesSlab());

    public static final RegistryObject<Block> SHINGLESSTAIRS =
            BLOCKS.register("shinglesstairs", () -> new ShinglesStairs());

    // TAN STUCCO BRICKS
    public static final RegistryObject<Block> TANSTUCCOBRICKS =
            BLOCKS.register("tanstuccobricks", () -> new TanStuccoBricks());

    public static final RegistryObject<Block> TANSTUCCOBRICKSLAB =
            BLOCKS.register("tanstuccobrickslab", () -> new TanStuccoBrickSlab());

    public static final RegistryObject<Block> TANSTUCCOBRICKSTAIRS =
            BLOCKS.register("tanstuccobrickstairs", () -> new TanStuccoBrickStairs());

    // ORNATE CUMAN BRICK
    public static final RegistryObject<Block> ORNATECUMANBRICK =
            BLOCKS.register("ornatecumanbrick", () -> new OrnateCumanBrick());

    // HIDE BEDROLL
    public static final RegistryObject<Block> HIDE_BEDROLL =
            BLOCKS.register("hide_bedroll",
                    () -> new HideBedrollBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_BROWN)
                            .strength(0.2F)
                            .noOcclusion()
                            .ignitedByLava()
                    ));
}
