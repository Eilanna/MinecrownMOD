package net.taki.minecrown.procedure;

import net.taki.minecrown.item.ItemToolScythe;
import net.taki.minecrown.item.ItemCropBarleySeed;
import net.taki.minecrown.item.ItemCropBarleyItem;
import net.taki.minecrown.block.BlockCropBarleyPlant7;
import net.taki.minecrown.block.BlockCropBarleyPlant0;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCropBarleyRecolt0 extends ElementsMinecrownMOD.ModElement {
	public ProcedureCropBarleyRecolt0(ElementsMinecrownMOD instance) {
		super(instance, 185);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CropBarleyRecolt0!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CropBarleyRecolt0!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CropBarleyRecolt0!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CropBarleyRecolt0!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CropBarleyRecolt0!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant7.block.getDefaultState().getBlock())) {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemToolScythe.block, (int) (1)).getItem())) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant0.block.getDefaultState(), 3);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCropBarleyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if ((Math.random() <= 0.05)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCropBarleySeed.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
