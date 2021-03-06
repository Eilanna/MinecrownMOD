package net.taki.minecrown.procedure;

import net.taki.minecrown.block.BlockLogFenceXCorner;
import net.taki.minecrown.block.BlockLogFenceTCorner;
import net.taki.minecrown.block.BlockLogFenceStraight;
import net.taki.minecrown.block.BlockLogFenceNone;
import net.taki.minecrown.block.BlockLogFenceEnd;
import net.taki.minecrown.block.BlockLogFenceCorner;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureLogFencePlace extends ElementsMinecrownMOD.ModElement {
	public ProcedureLogFencePlace(ElementsMinecrownMOD instance) {
		super(instance, 125);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LogFencePlace!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LogFencePlace!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LogFencePlace!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LogFencePlace!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		String fenceGroup = "";
		String fenceUpdate = "";
		fenceGroup = (String) "loggedFences";
		fenceUpdate = (String) "loggedFencesUpdate";
		if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceXCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceTCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceTCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceTCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)) && (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceTCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceCorner.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceStraight.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true)) && ((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true)))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceStraight.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), (fenceGroup))) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceEnd.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), (fenceGroup))) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceEnd.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), (fenceGroup))) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceEnd.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((new Object() {
			public boolean getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), (fenceGroup))) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceEnd.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceUpdate), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLogFenceNone.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean((fenceGroup), (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			IBlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().setBoolean((fenceUpdate), (false));
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
	}
}
