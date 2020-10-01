
package net.taki.minecrown.entity;

import net.taki.minecrown.procedure.ProcedureRacoonWalkTimerSpawn;
import net.taki.minecrown.procedure.ProcedureRacoonTransformWalkToStand;
import net.taki.minecrown.procedure.ProcedureRacoonTransformToSitting;
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
import net.minecraft.entity.ai.EntityAIFollow;
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
public class EntityRacoonWalking extends ElementsMinecrownMOD.ModElement {
	public static final int ENTITYID = 3;
	public static final int ENTITYID_RANGED = 4;
	public EntityRacoonWalking(ElementsMinecrownMOD instance) {
		super(instance, 203);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("minecrown", "racoonwalking"), ENTITYID).name("racoonwalking").tracker(64, 3, true).build());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new ModelracoonWalking(), 0.5f) {
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
			this.tasks.addTask(1, new EntityAIFollow(this, (float) 1, 10, 5));
			this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityRacoonWalking.EntityCustom.class, (float) 6, 1.1, 1.3));
			this.tasks.addTask(3, new EntityAIPanic(this, 1.3));
			this.tasks.addTask(4, new EntityAISwimming(this));
			this.tasks.addTask(5, new EntityAIWander(this, 1));
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
				ProcedureRacoonWalkTimerSpawn.executeProcedure($_dependencies);
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
				ProcedureRacoonTransformWalkToStand.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	public static class ModelracoonWalking extends ModelBase {
		private final ModelRenderer FootR;
		private final ModelRenderer Body;
		private final ModelRenderer FootL;
		private final ModelRenderer LegR;
		private final ModelRenderer LegL;
		private final ModelRenderer ArmR;
		private final ModelRenderer ArmL;
		private final ModelRenderer Head;
		private final ModelRenderer EarsL;
		private final ModelRenderer EarsR;
		private final ModelRenderer Tail;
		public ModelracoonWalking() {
			textureWidth = 64;
			textureHeight = 64;
			FootR = new ModelRenderer(this);
			FootR.setRotationPoint(-4.0F, 19.5F, 4.5F);
			FootR.cubeList.add(new ModelBox(FootR, 0, 44, -1.5F, 3.5F, -3.5F, 3, 1, 5, 0.0F, false));
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 19.5F, 4.5F);
			Body.cubeList.add(new ModelBox(Body, 0, 20, -4.5F, -4.3605F, -6.1302F, 9, 7, 8, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 10, -3.5F, -3.783F, -9.9642F, 7, 6, 4, 0.0F, false));
			FootL = new ModelRenderer(this);
			FootL.setRotationPoint(4.0F, 19.5F, 4.5F);
			FootL.cubeList.add(new ModelBox(FootL, 16, 44, -1.5F, 3.5F, -3.5F, 3, 1, 5, 0.0F, false));
			LegR = new ModelRenderer(this);
			LegR.setRotationPoint(-4.0F, 19.5F, 4.5F);
			setRotationAngle(LegR, 1.309F, 0.0F, 0.0F);
			LegR.cubeList.add(new ModelBox(LegR, 0, 35, -1.5F, -2.1153F, -3.5634F, 3, 4, 5, 0.0F, false));
			LegL = new ModelRenderer(this);
			LegL.setRotationPoint(4.0F, 19.5F, 4.5F);
			setRotationAngle(LegL, 1.309F, 0.0F, 0.0436F);
			LegL.cubeList.add(new ModelBox(LegL, 16, 35, -1.5005F, -2.1209F, -3.5423F, 3, 4, 5, 0.0F, false));
			ArmR = new ModelRenderer(this);
			ArmR.setRotationPoint(-3.0F, 20.0F, -4.0F);
			ArmR.cubeList.add(new ModelBox(ArmR, 26, 21, -1.1823F, -1.0303F, -1.2495F, 2, 5, 2, 0.0F, false));
			ArmL = new ModelRenderer(this);
			ArmL.setRotationPoint(3.0F, 20.0F, -4.5F);
			ArmL.cubeList.add(new ModelBox(ArmL, 0, 21, -0.8921F, -0.9759F, -0.9699F, 2, 5, 2, 0.0F, false));
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0866F, 19.1555F, -5.3823F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -3.5866F, -3.6555F, -4.1177F, 7, 5, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 18, 10, -1.0866F, -0.6555F, -6.1177F, 2, 2, 2, 0.0F, false));
			EarsL = new ModelRenderer(this);
			EarsL.setRotationPoint(2.9134F, -4.1555F, -0.6177F);
			Head.addChild(EarsL);
			EarsL.cubeList.add(new ModelBox(EarsL, 19, 0, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));
			EarsR = new ModelRenderer(this);
			EarsR.setRotationPoint(-3.0F, -4.0F, -0.5F);
			Head.addChild(EarsR);
			EarsR.cubeList.add(new ModelBox(EarsR, 25, 0, -1.0866F, -1.6555F, -0.6177F, 2, 2, 1, 0.0F, false));
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 19.0F, 6.5F);
			setRotationAngle(Tail, -0.1309F, -0.1309F, -0.3927F);
			Tail.cubeList.add(new ModelBox(Tail, 0, 50, -2.1272F, -1.9565F, -0.752F, 4, 4, 10, 0.0F, false));
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
			this.Tail.rotateAngleZ = f3 / (180F / (float) Math.PI);
			this.ArmR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.FootR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.ArmL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
