package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class SealskinStairs extends StairBlock {
    public SealskinStairs() {
        super(() -> ModBlocks.SEALSKINBLOCK.get().defaultBlockState(),
                Properties.of()
                        .mapColor(MapColor.COLOR_LIGHT_BLUE)
                        .strength(0.8F)
                        .sound(SoundType.WOOL)
                        .ignitedByLava()
                        .instrument(NoteBlockInstrument.GUITAR)
        );
    }
}
