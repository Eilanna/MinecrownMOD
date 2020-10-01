
package net.taki.minecrown.item;

import net.taki.minecrown.creativetab.TabMiCroJobsAgriculteur;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMinecrownMOD.ModElement.Tag
public class ItemToolScythe extends ElementsMinecrownMOD.ModElement {
	@GameRegistry.ObjectHolder("minecrown:toolscythe")
	public static final Item block = null;
	public ItemToolScythe(ElementsMinecrownMOD instance) {
		super(instance, 184);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("TOOLSCYTHE", 1, 100, 4f, 0f, 2)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("toolscythe").setRegistryName("toolscythe").setCreativeTab(TabMiCroJobsAgriculteur.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minecrown:toolscythe", "inventory"));
	}
}
