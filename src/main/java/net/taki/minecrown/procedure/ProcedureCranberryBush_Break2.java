package net.taki.minecrown.procedure;

import net.taki.minecrown.item.ItemToolSickle;
import net.taki.minecrown.item.ItemPaleoberry;
import net.taki.minecrown.item.ItemCranberrySeed;
import net.taki.minecrown.item.ItemCranberry;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCranberryBush_Break2 extends ElementsMinecrownMOD.ModElement {
	public ProcedureCranberryBush_Break2(ElementsMinecrownMOD instance) {
		super(instance, 82);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CranberryBush_Break2!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CranberryBush_Break2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CranberryBush_Break2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CranberryBush_Break2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CranberryBush_Break2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemToolSickle.block, (int) (1)).getItem())) {
			if ((Math.random() <= 0.5)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCranberrySeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
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
			if ((Math.random() <= 0.15)) {
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
		}
	}
}
