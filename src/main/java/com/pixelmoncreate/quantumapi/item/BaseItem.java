package com.pixelmoncreate.quantumapi.item;

import com.pixelmoncreate.quantumapi.core.IEnableable;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public class BaseItem extends Item {
    public BaseItem(Function<Properties, Properties> properties) {
        super(properties.apply(new Properties()));
    }

    @Override
    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
        if (this instanceof IEnableable enableable) {
            if (enableable.isEnabled())
                super.fillItemCategory(group, items);
        } else {
            super.fillItemCategory(group, items);
        }
    }

}