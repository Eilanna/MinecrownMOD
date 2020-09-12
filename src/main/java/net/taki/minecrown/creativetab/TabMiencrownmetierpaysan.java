
package net.taki.minecrown.creativetab;

@ElementsMinecrownMOD.ModElement.Tag
public class TabMiencrownmetierpaysan extends ElementsMinecrownMOD.ModElement {

	public TabMiencrownmetierpaysan(ElementsMinecrownMOD instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmiencrownmetierpaysan") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.WHEAT, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static CreativeTabs tab;

}
