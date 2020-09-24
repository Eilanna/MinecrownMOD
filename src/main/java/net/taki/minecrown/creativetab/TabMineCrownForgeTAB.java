
package net.taki.minecrown.creativetab;

import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMineCrownForgeTAB extends ElementsMinecrownMOD.ModElement {
	public TabMineCrownForgeTAB(ElementsMinecrownMOD instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabminecrownforgetab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.ANVIL, (int) (1), 0);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
