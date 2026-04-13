package com.fionadanger.FionaMillenaire.registry;

import com.fionadanger.FionaMillenaire.FionaMillenaire;
import com.fionadanger.FionaMillenaire.block.entity.HideBedrollBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, fionamillenaire.MODID);

    public static final Supplier<BlockEntityType<HideBedrollBlockEntity>> HIDE_BEDROLL =
            BLOCK_ENTITIES.register("hide_bedroll",
                    () -> BlockEntityType.Builder.of(
                            HideBedrollBlockEntity::new,
                            ModBlocks.HIDE_BEDROLL.get()
                    ).build(null));
}
