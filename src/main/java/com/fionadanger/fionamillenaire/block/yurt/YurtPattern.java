package com.fionadanger.fionamillenaire.block.yurt;


public enum YurtPattern {
    PLAIN("plain"),
    WATER("water"),
    RAM("ram"),
    ROPE("rope"),
    AMULET("amulet"); // Add more as needed

    public final String id;
    YurtPattern(String id) { this.id = id; }
}
