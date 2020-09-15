package net.taki.minecrown.procedure;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCandleberryBushPlantation extends ElementsMinecrownMOD.ModElement {

	public ProcedureCandleberryBushPlantation(ElementsMinecrownMOD instance) {
		super(instance, 102);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("entity")==null){
			System.err.println("Failed to load dependency entity for procedure CandleberryBushPlantation!");
			return;
		}
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure CandleberryBushPlantation!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure CandleberryBushPlantation!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure CandleberryBushPlantation!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure CandleberryBushPlantation!");
			return;
		}

            Entity entity =(Entity)dependencies.get("entity" );
            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		if (((((world.getBlockState(new BlockPos((int)x,(int)(y+1),(int)z))).getBlock()== Blocks.AIR.getDefaultState().getBlock())||(((world.getBlockState(new BlockPos((int)x,(int)(y+1),(int)z))).getBlock()== Blocks.AIR.getDefaultState().getBlock())||((world.getBlockState(new BlockPos((int)x,(int)(y+1),(int)z))).getBlock()== Blocks.AIR.getDefaultState().getBlock())))&&(&&((world.getBlockState(new BlockPos((int)x,(int)y,(int)z))).getBlock()== Blocks.GRASS.getDefaultState().getBlock())))) {if ((!((entity instanceof EntityPlayer)?((EntityPlayer)entity).capabilities.isCreativeMode:false))) {}}

	}

}
