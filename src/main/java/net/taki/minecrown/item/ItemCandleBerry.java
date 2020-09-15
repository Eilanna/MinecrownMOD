
package net.taki.minecrown.item;

@ElementsMinecrownMOD.ModElement.Tag
public class ItemCandleBerry extends ElementsMinecrownMOD.ModElement {

	@GameRegistry.ObjectHolder("minecrown:candleberry")
	public static final Item block = null;

	public ItemCandleBerry(ElementsMinecrownMOD instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minecrown:candleberry", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(2, 0.3f, false);
			setUnlocalizedName("candleberry");
			setRegistryName("candleberry");
			setAlwaysEdible();
			setCreativeTab(TabMinecrownPaysanTable.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

	}

}
