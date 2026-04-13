package com.fionadanger.fionamillenaire.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class ShinglesBlock extends Block {
    public ShinglesBlock() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_GRAY)      // dark grey wood tone
                .strength(2.0F, 3.0F)               // plank-like durability
                .sound(SoundType.DECORATED_POT)     // pot-breaking sound
                .ignitedByLava()                    // wooden flammability
                .instrument(NoteBlockInstrument.BASS)
        );
    }
}