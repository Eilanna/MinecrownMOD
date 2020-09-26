
package net.taki.minecrown.creativetab;

import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiCroJobsForgeron extends ElementsMinecrownMOD.ModElement {
	public TabMiCroJobsForgeron(ElementsMinecrownMOD instance) {
		super(instance, 164);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmicrojobsforgeron") {
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
