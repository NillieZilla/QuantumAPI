package com.pixelmoncreate.quantumapi.lib;

import com.pixelmoncreate.quantumapi.util.Tooltip;
import net.minecraft.ChatFormatting;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public final class Tooltips {
    public static final Tooltip USES_LEFT = new Tooltip("tooltip.quantumapi.uses_left");
    public static final Tooltip ONE_USE_LEFT = new Tooltip("tooltip.quantumapi.one_use_left");
    public static final Tooltip UNLIMITED_USES = new Tooltip("tooltip.quantumapi.unlimited_uses");
    public static final Tooltip HOLD_SHIFT_FOR_INFO = new Tooltip("tooltip.quantumapi.hold_shift_for_info");
    public static final Tooltip BLOCK_TAGS = new Tooltip("tooltip.quantumapi.block_tags", ChatFormatting.DARK_GRAY);
    public static final Tooltip ITEM_TAGS = new Tooltip("tooltip.quantumapi.item_tags", ChatFormatting.DARK_GRAY);
    public static final Tooltip HOLD_CTRL_FOR_TAGS = new Tooltip("tooltip.quantumapi.hold_ctrl_for_tags", ChatFormatting.DARK_GRAY);
    public static final Tooltip HOLD_ALT_FOR_NBT = new Tooltip("tooltip.quantumapi.hold_alt_for_nbt", ChatFormatting.DARK_GRAY);
    public static final Tooltip FAILED_TO_LOAD_NBT = new Tooltip("tooltip.quantumapi.failed_to_load_nbt", ChatFormatting.DARK_GRAY);
    public static final Tooltip NOT_YET_IMPLEMENTED = new Tooltip("tooltip.quantumapi.not_yet_implemented");

}