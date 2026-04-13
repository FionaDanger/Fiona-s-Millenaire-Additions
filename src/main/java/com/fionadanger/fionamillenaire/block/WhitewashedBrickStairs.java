package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WhitewashedBrickStairs extends StairBlock {
    public WhitewashedBrickStairs(BlockBehaviour.Properties properties) {
        super(ModBlocks.WHITEWASHEDBRICKS.get().defaultBlockState(), properties);
    }
}
