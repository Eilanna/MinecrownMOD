
package net.taki.minecrown.util;

import net.taki.minecrown.block.BlockLogFenceXCorner;
import net.taki.minecrown.block.BlockLogFenceTCorner;
import net.taki.minecrown.block.BlockLogFenceStraight;
import net.taki.minecrown.block.BlockLogFenceNone;
import net.taki.minecrown.block.BlockLogFenceGateClosed;
import net.taki.minecrown.block.BlockLogFenceEnd;
import net.taki.minecrown.block.BlockLogFenceCorner;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMinecrownMOD.ModElement.Tag
public class OreDictFences extends ElementsMinecrownMOD.ModElement {
	public OreDictFences(ElementsMinecrownMOD instance) {
		super(instance, 135);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceNone.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceCorner.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceEnd.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceStraight.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceTCorner.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceXCorner.block, (int) (1)));
		OreDictionary.registerOre("fences", new ItemStack(BlockLogFenceGateClosed.block, (int) (1)));
	}
}
