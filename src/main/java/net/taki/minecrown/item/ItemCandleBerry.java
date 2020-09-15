
package net.taki.minecrown.item;

import net.taki.minecrown.creativetab.TabMinecrownPaysanTable;
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
