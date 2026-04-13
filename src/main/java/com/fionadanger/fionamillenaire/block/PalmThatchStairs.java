package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class PalmThatchStairs extends StairBlock {
    public PalmThatchStairs() {
        super(() -> ModBlocks.PALMTHATCHBLOCK.get().defaultBlockState(),
                Properties.of()
                        .mapColor(MapColor.COLOR_YELLOW)
                        .strength(0.6F)
                        .sound(SoundType.BAMBOO_WOOD)
                        .ignitedByLava()
                        .instrument(NoteBlockInstrument.BASS)
        );
    }
}