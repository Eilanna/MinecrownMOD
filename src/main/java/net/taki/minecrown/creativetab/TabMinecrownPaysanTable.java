
package net.taki.minecrown.creativetab;

import net.taki.minecrown.block.BlockMachineAMoudreblock;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMinecrownPaysanTable extends ElementsMinecrownMOD.ModElement {
	public TabMinecrownPaysanTable(ElementsMinecrownMOD instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabminecrownpaysantable") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockMachineAMoudreblock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
