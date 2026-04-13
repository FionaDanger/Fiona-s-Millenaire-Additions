package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ShinglesStairs extends StairBlock {
    public ShinglesStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.SHINGLESBLOCK.get().defaultBlockState(), properties);
    }
}
