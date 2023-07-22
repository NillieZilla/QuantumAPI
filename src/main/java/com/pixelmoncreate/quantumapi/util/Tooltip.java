package com.pixelmoncreate.quantumapi.util;

import net.minecraft.ChatFormatting;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public class Tooltip extends Localizable {
    public Tooltip(String key) {
        super(key, ChatFormatting.GRAY);
    }

    public Tooltip(String key, ChatFormatting defaultColor) {
        super(key, defaultColor);
    }

}