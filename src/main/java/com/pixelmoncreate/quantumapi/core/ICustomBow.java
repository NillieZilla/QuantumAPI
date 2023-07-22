package com.pixelmoncreate.quantumapi.core;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public interface ICustomBow {
    default float getDrawSpeedMulti(ItemStack stack) {
        return 1.0F;
    }

    boolean hasFOVChange();

    static ItemStack findAmmo(Player player) {
        if (isArrow(player.getItemInHand(InteractionHand.OFF_HAND))) {
            return player.getItemInHand(InteractionHand.OFF_HAND);
        } else if (isArrow(player.getItemInHand(InteractionHand.MAIN_HAND))) {
            return player.getItemInHand(InteractionHand.MAIN_HAND);
        } else {
            for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
                var stack = player.getInventory().getItem(i);
                if (isArrow(stack)) {
                    return stack;
                }
            }

            return ItemStack.EMPTY;
        }
    }

    static boolean isArrow(ItemStack stack) {
        return stack.getItem() instanceof ArrowItem;
    }
}