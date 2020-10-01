
package net.taki.minecrown.entity;

import net.taki.minecrown.procedure.ProcedureRacoonTransformToSitting;
import net.taki.minecrown.procedure.ProcedureRacoonTransformStandToWalk;
import net.taki.minecrown.procedure.ProcedureRacoonStandTimerSpawn;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.World;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

@ElementsMinecrownMOD.ModElement.Tag
public class EntityRacoonStanding extends ElementsMinecrownMOD.ModElement {
	public static final int ENTITYID = 5;
	public static final int ENTITYID_RANGED = 6;
	public EntityRacoonStanding(ElementsMinecrownMOD instance) {
		super(instance, 205);
	}

	@Override
	public void initElements() {
		elements.entities
				.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("minecrown", "racoonstanding"), ENTITYID)
						.name("racoonstanding").tracker(64, 3, true).egg(-26317, -13312).build());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new ModelracoonStanding(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("minecrown:textures/racoon.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 2;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAISwimming(this));
			this.tasks.addTask(2, new EntityAILookIdle(this));
			this.tasks.addTask(3, new EntityAIEatGrass(this));
			this.tasks.addTask(4, new EntityAIWander(this, 0.9));
			this.tasks.addTask(5, new EntityAIPanic(this, 1.2));
			this.tasks.addTask(6, new EntityAIAvoidEntity(this, EntityPlayer.class, (float) 6, 1, 1.2));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
			IEntityLivingData retval = super.onInitialSpawn(difficulty, livingdata);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureRacoonStandTimerSpawn.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public boolean processInteract(EntityPlayer entity, EnumHand hand) {
			super.processInteract(entity, hand);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			ItemStack itemstack = entity.getHeldItem(hand);
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				ProcedureRacoonTransformToSitting.executeProcedure($_dependencies);
			}
			return true;
		}

		@Override
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				ProcedureRacoonTransformStandToWalk.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2D);
		}
	}

	public static class ModelracoonStanding extends ModelBase {
		private final ModelRenderer FootR;
		private final ModelRenderer Body;
		private final ModelRenderer FootL;
		private final ModelRenderer LegR;
		private final ModelRenderer LegL;
		private final ModelRenderer ArmR;
		private final ModelRenderer ArmL;
		private final ModelRenderer Head;
		private final ModelRenderer Ears;
		private final ModelRenderer Tail;
		public ModelracoonStanding() {
			textureWidth = 64;
			textureHeight = 64;
			FootR = new ModelRenderer(this);
			FootR.setRotationPoint(-4.0F, 23.0F, 3.5F);
			FootR.cubeList.add(new ModelBox(FootR, 0, 44, -1.5F, 0.0F, -3.5F, 3, 1, 5, 0.0F, false));
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 19.5F, 4.5F);
			setRotationAngle(Body, -1.0472F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 20, -4.5F, -4.3605F, -6.1302F, 9, 7, 8, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 10, -3.5F, -3.783F, -9.9642F, 7, 6, 4, 0.0F, false));
			FootL = new ModelRenderer(this);
			FootL.setRotationPoint(4.0F, 23.0F, 4.0F);
			FootL.cubeList.add(new ModelBox(FootL, 16, 44, -1.5F, 0.0F, -4.0F, 3, 1, 5, 0.0F, false));
			LegR = new ModelRenderer(this);
			LegR.setRotationPoint(-4.5F, 19.5F, 4.5F);
			setRotationAngle(LegR, 0.9599F, 0.0F, 0.0F);
			LegR.cubeList.add(new ModelBox(LegR, 0, 35, -1.0F, -2.1153F, -3.5634F, 3, 4, 5, 0.0F, false));
			LegL = new ModelRenderer(this);
			LegL.setRotationPoint(4.5F, 19.5F, 4.5F);
			setRotationAngle(LegL, 0.9599F, 0.0F, 0.0F);
			LegL.cubeList.add(new ModelBox(LegL, 16, 35, -2.0F, -2.1153F, -3.5634F, 3, 4, 5, 0.0F, false));
			ArmR = new ModelRenderer(this);
			ArmR.setRotationPoint(-3.5F, 13.5F, -0.5F);
			setRotationAngle(ArmR, -0.8727F, 0.0F, -0.2618F);
			ArmR.cubeList.add(new ModelBox(ArmR, 26, 21, -0.3706F, -0.5576F, -1.1793F, 2, 5, 2, 0.0F, false));
			ArmL = new ModelRenderer(this);
			ArmL.setRotationPoint(3.5F, 13.5F, -1.0F);
			setRotationAngle(ArmL, -1.1781F, 0.2618F, -0.2182F);
			ArmL.cubeList.add(new ModelBox(ArmL, 0, 21, -1.4639F, -0.5231F, -1.1552F, 2, 5, 2, 0.0F, false));
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0866F, 10.1555F, 1.1177F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -3.5866F, -3.6555F, -4.1177F, 7, 5, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 18, 10, -1.0866F, -0.6555F, -6.1177F, 2, 2, 2, 0.0F, false));
			Ears = new ModelRenderer(this);
			Ears.setRotationPoint(-0.0866F, 9.3445F, 3.3823F);
			Head.addChild(Ears);
			Ears.cubeList.add(new ModelBox(Ears, 19, 0, 2.0F, -15.0F, -4.5F, 2, 2, 1, 0.0F, false));
			Ears.cubeList.add(new ModelBox(Ears, 25, 0, -4.0F, -15.0F, -4.5F, 2, 2, 1, 0.0F, false));
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 19.0F, 7.0F);
			setRotationAngle(Tail, -0.1309F, -0.1309F, -0.3927F);
			Tail.cubeList.add(new ModelBox(Tail, 0, 50, -2.0619F, -2.0212F, -0.2605F, 4, 4, 10, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			FootR.render(f5);
			Body.render(f5);
			FootL.render(f5);
			LegR.render(f5);
			LegL.render(f5);
			ArmR.render(f5);
			ArmL.render(f5);
			Head.render(f5);
			Tail.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.FootL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Tail.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.ArmR.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.FootR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.ArmL.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
