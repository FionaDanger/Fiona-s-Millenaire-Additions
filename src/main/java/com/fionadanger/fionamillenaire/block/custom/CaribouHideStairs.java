package com.fionadanger.fionamillenaire.block.custom;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CaribouHideStairs extends StairBlock
{
    public CaribouHideStairs(BlockBehaviour.Properties properties)
    {
        super(InitBuildingBlocks.CARIBOUHIDEBLOCK.get().defaultBlockState(), properties);
    }
}
