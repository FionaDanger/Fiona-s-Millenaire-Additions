package com.fionadanger.fionamillenaire.block.yurt;

import com.fionadanger.fionamillenaire.blockentity.InitBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;

public class YurtBlockEntity extends BlockEntity {
    // -1 means "use default/base texture"
    private static final int BASE_STATE = -1;
    private final int[] faceData = new int[6];
    private static final int PATTERN_COUNT = YurtPattern.values().length;

    public YurtBlockEntity(BlockPos pos, BlockState state) {
        super(InitBlockEntities.YURT_BE.get(), pos, state);
        Arrays.fill(faceData, BASE_STATE);
    }

    // Check if a face is still in its default state
    public boolean isFaceBase(Direction dir) {
        return faceData[dir.ordinal()] == BASE_STATE;
    }

    // Apply a new color + pattern combination
    public void setFaceData(Direction dir, YurtColor color, YurtPattern pattern) {
        faceData[dir.ordinal()] = color.ordinal() * PATTERN_COUNT + pattern.ordinal();
        setChanged();
        if (level != null) level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
    }

    // Reset a face back to the base texture
    public void resetFace(Direction dir) {
        faceData[dir.ordinal()] = BASE_STATE;
        setChanged();
        if (level != null) level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
    }

    // Decoders for the renderer
    public int getFaceColorOrdinal(Direction dir) {
        return faceData[dir.ordinal()] / PATTERN_COUNT;
    }

    public int getFacePatternOrdinal(Direction dir) {
        return faceData[dir.ordinal()] % PATTERN_COUNT;
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putIntArray("YurtFaces", faceData);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("YurtFaces")) {
            int[] loaded = tag.getIntArray("YurtFaces");
            System.arraycopy(loaded, 0, faceData, 0, Math.min(loaded.length, 6));
        }
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = super.getUpdateTag(registries);
        saveAdditional(tag, registries);
        return tag;
    }

    @Override
    @Nullable
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}