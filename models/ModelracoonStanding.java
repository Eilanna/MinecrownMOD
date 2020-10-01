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