package com.fakerac.baleful.tools;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Murasama extends SwordItem {
    public Murasama() {
        super(BalefulItemTier.JETSTREAM, 8, -1.6F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT));
    }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        return new TranslationTextComponent(this.getTranslationKey()).mergeStyle(TextFormatting.DARK_RED);
    }
}
