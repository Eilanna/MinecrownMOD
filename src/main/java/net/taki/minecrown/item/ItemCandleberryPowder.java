
package net.taki.minecrown.item;

@ElementsMinecrownMOD.ModElement.Tag
public class ItemCandleberryPowder extends ElementsMinecrownMOD.ModElement {

	@GameRegistry.ObjectHolder("minecrown:candleberrypowder")
	public static final Item block = null;

	public ItemCandleberryPowder(ElementsMinecrownMOD instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minecrown:candleberrypowder", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("candleberrypowder");
			setRegistryName("candleberrypowder");
			setCreativeTab(TabMinecrownPaysanTable.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
