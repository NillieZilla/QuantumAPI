package com.pixelmoncreate.quantumapi.config;

import com.pixelmoncreate.quantumapi.QuantumAPI;
import com.pixelmoncreate.quantumapi.util.FeatureFlag;
import com.pixelmoncreate.quantumapi.util.FeatureFlags;
import net.minecraft.resources.ResourceLocation;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
@FeatureFlags
public final class ModFeatureFlags {
    public static final FeatureFlag NBT_TOOLTIPS = FeatureFlag.create(new ResourceLocation(QuantumAPI.MODID, "nbt_tooltips"), ModConfigs.ENABLE_NBT_TOOLTIPS);
    public static final FeatureFlag TAG_TOOLTIPS = FeatureFlag.create(new ResourceLocation(QuantumAPI.MODID, "tag_tooltips"), ModConfigs.ENABLE_TAG_TOOLTIPS);

}
