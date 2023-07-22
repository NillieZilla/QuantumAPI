package com.pixelmoncreate.quantumapi.util;

import net.minecraft.util.RandomSource;

import java.text.NumberFormat;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public final class Utils {
    public static final RandomSource RANDOM = RandomSource.create();

    @Deprecated(forRemoval = true)
    public static String format(Object obj) {
        return NumberFormat.getInstance().format(obj);
    }

    public static int randInt(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}