package com.fionadanger.fionamillenaire.blockentity;

import com.fionadanger.fionamillenaire.block.yurt.YurtBlockEntity;
import com.fionadanger.fionamillenaire.core.FMConstants;
import com.fionadanger.fionamillenaire.block.InitBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class InitBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, FMConstants.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<YurtBlockEntity>> YURT_BE =
            BLOCK_ENTITIES.register("yurt",
                    () -> BlockEntityType.Builder.of(
                            YurtBlockEntity::new,
                            InitBuildingBlocks.YURT.get() // You'll need to register this block
                    ).build(null));
}