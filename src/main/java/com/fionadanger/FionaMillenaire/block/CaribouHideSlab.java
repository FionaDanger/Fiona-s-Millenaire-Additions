package com.fionadanger.FionaMillenaire.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class CaribouHideSlab extends SlabBlock {
    public CaribouHideSlab(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.8F)
                .sound(SoundType.WOOL)
                .ignitedByLava()
                .instrument(NoteBlockInstrument.GUITAR)
        );
    }
}