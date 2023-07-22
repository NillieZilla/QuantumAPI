package com.pixelmoncreate.quantumapi.item;

import com.pixelmoncreate.quantumapi.core.IEnableable;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public class BaseEnableableItem extends BaseItem implements IEnableable {
    private final Supplier<Boolean> condition;

    public BaseEnableableItem(Supplier<Boolean> condition, Function<Properties, Properties> properties) {
        super(properties);
        this.condition = condition;
    }

    @Override
    public boolean isEnabled() {
        return this.condition.get();
    }

}