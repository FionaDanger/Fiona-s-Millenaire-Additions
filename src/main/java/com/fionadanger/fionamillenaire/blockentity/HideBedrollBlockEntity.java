package com.fionadanger.fionamillenaire.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HideBedrollBlockEntity extends BlockEntity {

    public HideBedrollBlockEntity(BlockPos pos, BlockState state) {
        super(InitBlockEntities.HIDE_BEDROLL_BE.get(), pos, state);
    }
}
