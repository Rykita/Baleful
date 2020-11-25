package com.fakerac.baleful.tools;

import com.fakerac.baleful.Baleful;
import net.minecraft.item.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public class Murasama extends SwordItem {
    public Murasama() {
        super(BalefulItemTier.JETSTREAM, 8, -1.6F, new Item.Properties().group(Baleful.BALEFUL_COMBAT).rarity(Rarity.COMMON));
    }


}
