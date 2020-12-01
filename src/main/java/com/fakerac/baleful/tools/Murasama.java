package com.fakerac.baleful.tools;

import com.fakerac.baleful.util.BalefulItemGroups;
import net.minecraft.item.*;

public class Murasama extends SwordItem {
    public Murasama() {
        super(BalefulItemTier.JETSTREAM, 8, -1.6F, new Item.Properties().group(BalefulItemGroups.BALEFUL_COMBAT).rarity(Rarity.COMMON));
    }


}
