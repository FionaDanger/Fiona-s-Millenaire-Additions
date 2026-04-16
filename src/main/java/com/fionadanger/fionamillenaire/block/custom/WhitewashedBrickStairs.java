package com.fionadanger.fionamillenaire.block.custom;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WhitewashedBrickStairs extends StairBlock
{
    public WhitewashedBrickStairs(BlockBehaviour.Properties properties)
    {
        super(InitBuildingBlocks.WHITEWASHEDBRICKS.get().defaultBlockState(), properties);
    }
}
