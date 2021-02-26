package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class LuminousScimitar extends SwordItem {
    public LuminousScimitar() {
        super(BalefulItemTier.TIER1_WEAPON_TYPE, 8, -2.4F,
                new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.RARE));
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.hitEntity(stack, target, attacker);
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addPotionEffect(new EffectInstance(Effects.GLOWING, 100));
            ((LivingEntity) target).addPotionEffect(new EffectInstance(Effects.POISON, 40, 1));
            return true;
        }
        return false;
    }
}
