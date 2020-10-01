public static class ModelracoonSitting extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer FootR;
	private final ModelRenderer FootL;
	private final ModelRenderer LegR;
	private final ModelRenderer LegL;
	private final ModelRenderer ArmR;
	private final ModelRenderer ArmL;
	private final ModelRenderer Head;
	private final ModelRenderer Ears;
	private final ModelRenderer earR;
	private final ModelRenderer EarL;
	private final ModelRenderer Tail;

	public ModelracoonSitting() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 22.0F, 1.5F);
		setRotationAngle(Body, -1.5272F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 20, -4.5F, -4.3605F, -6.1302F, 9, 7, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 10, -3.5F, -3.783F, -9.9642F, 7, 6, 4, 0.0F, false));

		FootR = new ModelRenderer(this);
		FootR.setRotationPoint(-4.0F, 22.5F, -3.5F);
		setRotationAngle(FootR, -1.2217F, 0.0F, 0.0F);
		FootR.cubeList.add(new ModelBox(FootR, 0, 44, -1.5F, -0.2868F, -3.4096F, 3, 1, 5, 0.0F, false));

		FootL = new ModelRenderer(this);
		FootL.setRotationPoint(4.0F, 23.0F, -3.0F);
		setRotationAngle(FootL, -1.2217F, 0.0F, 0.0F);
		FootL.cubeList.add(new ModelBox(FootL, 16, 44, -1.5F, -0.164F, -4.1059F, 3, 1, 5, 0.0F, false));

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(-4.5F, 21.5F, 0.0F);
		setRotationAngle(LegR, -0.0873F, 0.0F, 0.0F);
		LegR.cubeList.add(new ModelBox(LegR, 0, 35, -1.0F, -1.6608F, -3.0217F, 3, 4, 5, 0.0F, false));

		LegL = new ModelRenderer(this);
		LegL.setRotationPoint(4.5F, 22.0F, 0.0F);
		setRotationAngle(LegL, -0.0873F, 0.0F, 0.0F);
		LegL.cubeList.add(new ModelBox(LegL, 16, 35, -2.0F, -2.1588F, -3.0653F, 3, 4, 5, 0.0F, false));

		ArmR = new ModelRenderer(this);
		ArmR.setRotationPoint(-3.5F, 13.5F, 0.0F);
		setRotationAngle(ArmR, -0.8727F, 0.0873F, 0.1309F);
		ArmR.cubeList.add(new ModelBox(ArmR, 26, 21, -0.5F, -0.2472F, -0.8093F, 2, 5, 2, 0.0F, false));

		ArmL = new ModelRenderer(this);
		ArmL.setRotationPoint(3.5F, 13.0F, -0.5F);
		setRotationAngle(ArmL, -0.9599F, 0.2618F, -0.48F);
		ArmL.cubeList.add(new ModelBox(ArmL, 0, 21, -1.673F, -0.0977F, -0.2746F, 2, 5, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0866F, 11.6555F, 1.6177F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -3.5866F, -4.6555F, -3.6177F, 7, 5, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 10, -1.0866F, -1.6555F, -5.6177F, 2, 2, 2, 0.0F, false));

		Ears = new ModelRenderer(this);
		Ears.setRotationPoint(0.0F, -1.0F, 0.5F);
		Head.addChild(Ears);

		earR = new ModelRenderer(this);
		earR.setRotationPoint(-2.5866F, -4.1555F, -0.6177F);
		Ears.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 25, 0, -1.5F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(2.4134F, -4.1555F, -0.6177F);
		Ears.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 19, 0, -0.5F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 22.5F, 4.5F);
		setRotationAngle(Tail, 0.7418F, 0.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 0, 50, -1.9275F, -1.9501F, -0.0242F, 4, 4, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		FootR.render(f5);
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
		this.FootL.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.earR.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.EarL.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.ArmR.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ArmR.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.FootR.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.ArmL.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ArmL.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}