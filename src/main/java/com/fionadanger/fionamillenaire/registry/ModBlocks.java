package com.fionadanger.fionamillenaire.registry;

import com.fionadanger.fionamillenaire.fionamillenaire;
import com.fionadanger.fionamillenaire.block.HideBedrollBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, fionamillenaire.MODID);

    public static final RegistryObject<Block> HIDE_BEDROLL = BLOCKS.register("hide_bedroll",
            () -> new HideBedrollBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.2F)
                    .noOcclusion()
                    .ignitedByLava()
            ));
}
