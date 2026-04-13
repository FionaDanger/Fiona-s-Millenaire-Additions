package com.fionadanger.FionaMillenaire.block;

import com.fionadanger.FionaMillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SealskinStairs extends StairBlock {
    public SealskinStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.SEALSKINBLOCK.get().defaultBlockState(), properties);
    }
}
