package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import com.fakerac.baleful.init.SoundInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class EmberMallet extends PickaxeItem {
    public EmberMallet() {
        super(BalefulItemTier.TIER2_WEAPON_TYPE_MALLET, 9, -3.2F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT)
        .isImmuneToFire());
    }

    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damageItem(1, attacker, (entity) -> {
            entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        if (target instanceof LivingEntity) {
            ((LivingEntity)target).setFire(3);
            ((LivingEntity)target).addPotionEffect(new EffectInstance(Effects.WEAKNESS, 60, 2));
            ((LivingEntity)target).playSound(SoundInit.EMBER_MALLET_SLAM.get(), 0.6F, 1.0F);
        }
        return true;
    }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        return new TranslationTextComponent(this.getTranslationKey()).mergeStyle(TextFormatting.GOLD);
    }
}
