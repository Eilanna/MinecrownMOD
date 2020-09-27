package net.taki.minecrown.procedure;

import net.taki.minecrown.block.BlockCranberryBush_2;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCranberryBush_Transform1 extends ElementsMinecrownMOD.ModElement {
	public ProcedureCranberryBush_Transform1(ElementsMinecrownMOD instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CranberryBush_Transform1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CranberryBush_Transform1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CranberryBush_Transform1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CranberryBush_Transform1!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomNumber = 0;
		randomNumber = (double) (Math.random() * 100);
		if (((randomNumber) <= 10)) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCranberryBush_2.block.getDefaultState(), 3);
		}
	}
}
