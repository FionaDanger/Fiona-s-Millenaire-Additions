package com.fionadanger.fionamillenaire.block.custom;

import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import com.fionadanger.fionamillenaire.block.*;

public class TanStuccoBrickStairs extends StairBlock
{
    public TanStuccoBrickStairs(BlockBehaviour.Properties properties)
    {
        super(InitBuildingBlocks.TANSTUCCOBRICKS.get().defaultBlockState(), properties);
    }
}
