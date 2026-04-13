package com.fionadanger.FionaMillenaire.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class TanStuccoBrickSlab extends Block {
    public TanStuccoBrickSlab(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.SAND)
                .strength(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .instrument(NoteBlockInstrument.BASEDRUM)
        );
    }
}
