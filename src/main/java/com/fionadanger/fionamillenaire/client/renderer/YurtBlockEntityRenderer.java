package com.fionadanger.fionamillenaire.client.renderer;

import com.fionadanger.fionamillenaire.block.yurt.YurtBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public class YurtBlockEntityRenderer implements BlockEntityRenderer<YurtBlockEntity> {

    private static final ResourceLocation BASE_TEXTURE = ResourceLocation.fromNamespaceAndPath(
            "fionamillenaire", "block/yurt/base"
    );

    public YurtBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(@NotNull YurtBlockEntity be, float partialTick, PoseStack poseStack,
                       @NotNull MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Matrix4f matrix = poseStack.last().pose();

        for (Direction dir : Direction.values()) {
            ResourceLocation texture = be.isFaceBase(dir)
                    ? BASE_TEXTURE
                    : getTextureForFace(be.getFaceColorOrdinal(dir), be.getFacePatternOrdinal(dir));

            VertexConsumer vc = bufferSource.getBuffer(RenderType.entityCutoutNoCull(texture));
            renderFace(vc, matrix, dir, packedLight, packedOverlay);
        }
    }

    private void renderFace(VertexConsumer vc, Matrix4f mat, Direction dir, int light, int overlay) {
        float u0 = 0, u1 = 1, v0 = 0, v1 = 1;
        switch (dir) {
            case DOWN -> {
                vc.addVertex(mat, 0, 0, 0).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0, -1, 0);
                vc.addVertex(mat, 1, 0, 0).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0, -1, 0);
                vc.addVertex(mat, 1, 0, 1).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0, -1, 0);
                vc.addVertex(mat, 0, 0, 1).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0, -1, 0);
            }
            case UP -> {
                vc.addVertex(mat, 0, 1, 0).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0, 1, 0);
                vc.addVertex(mat, 1, 1, 0).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0, 1, 0);
                vc.addVertex(mat, 1, 1, 1).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0, 1, 0);
                vc.addVertex(mat, 0, 1, 1).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0, 1, 0);
            }
            case NORTH -> {
                vc.addVertex(mat, 0, 0, 0).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0, 0, -1);
                vc.addVertex(mat, 1, 0, 0).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0, 0, -1);
                vc.addVertex(mat, 1, 1, 0).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0, 0, -1);
                vc.addVertex(mat, 0, 1, 0).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0, 0, -1);
            }
            case SOUTH -> {
                vc.addVertex(mat, 0, 0, 1).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0, 0, 1);
                vc.addVertex(mat, 1, 0, 1).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0, 0, 1);
                vc.addVertex(mat, 1, 1, 1).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0, 0, 1);
                vc.addVertex(mat, 0, 1, 1).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0, 0, 1);
            }
            case WEST -> {
                vc.addVertex(mat, 0, 0, 0).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(-1, 0, 0);
                vc.addVertex(mat, 0, 0, 1).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(-1, 0, 0);
                vc.addVertex(mat, 0, 1, 1).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(-1, 0, 0);
                vc.addVertex(mat, 0, 1, 0).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(-1, 0, 0);
            }
            case EAST -> {
                vc.addVertex(mat, 1, 0, 0).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(1, 0, 0);
                vc.addVertex(mat, 1, 0, 1).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(1, 0, 0);
                vc.addVertex(mat, 1, 1, 1).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(1, 0, 0);
                vc.addVertex(mat, 1, 1, 0).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(1, 0, 0);
            }
        }
    }

    private ResourceLocation getTextureForFace(int colorOrdinal, int patternOrdinal) {
        String[] colors = {"white", "red"};
        String[] patterns = {"plain", "water", "amulet", "rope", "ram"};
        String color = colorOrdinal < colors.length ? colors[colorOrdinal] : "white";
        String pattern = patternOrdinal < patterns.length ? patterns[patternOrdinal] : "plain";
        return ResourceLocation.fromNamespaceAndPath("fionamillenaire", "block/yurt/" + color + "_" + pattern);
    }
}