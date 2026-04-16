package com.fionadanger.fionamillenaire.block.custom;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SealskinStairs extends StairBlock
{
    public SealskinStairs(BlockBehaviour.Properties properties)
    {
        super(InitBuildingBlocks.SEALSKINBLOCK.get().defaultBlockState(), properties);
    }
}
