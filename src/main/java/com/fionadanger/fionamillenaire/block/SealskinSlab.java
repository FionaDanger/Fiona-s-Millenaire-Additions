package com.fionadanger.fionamillenaire.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class SealskinSlab extends SlabBlock {
    public SealskinSlab(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.COLOR_LIGHT_BLUE)
                .strength(0.8F)
                .sound(SoundType.WOOL)
                .ignitedByLava()
                .instrument(NoteBlockInstrument.GUITAR)
        );
    }
}
