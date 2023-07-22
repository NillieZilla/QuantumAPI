package com.pixelmoncreate.quantumapi.item.tool;

import com.pixelmoncreate.quantumapi.core.IEnableable;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import java.util.function.Function;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public class BasePickaxeItem extends PickaxeItem {
    private final float attackDamage;
    private final float attackSpeed;

    public BasePickaxeItem(Tier tier, Function<Properties, Properties> properties) {
        this(tier, 1, -2.8F, properties);
    }

    public BasePickaxeItem(Tier tier, int attackDamage, float attackSpeed, Function<Properties, Properties> properties) {
        super(tier, attackDamage, attackSpeed, properties.apply(new Properties()));
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
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

    public float getAttackDamage() {
        return this.attackDamage + this.getTier().getAttackDamageBonus();
    }

    public float getAttackSpeed() {
        return this.attackSpeed;
    }

}