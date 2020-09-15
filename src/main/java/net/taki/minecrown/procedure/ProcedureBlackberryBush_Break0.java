package net.taki.minecrown.procedure;

import net.taki.minecrown.item.ItemFaucille;
import net.taki.minecrown.item.ItemBlackberrySeed;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureBlackberryBush_Break0 extends ElementsMinecrownMOD.ModElement {
	public ProcedureBlackberryBush_Break0(ElementsMinecrownMOD instance) {
		super(instance, 84);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlackberryBush_Break0!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlackberryBush_Break0!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlackberryBush_Break0!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlackberryBush_Break0!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlackberryBush_Break0!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemFaucille.block, (int) (1)).getItem())) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			if ((Math.random() <= 0.1)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemBlackberrySeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
