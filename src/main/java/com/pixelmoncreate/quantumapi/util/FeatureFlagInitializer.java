package com.pixelmoncreate.quantumapi.util;

import com.pixelmoncreate.quantumapi.QuantumAPI;
import net.minecraftforge.fml.ModList;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public final class FeatureFlagInitializer {
    public static void init() {
        ModList.get().getAllScanData().forEach(data -> {
            data.getAnnotations().forEach(annotation -> {
                if (annotation.annotationType().getClassName().equals(FeatureFlags.class.getName())) {
                    try {
                        Class<?> clazz = Class.forName(annotation.memberName());
                        clazz.getClassLoader().loadClass(clazz.getName());
                    } catch (Exception e) {
                        QuantumAPI.LOGGER.error("Error loading feature flags: {}", annotation.memberName(), e);
                    }
                }
            });
        });
    }

}