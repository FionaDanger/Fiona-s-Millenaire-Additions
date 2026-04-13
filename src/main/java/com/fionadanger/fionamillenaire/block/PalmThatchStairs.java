package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PalmThatchStairs extends StairBlock {
    public PalmThatchStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.PALMTHATCHBLOCK.get().defaultBlockState(), properties);
    }
}
