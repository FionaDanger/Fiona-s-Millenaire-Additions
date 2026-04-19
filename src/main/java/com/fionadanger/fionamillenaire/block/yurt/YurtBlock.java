package com.fionadanger.fionamillenaire.block.yurt;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import com.fionadanger.fionamillenaire.item.InitItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class YurtBlock extends BaseEntityBlock {
    public YurtBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends YurtBlock> codec() {
        return simpleCodec(YurtBlock::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new YurtBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                                              Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) {
            return ItemInteractionResult.SUCCESS;
        }

        if (!(level.getBlockEntity(pos) instanceof YurtBlockEntity yurtBE)) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        Direction face = hit.getDirection();

        if (stack.is(Items.SHEARS)) {
            yurtBE.resetFace(face);
            return ItemInteractionResult.SUCCESS;
        }

        YurtColor color = resolveColor(stack);
        if (color != null) {
            yurtBE.setFaceColor(face, color);
            if (!player.isCreative()) {
                stack.shrink(1);
            }
            return ItemInteractionResult.SUCCESS;
        }

        YurtPattern pattern = resolvePattern(stack);
        if (pattern != null) {
            yurtBE.setFacePattern(face, pattern);
            if (!player.isCreative()) {
                stack.shrink(1);
            }
            return ItemInteractionResult.SUCCESS;
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    // Hook these into your actual item registry
    private YurtColor resolveColor(ItemStack stack) {
        // Check for specific registered items
        if (stack.is(InitItems.WHITEFELT.get())) return YurtColor.WHITE;
        if (stack.is(InitItems.REDFELT.get())) return YurtColor.RED;

        return null;
    }

    private YurtPattern resolvePattern(ItemStack stack) {
        // Check for specific registered pattern items
        if (stack.is(InitItems.WATERPATTERNFELT.get())) return YurtPattern.WATER;
        if (stack.is(InitItems.RAMPATTERNFELT.get())) return YurtPattern.RAM;
        if (stack.is(net.minecraft.world.item.Items.STRING)) return YurtPattern.ROPE;
        if (stack.is(InitItems.AMULETPATTERNFELT.get())) return YurtPattern.AMULET;

        return null;
    }
}