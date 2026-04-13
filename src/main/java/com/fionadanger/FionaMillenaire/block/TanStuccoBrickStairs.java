package com.fionadanger.FionaMillenaire.block;

import com.fionadanger.FionaMillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TanStuccoBrickStairs extends StairBlock {
    public TanStuccoBrickStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.TANSTUCCOBRICKS.get().defaultBlockState(), properties);
    }
}
