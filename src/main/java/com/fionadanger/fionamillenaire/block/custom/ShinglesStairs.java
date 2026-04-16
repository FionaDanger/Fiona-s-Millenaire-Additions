package com.fionadanger.fionamillenaire.block.custom;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ShinglesStairs extends StairBlock
{
    public ShinglesStairs(BlockBehaviour.Properties properties)
    {
        super(InitBuildingBlocks.SHINGLESBLOCK.get().defaultBlockState(), properties);
    }
}
