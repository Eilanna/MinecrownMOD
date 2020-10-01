package net.taki.minecrown.procedure;

import net.taki.minecrown.entity.EntityRacoonWalking;
import net.taki.minecrown.entity.EntityRacoonStanding;
import net.taki.minecrown.entity.EntityRacoonSitting;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureRacoonTransformToSitting extends ElementsMinecrownMOD.ModElement {
	public ProcedureRacoonTransformToSitting(ElementsMinecrownMOD instance) {
		super(instance, 214);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RacoonTransformToSitting!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RacoonTransformToSitting!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity instanceof EntityRacoonWalking.EntityCustom) || (entity instanceof EntityRacoonStanding.EntityCustom))) {
			entity.world.removeEntity(entity);
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityRacoonSitting.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles((entity.posX), (entity.posY), (entity.posZ), world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		} else if ((entity instanceof EntityRacoonSitting.EntityCustom)) {
			entity.world.removeEntity(entity);
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
