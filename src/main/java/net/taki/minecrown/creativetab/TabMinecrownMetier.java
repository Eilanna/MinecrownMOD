
package net.taki.minecrown.creativetab;

import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMinecrownMetier extends ElementsMinecrownMOD.ModElement {
	public TabMinecrownMetier(ElementsMinecrownMOD instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabminecrownmetier") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.IRON_BLOCK, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
