package net.taki.minecrown.procedure;

import net.taki.minecrown.entity.EntityRacoonWalking;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureRacoonTransformStandToWalk extends ElementsMinecrownMOD.ModElement {
	public ProcedureRacoonTransformStandToWalk(ElementsMinecrownMOD instance) {
		super(instance, 209);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RacoonTransformStandToWalk!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RacoonTransformStandToWalk!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getDouble("Timer")) >= 20)) {
			entity.getEntityData().setDouble("Timer", 0);
		}
		entity.getEntityData().setDouble("Timer", ((entity.getEntityData().getDouble("Timer")) + 0.5));
		if ((((entity.getEntityData().getDouble("Timer")) >= 15)
				&& (((entity.motionX) >= 0.15) || (((entity.motionY) >= 0.15) || ((entity.motionZ) >= 0.15))))) {
			entity.getEntityData().setDouble("Timer", 0);
			entity.world.removeEntity(entity);
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityRacoonWalking.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles((entity.posX), (entity.posY), (entity.posZ), world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
