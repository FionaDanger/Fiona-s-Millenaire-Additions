package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class CaribouHideStairs extends StairBlock {
    public CaribouHideStairs(Properties properties) {
        super(() -> ModBlocks.CARIBOUHIDEBLOCK.get().defaultBlockState(),
                Properties.of()
                        .mapColor(MapColor.COLOR_BROWN)
                        .strength(0.8F)
                        .sound(SoundType.WOOL)
                        .ignitedByLava()
                        .instrument(NoteBlockInstrument.GUITAR)
        );
    }
}