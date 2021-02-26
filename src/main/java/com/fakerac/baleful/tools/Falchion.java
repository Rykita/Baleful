package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Falchion extends SwordItem {
    public Falchion() {
        super(BalefulItemTier.TIER1_WEAPON_TYPE, 6, -2.4F,
                new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.hitEntity(stack, target, attacker);
        if (target instanceof LivingEntity) {
            ((LivingEntity)target).addPotionEffect(new EffectInstance(Effects.WEAKNESS, 60, 2));
            return true;
        }
        return false;
    }
}
