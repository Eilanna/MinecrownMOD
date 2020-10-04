
package net.taki.minecrown.creativetab;

import net.taki.minecrown.block.BlockMachineMineur;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiCroJobsMineur extends ElementsMinecrownMOD.ModElement {
	public TabMiCroJobsMineur(ElementsMinecrownMOD instance) {
		super(instance, 162);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmicrojobsmineur") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockMachineMineur.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
