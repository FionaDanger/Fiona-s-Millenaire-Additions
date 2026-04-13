package com.fionadanger.FionaMillenaire.block;

import com.fionadanger.FionaMillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PalmThatchStairs extends StairBlock {
    public PalmThatchStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.PALMTHATCHBLOCK.get().defaultBlockState(), properties);
    }
}
