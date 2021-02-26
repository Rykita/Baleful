package com.fakerac.baleful.items;

import com.fakerac.baleful.init.BalefulItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

public class ItemEnchantGlintUncommon extends Item {

    public ItemEnchantGlintUncommon(){super(new Item.Properties().group(BalefulItemGroups.BALEFUL_MISCELLANEOUS).rarity(Rarity.UNCOMMON));}

//This basically makes the item using this ItemBase have the enchant glint.
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}


