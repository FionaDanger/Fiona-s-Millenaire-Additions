package com.fionadanger.fionamillenaire.block.yurt;

import net.minecraft.resources.ResourceLocation;
import java.util.HashMap;
import java.util.Map;

public class YurtTextures {
    private static final Map<String, ResourceLocation> CACHE = new HashMap<>();

    public static ResourceLocation get(YurtColor color, YurtPattern pattern) {
        String key = color.id + "_" + pattern.id;
        return CACHE.computeIfAbsent(key, k ->
                ResourceLocation.fromNamespaceAndPath("fionamillenaire", "block/yurt/" + k)
        );
    }
}