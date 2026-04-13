package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CaribouHideStairs extends StairBlock {
    public CaribouHideStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.CARIBOUHIDEBLOCK.get().defaultBlockState(), properties);
    }
}
