package com.fionadanger.fionamillenaire.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class PalmThatchSlab extends SlabBlock {
    public PalmThatchSlab() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .strength(0.6F)
                .sound(SoundType.BAMBOO_WOOD)
                .ignitedByLava()
                .instrument(NoteBlockInstrument.BASS)
        );
    }
}