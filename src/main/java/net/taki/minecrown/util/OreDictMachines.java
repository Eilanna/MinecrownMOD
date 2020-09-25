
package net.taki.minecrown.util;

import net.taki.minecrown.block.BlockMachineScieuse;
import net.taki.minecrown.block.BlockMachineMeuleuse;
import net.taki.minecrown.block.BlockMachineBroyeuse;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMinecrownMOD.ModElement.Tag
public class OreDictMachines extends ElementsMinecrownMOD.ModElement {
	public OreDictMachines(ElementsMinecrownMOD instance) {
		super(instance, 152);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("machines", new ItemStack(BlockMachineScieuse.block, (int) (1)));
		OreDictionary.registerOre("machines", new ItemStack(BlockMachineMeuleuse.block, (int) (1)));
		OreDictionary.registerOre("machines", new ItemStack(BlockMachineBroyeuse.block, (int) (1)));
	}
}
