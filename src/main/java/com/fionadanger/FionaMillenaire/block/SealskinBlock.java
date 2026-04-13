package com.fionadanger.FionaMillenaire.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class SealskinBlock extends Block {
    public SealskinBlock(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.COLOR_LIGHT_BLUE)
                .strength(0.8F)
                .sound(SoundType.WOOL)
                .ignitedByLava()
                .instrument(NoteBlockInstrument.GUITAR)
        );
    }
}