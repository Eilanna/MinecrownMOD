package net.taki.minecrown.procedure;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCroceFenceGateRightClicked extends ElementsMinecrownMOD.ModElement {

	public ProcedureCroceFenceGateRightClicked(ElementsMinecrownMOD instance) {
		super(instance, 197);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure CroceFenceGateRightClicked!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure CroceFenceGateRightClicked!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure CroceFenceGateRightClicked!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure CroceFenceGateRightClicked!");
			return;
		}

            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		if ((((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.NORTH)||((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.SOUTH))) {if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.NORTH))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.open")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.NORTH))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.close")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.SOUTH))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.open")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.SOUTH))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.close")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}}else if ((((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.EAST)||((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.WEST))) {if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.EAST))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.open")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.EAST))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.close")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.WEST))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.open")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}else if ((&&((new Object() {
	public EnumFacing getEnumFacing(BlockPos pos){
		try {
			IBlockState _bs = world.getBlockState(pos);
			for (IProperty<?> prop : _bs.getProperties().keySet()) {
				if (prop.getName().equals("facing"))
					return _bs.getValue((PropertyDirection) prop);
			}
			return EnumFacing.NORTH;
        } catch (Exception e) {
		    return EnumFacing.NORTH;
        }
	}}.getEnumFacing(new BlockPos((int)x,(int)y,(int)z))) == EnumFacing.WEST))) {world.setBlockToAir(new BlockPos((int)x,(int)y,(int)z));try {
	IBlockState _bs =  world.getBlockState(new BlockPos((int)x,(int)y,(int)z));
	for (IProperty<?> prop : _bs.getProperties().keySet()) {
		if (prop.getName().equals("facing")) {
			world.setBlockState(new BlockPos((int)x,(int)y,(int)z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
			break;
		}
	}
} catch (Exception e) {
}world.playSound((EntityPlayer)null, x, y, z,
        (net.minecraft.util.SoundEvent)net.minecraft.util.SoundEvent.REGISTRY.getObject(
        		new ResourceLocation("block.fence_gate.close")),
		SoundCategory.NEUTRAL,(float)1,(float)1);}}

	}

}
