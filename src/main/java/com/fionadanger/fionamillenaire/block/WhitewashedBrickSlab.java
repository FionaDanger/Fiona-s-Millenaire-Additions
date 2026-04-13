package com.fionadanger.fionamillenaire.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class WhitewashedBrickSlab extends SlabBlock {
    public WhitewashedBrickSlab() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_LIGHT_GRAY)
                .strength(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .instrument(NoteBlockInstrument.BASEDRUM)
        );
    }
}
