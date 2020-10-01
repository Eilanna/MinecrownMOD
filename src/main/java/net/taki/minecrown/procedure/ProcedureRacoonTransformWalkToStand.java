package net.taki.minecrown.procedure;

import net.taki.minecrown.entity.EntityRacoonStanding;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureRacoonTransformWalkToStand extends ElementsMinecrownMOD.ModElement {
	public ProcedureRacoonTransformWalkToStand(ElementsMinecrownMOD instance) {
		super(instance, 210);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RacoonTransformWalkToStand!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RacoonTransformWalkToStand!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getDouble("Timer")) >= 30)) {
			entity.getEntityData().setDouble("Timer", 0);
		} else {
			entity.getEntityData().setDouble("Timer", ((entity.getEntityData().getDouble("Timer")) + 0.5));
		}
		if ((((entity.getEntityData().getDouble("Timer")) >= 15)
				&& (((entity.motionX) <= 0.2) && (((entity.motionY) <= 0.2) && ((entity.motionZ) <= 0.2))))) {
			entity.world.removeEntity(entity);
			entity.getEntityData().setDouble("Timer", 0);
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityRacoonStanding.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles((entity.posX), (entity.posY), (entity.posZ), world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
