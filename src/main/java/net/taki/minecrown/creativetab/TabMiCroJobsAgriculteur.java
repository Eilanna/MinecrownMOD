
package net.taki.minecrown.creativetab;

import net.taki.minecrown.block.BlockMachineBroyeuse;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiCroJobsAgriculteur extends ElementsMinecrownMOD.ModElement {
	public TabMiCroJobsAgriculteur(ElementsMinecrownMOD instance) {
		super(instance, 159);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmicrojobsagriculteur") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockMachineBroyeuse.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
