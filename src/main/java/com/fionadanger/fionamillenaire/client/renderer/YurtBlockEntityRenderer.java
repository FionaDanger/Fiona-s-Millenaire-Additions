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
import org.joml.Matrix4f;

public class YurtBlockEntityRenderer implements BlockEntityRenderer<YurtBlockEntity> {
    // Path to your default/base texture
    private static final ResourceLocation BASE_TEXTURE = ResourceLocation.fromNamespaceAndPath(
            "fionamillenaire", "block/yurt/base"
    );

    public YurtBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(YurtBlockEntity be, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Matrix4f matrix = poseStack.last().pose();

        for (Direction dir : Direction.values()) {
            ResourceLocation texture;
            VertexConsumer vc;

            // Check if face is still default
            if (be.isFaceBase(dir)) {
                texture = BASE_TEXTURE;
                vc = bufferSource.getBuffer(RenderType.solid());
            } else {
                int colorOrd = be.getFaceColorOrdinal(dir);
                int patternOrd = be.getFacePatternOrdinal(dir);
                texture = getTextureForFace(colorOrd, patternOrd);
                vc = bufferSource.getBuffer(RenderType.solid());
            }

            renderFace(vc, matrix, dir, packedLight, packedOverlay);
        }
    }

    private void renderFace(VertexConsumer vc, Matrix4f mat, Direction dir, int light, int overlay) {
        float u0 = 0.0f, u1 = 1.0f, v0 = 0.0f, v1 = 1.0f;
        switch (dir) {
            case DOWN -> {
                vc.addVertex(mat, 0.0f, 0.0f, 0.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, -1.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 0.0f, 0.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, -1.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 0.0f, 1.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, -1.0f, 0.0f);
                vc.addVertex(mat, 0.0f, 0.0f, 1.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, -1.0f, 0.0f);
            }
            case UP -> {
                vc.addVertex(mat, 0.0f, 1.0f, 0.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 1.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 0.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 1.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 1.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 1.0f, 0.0f);
                vc.addVertex(mat, 0.0f, 1.0f, 1.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 1.0f, 0.0f);
            }
            case NORTH -> {
                vc.addVertex(mat, 0.0f, 0.0f, 0.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, -1.0f);
                vc.addVertex(mat, 1.0f, 0.0f, 0.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, -1.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 0.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, -1.0f);
                vc.addVertex(mat, 0.0f, 1.0f, 0.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, -1.0f);
            }
            case SOUTH -> {
                vc.addVertex(mat, 0.0f, 0.0f, 1.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, 1.0f);
                vc.addVertex(mat, 1.0f, 0.0f, 1.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, 1.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 1.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, 1.0f);
                vc.addVertex(mat, 0.0f, 1.0f, 1.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(0.0f, 0.0f, 1.0f);
            }
            case WEST -> {
                vc.addVertex(mat, 0.0f, 0.0f, 0.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(-1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 0.0f, 0.0f, 1.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(-1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 0.0f, 1.0f, 1.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(-1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 0.0f, 1.0f, 0.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(-1.0f, 0.0f, 0.0f);
            }
            case EAST -> {
                vc.addVertex(mat, 1.0f, 0.0f, 0.0f).setColor(-1).setUv(u0, v0).setOverlay(overlay).setLight(light).setNormal(1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 0.0f, 1.0f).setColor(-1).setUv(u1, v0).setOverlay(overlay).setLight(light).setNormal(1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 1.0f).setColor(-1).setUv(u1, v1).setOverlay(overlay).setLight(light).setNormal(1.0f, 0.0f, 0.0f);
                vc.addVertex(mat, 1.0f, 1.0f, 0.0f).setColor(-1).setUv(u0, v1).setOverlay(overlay).setLight(light).setNormal(1.0f, 0.0f, 0.0f);
            }
        }
    }

    private ResourceLocation getTextureForFace(int colorOrdinal, int patternOrdinal) {
        String[] colors = {"white", "brown", "tan"};
        String[] patterns = {"plain", "striped", "diamond", "geometric"};

        String color = colorOrdinal < colors.length ? colors[colorOrdinal] : "white";
        String pattern = patternOrdinal < patterns.length ? patterns[patternOrdinal] : "plain";

        return ResourceLocation.fromNamespaceAndPath(
                "fionamillenaire", "block/yurt/" + color + "_" + pattern
        );
    }
}