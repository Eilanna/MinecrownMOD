
package net.taki.minecrown.creativetab;

import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiCroJobsBotaniste extends ElementsMinecrownMOD.ModElement {
	public TabMiCroJobsBotaniste(ElementsMinecrownMOD instance) {
		super(instance, 163);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmicrojobsbotaniste") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.SAPLING, (int) (1), 2);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
