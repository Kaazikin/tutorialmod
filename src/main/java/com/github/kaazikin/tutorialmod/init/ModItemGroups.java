package com.github.kaazikin.tutorialmod.init;

import com.github.kaazikin.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {
    public static class ModItemGroup extends ItemGroup{
        Supplier<ItemStack> iconSupplier;
        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier){
            super(name);
            this.iconSupplier = iconSupplier;
        }

        public ItemStack createIcon(){
            return iconSupplier.get();
        }
    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(TutorialMod.MODID,
            () -> new ItemStack(ModItems.EXAMPLE_ITEM));
}
