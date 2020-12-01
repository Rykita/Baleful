package com.fakerac.baleful.init;

import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class BalefulItemGroups {

    public static final ItemGroup BALEFUL_COMBAT = new ItemGroup("baleful_combat") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ARDORIUM_SWORD.get());
        }
    };

    public static final ItemGroup BALEFUL_TOOLS = new ItemGroup("baleful_tools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ARDORIUM_PICKAXE.get());
        }
    };

    public static final ItemGroup BALEFUL_BUILDING_BLOCKS = new ItemGroup("baleful_building_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BLOSSOM_STEM.get());
        }
    };

    public static final ItemGroup BALEFUL_DECORATIONS = new ItemGroup("baleful_decorations") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BLOSSOM_PLANKS_FENCE.get());
        }
    };

    public static final ItemGroup BALEFUL_REDSTONE = new ItemGroup("baleful_redstone") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BLOSSOM_PLANKS_DOOR.get());
        }
    };

    public static final ItemGroup BALEFUL_MISCELLANEOUS = new ItemGroup("baleful_miscellaneous") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ARDORIUM_INGOT.get());
        }
    };
}
