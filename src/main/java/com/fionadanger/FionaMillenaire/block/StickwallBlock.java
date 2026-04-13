package com.fionadanger.FionaMillenaire.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class StickwallBlock extends Block {

    public StickwallBlock(Properties properties) {
        super(Properties.of()
                .mapColor(MapColor.WOOD)          // same map color as oak planks
                .strength(2.0f, 3.0f)             // hardness 2.0, blast resistance 3.0
                .sound(SoundType.WOOD)            // wooden sound
                .ignitedByLava()                  // same flammability behavior
                .instrument(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.BASS)
        );
    }
}