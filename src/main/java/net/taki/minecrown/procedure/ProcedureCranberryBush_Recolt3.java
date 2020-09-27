package net.taki.minecrown.procedure;

import net.taki.minecrown.item.ItemToolSickle;
import net.taki.minecrown.item.ItemPaleoberry;
import net.taki.minecrown.item.ItemCranberrySeed;
import net.taki.minecrown.item.ItemCranberry;
import net.taki.minecrown.block.BlockCranberryBush_0;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCranberryBush_Recolt3 extends ElementsMinecrownMOD.ModElement {
	public ProcedureCranberryBush_Recolt3(ElementsMinecrownMOD instance) {
		super(instance, 40);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CranberryBush_Recolt3!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CranberryBush_Recolt3!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CranberryBush_Recolt3!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CranberryBush_Recolt3!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CranberryBush_Recolt3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double RandomSeed = 0;
		double RandomBerry = 0;
		RandomBerry = (double) Math.random();
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemToolSickle.block, (int) (1)).getItem())) {
			RandomSeed = (double) Math.random();
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCranberryBush_0.block.getDefaultState(), 3);
			if (((RandomSeed) <= 0.3)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberrySeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (((RandomBerry) < 0.3)) {
				if ((Math.random() <= 0.3)) {
					for (int index0 = 0; index0 < (int) (2); index0++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPaleoberry.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				} else if ((Math.random() <= 0.6)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPaleoberry.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPaleoberry.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			} else {
				if ((Math.random() <= 0.6)) {
					for (int index1 = 0; index1 < (int) (3); index1++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberry.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				} else {
					for (int index2 = 0; index2 < (int) (2); index2++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberry.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
		} else {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCranberryBush_0.block.getDefaultState(), 3);
			if (((RandomBerry) < 0.3)) {
				if ((Math.random() <= 0.3)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPaleoberry.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberry.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if ((Math.random() <= 0.5)) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberry.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberry.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
