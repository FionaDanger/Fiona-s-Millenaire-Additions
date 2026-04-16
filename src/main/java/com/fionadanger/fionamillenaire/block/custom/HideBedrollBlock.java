package com.fionadanger.fionamillenaire.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.extensions.IBlockExtension;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HideBedrollBlock extends HorizontalDirectionalBlock implements IBlockExtension {
    public static final BooleanProperty OCCUPIED = BooleanProperty.create("occupied");
    public static final EnumProperty<BedPart> PART = BlockStateProperties.BED_PART;

    public HideBedrollBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(OCCUPIED, false)
                .setValue(PART, BedPart.FOOT));
    }

    @Override
    protected MapCodec<? extends HideBedrollBlock> codec() {
        return simpleCodec(HideBedrollBlock::new);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OCCUPIED, PART);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        if (!level.isClientSide) {
            BlockPos otherPos = pos.relative(state.getValue(FACING));
            level.setBlock(otherPos, state.setValue(PART, BedPart.HEAD), 3);
            level.blockUpdated(pos, Blocks.AIR);
            state.updateNeighbourShapes(level, pos, 3);
        }
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        if (state.getValue(OCCUPIED)) {
            player.displayClientMessage(Component.translatable("block.minecraft.bed.occupied"), true);
            return InteractionResult.FAIL;
        }

        player.startSleepInBed(pos).ifLeft(bedSleepingProblem -> {
            if (bedSleepingProblem.getMessage() != null) {
                player.displayClientMessage(bedSleepingProblem.getMessage(), true);
            }
        });

        return InteractionResult.CONSUME;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (level.isClientSide) {
            return super.playerWillDestroy(level, pos, state, player);
        }

        BedPart part = state.getValue(PART);
        if (part == BedPart.FOOT) {
            BlockPos headPos = pos.relative(state.getValue(FACING));
            BlockState headState = level.getBlockState(headPos);
            if (headState.getBlock() == this && headState.getValue(PART) == BedPart.HEAD) {
                level.setBlock(headPos, Blocks.AIR.defaultBlockState(), 35);
                level.levelEvent(player, 2001, headPos, Block.getId(headState));
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, net.minecraft.world.level.storage.loot.LootParams.Builder builder) {
        if (state.getValue(PART) == BedPart.HEAD) {
            return super.getDrops(state, builder);
        }
        return List.of();
    }

    // IBlockExtension implementations
    @Override
    public boolean isBed(BlockState state, BlockGetter level, BlockPos pos, @Nullable LivingEntity entity) {
        return true;
    }

    public Direction getBedDirection(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(FACING);
    }

    public void setBedOccupied(Level level, BlockPos pos, BlockState state, boolean occupied) {
        level.setBlock(pos, state.setValue(OCCUPIED, occupied), 3);
    }

    public boolean canSetSpawn(BlockState state) {
        return true;
    }
}