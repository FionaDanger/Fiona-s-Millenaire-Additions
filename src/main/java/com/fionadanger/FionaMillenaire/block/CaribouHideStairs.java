package com.fionadanger.FionaMillenaire.block;

import com.fionadanger.FionaMillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CaribouHideStairs extends StairBlock {
    public CaribouHideStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.CARIBOUHIDEBLOCK.get().defaultBlockState(), properties);
    }
}
