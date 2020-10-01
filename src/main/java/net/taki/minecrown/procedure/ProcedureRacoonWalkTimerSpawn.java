package net.taki.minecrown.procedure;

import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureRacoonWalkTimerSpawn extends ElementsMinecrownMOD.ModElement {
	public ProcedureRacoonWalkTimerSpawn(ElementsMinecrownMOD instance) {
		super(instance, 212);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RacoonWalkTimerSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("Timer", 0);
		entity.motionX = Math.random();
		entity.motionY = Math.random();
		entity.motionZ = Math.random();
	}
}
