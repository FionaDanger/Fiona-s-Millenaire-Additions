package com.fionadanger.fionamillenaire.block.yurt;

import net.minecraft.resources.ResourceLocation;
import java.util.HashMap;
import java.util.Map;


public enum YurtPattern {
    PLAIN("plain"),
    STRIPED("striped"),
    DIAMOND("diamond"),
    GEOMETRIC("geometric"); // Add more as needed

    public final String id;
    YurtPattern(String id) { this.id = id; }
}
