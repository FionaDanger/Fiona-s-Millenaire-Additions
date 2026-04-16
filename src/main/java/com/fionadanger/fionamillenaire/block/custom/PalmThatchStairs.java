package com.fionadanger.fionamillenaire.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PalmThatchStairs extends StairBlock
{
    public PalmThatchStairs(BlockBehaviour.Properties properties)
    {
        super(Blocks.OAK_PLANKS.defaultBlockState(), properties);
    }
}
