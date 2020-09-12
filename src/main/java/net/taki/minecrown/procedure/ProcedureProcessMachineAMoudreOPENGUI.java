package net.taki.minecrown.procedure;

import net.taki.minecrown.gui.GuiTableAMoudreGUI;
import net.taki.minecrown.MinecrownMOD;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureProcessMachineAMoudreOPENGUI extends ElementsMinecrownMOD.ModElement {
	public ProcedureProcessMachineAMoudreOPENGUI(ElementsMinecrownMOD instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ProcessMachineAMoudreOPENGUI!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ProcessMachineAMoudreOPENGUI!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ProcessMachineAMoudreOPENGUI!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ProcessMachineAMoudreOPENGUI!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ProcessMachineAMoudreOPENGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(MinecrownMOD.instance, GuiTableAMoudreGUI.GUIID, world, x, y, z);
	}
}
