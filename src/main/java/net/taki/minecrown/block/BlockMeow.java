
package net.taki.minecrown.block;

@ElementsMinecrownMOD.ModElement.Tag
public class BlockMeow extends ElementsMinecrownMOD.ModElement {

	@GameRegistry.ObjectHolder("minecrown:meow")
	public static final Block block = null;

	public BlockMeow(ElementsMinecrownMOD instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("meow"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("minecrown:meow", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);

			setUnlocalizedName("meow");
			setSoundType(SoundType.GROUND);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabMinecrownPaysanTable.tab);

		}

	}

}
