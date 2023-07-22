package com.pixelmoncreate.quantumapi.lib;

import com.pixelmoncreate.quantumapi.QuantumAPI;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.pixelmoncreate.quantumapi.QuantumAPI.MODID;
import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public final class ModTags {
    public static final TagKey<Block> MINEABLE_WITH_PAXEL = BlockTags.create(new ResourceLocation(MODID, "mineable/paxel"));
    public static final TagKey<Block> MINEABLE_WITH_SICKLE = BlockTags.create(new ResourceLocation(MODID, "mineable/sickle"));

}