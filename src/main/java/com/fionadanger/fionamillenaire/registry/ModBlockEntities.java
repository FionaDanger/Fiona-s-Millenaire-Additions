package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.*;
import com.fionadanger.fionamillenaire.block.entity.HideBedrollBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, fionamillenaire.MODID);

    public static final RegistryObject<BlockEntityType<HideBedrollBlockEntity>> HIDE_BEDROLL =
            BLOCK_ENTITIES.register("hide_bedroll",
                    () -> BlockEntityType.Builder.of(
                            HideBedrollBlockEntity::new,
                            ModBlocks.HIDE_BEDROLL.get()
                    ).build(null));
}
