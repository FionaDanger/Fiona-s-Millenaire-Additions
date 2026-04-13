package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class ShinglesStairs extends StairBlock {
    public ShinglesStairs() {
        super(() -> ModBlocks.SHINGLESBLOCK.get().defaultBlockState(),
                Properties.of()
                        .mapColor(MapColor.COLOR_GRAY)
                        .strength(2.0F, 3.0F)
                        .sound(SoundType.DECORATED_POT)
                        .ignitedByLava()
                        .instrument(NoteBlockInstrument.BASS)
        );
    }
}