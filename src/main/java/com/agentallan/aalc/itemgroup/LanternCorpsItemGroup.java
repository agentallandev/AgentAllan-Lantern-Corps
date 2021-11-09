
package com.agentallan.aalc.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.agentallan.aalc.item.WillRingItem;
import com.agentallan.aalc.AalcModElements;

@AalcModElements.ModElement.Tag
public class LanternCorpsItemGroup extends AalcModElements.ModElement {
	public LanternCorpsItemGroup(AalcModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablantern_corps") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WillRingItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
