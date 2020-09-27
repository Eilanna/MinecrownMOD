
package net.taki.minecrown.item;

import net.taki.minecrown.creativetab.TabMiCroJobsBotaniste;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsMinecrownMOD.ModElement.Tag
public class ItemBlackberry extends ElementsMinecrownMOD.ModElement {
	@GameRegistry.ObjectHolder("minecrown:blackberry")
	public static final Item block = null;
	public ItemBlackberry(ElementsMinecrownMOD instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minecrown:blackberry", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(1, 0.3f, false);
			setUnlocalizedName("blackberry");
			setRegistryName("blackberry");
			setAlwaysEdible();
			setCreativeTab(TabMiCroJobsBotaniste.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
