package com.fionadanger.fionamillenaire.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class PalmThatchBlock extends Block {
    public PalmThatchBlock(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)   // bamboo plank color
                .strength(0.6F)                    // slightly easier to break
                .sound(SoundType.BAMBOO_WOOD)      // bamboo-like wood sound
                .ignitedByLava()                   // flammable
                .instrument(NoteBlockInstrument.BASS)
        );
    }
}
