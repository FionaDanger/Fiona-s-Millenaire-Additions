package com.fionadanger.FionaMillenaire.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class ShinglesSlab extends SlabBlock {
    public ShinglesSlab(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.COLOR_GRAY)
                .strength(2.0F, 3.0F)
                .sound(SoundType.DECORATED_POT)
                .ignitedByLava()
                .instrument(NoteBlockInstrument.BASS)
        );
    }
}