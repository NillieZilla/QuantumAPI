package com.pixelmoncreate.quantumapi.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import java.util.function.Function;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public class BaseOreBlock extends BaseBlock {
    private final int minExp;
    private final int maxExp;

    public BaseOreBlock(Material material, Function<Properties, Properties> properties, int minExp, int maxExp) {
        super(material, properties.compose(Properties::requiresCorrectToolForDrops));
        this.minExp = minExp;
        this.maxExp = maxExp;
    }

    public BaseOreBlock(Material material, SoundType sound, float hardness, float resistance, int minExp, int maxExp) {
        this(material, p -> p.sound(sound).strength(hardness, resistance), minExp, maxExp);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, RandomSource random, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? Mth.nextInt(random, this.minExp, this.maxExp) : 0;
    }

}