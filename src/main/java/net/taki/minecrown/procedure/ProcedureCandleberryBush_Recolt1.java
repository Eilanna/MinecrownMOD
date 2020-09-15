package net.taki.minecrown.procedure;

import net.taki.minecrown.item.ItemFaucille;
import net.taki.minecrown.item.ItemCandleberrySeed;
import net.taki.minecrown.block.BlockCandleberryBush_0;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCandleberryBush_Recolt1 extends ElementsMinecrownMOD.ModElement {
	public ProcedureCandleberryBush_Recolt1(ElementsMinecrownMOD instance) {
		super(instance, 103);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CandleberryBush_Recolt1!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CandleberryBush_Recolt1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CandleberryBush_Recolt1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CandleberryBush_Recolt1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CandleberryBush_Recolt1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemFaucille.block, (int) (1)).getItem())) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCandleberryBush_0.block.getDefaultState(), 3);
			if ((Math.random() <= 0.05)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCandleberrySeed.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
