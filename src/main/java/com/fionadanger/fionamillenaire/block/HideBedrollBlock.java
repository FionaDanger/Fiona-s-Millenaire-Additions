package com.fionadanger.fionamillenaire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HideBedrollBlock extends BedBlock {

    public static final EnumProperty<BedPart> PART = BlockStateProperties.BED_PART;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 4, 16); // 4 pixels tall

    public HideBedrollBlock(Properties props) {
        super(DyeColor.WHITE, props); // Required in 1.20.1
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(PART, BedPart.FOOT)
                        .setValue(FACING, Direction.NORTH)
                        .setValue(OCCUPIED, false)
        );
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        // Forces Minecraft to use your JSON models instead of the vanilla bed renderer
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        // Makes the bedroll a flat 4‑pixel‑tall slab
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // BedBlock requires these properties
        builder.add(PART, FACING, OCCUPIED);
    }

    @Override
    public BlockState rotate(BlockState state, net.minecraft.world.level.block.Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, net.minecraft.world.level.block.Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}
