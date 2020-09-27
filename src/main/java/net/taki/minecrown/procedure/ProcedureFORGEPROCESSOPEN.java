package net.taki.minecrown.procedure;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureFORGEPROCESSOPEN extends ElementsMinecrownMOD.ModElement {

	public ProcedureFORGEPROCESSOPEN(ElementsMinecrownMOD instance) {
		super(instance, 189);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FORGEPROCESSOPEN!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FORGEPROCESSOPEN!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FORGEPROCESSOPEN!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FORGEPROCESSOPEN!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FORGEPROCESSOPEN!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(MinecrownMOD.instance, GuiGUIForgeron.GUIID, world, x, y, z);

	}

}
