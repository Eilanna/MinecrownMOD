
package net.taki.minecrown.creativetab;

import net.taki.minecrown.block.BlockMachineScieuse;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiCroJobsMenuisier extends ElementsMinecrownMOD.ModElement {
	public TabMiCroJobsMenuisier(ElementsMinecrownMOD instance) {
		super(instance, 160);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmicrojobsmenuisier") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockMachineScieuse.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
