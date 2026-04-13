package com.fionadanger.fionamillenaire.block;

import com.fionadanger.fionamillenaire.registry.ModBlocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class TanStuccoBrickStairs extends StairBlock {
    public TanStuccoBrickStairs(Properties properties) {
        super(() -> ModBlocks.TANSTUCCOBRICKS.get().defaultBlockState(),
                Properties.of()
                        .mapColor(MapColor.SAND)
                        .strength(2.0F, 6.0F)
                        .sound(SoundType.STONE)
                        .requiresCorrectToolForDrops()
                        .instrument(NoteBlockInstrument.BASEDRUM)
        );
    }
}
