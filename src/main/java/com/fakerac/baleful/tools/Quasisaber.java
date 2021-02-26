package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Quasisaber extends SwordItem {
    public Quasisaber() {
        super(BalefulItemTier.TIER1_WEAPON_TYPE, 1, -0.4F,
                new Item.Properties().rarity(Rarity.RARE).group(BalefulItemGroups.BALEFUL_COMBAT).isImmuneToFire());
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.hitEntity(stack, target, attacker);
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addPotionEffect(new EffectInstance(Effects.WEAKNESS, 30));
            ((LivingEntity) target).setFire(3);
            return true;
        }
        return false;
    }
}
