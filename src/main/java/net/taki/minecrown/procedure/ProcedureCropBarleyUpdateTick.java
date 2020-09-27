package net.taki.minecrown.procedure;

import net.taki.minecrown.block.BlockCropBarleyPlant7;
import net.taki.minecrown.block.BlockCropBarleyPlant6;
import net.taki.minecrown.block.BlockCropBarleyPlant5;
import net.taki.minecrown.block.BlockCropBarleyPlant4;
import net.taki.minecrown.block.BlockCropBarleyPlant3;
import net.taki.minecrown.block.BlockCropBarleyPlant2;
import net.taki.minecrown.block.BlockCropBarleyPlant1;
import net.taki.minecrown.block.BlockCropBarleyPlant0;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureCropBarleyUpdateTick extends ElementsMinecrownMOD.ModElement {
	public ProcedureCropBarleyUpdateTick(ElementsMinecrownMOD instance) {
		super(instance, 182);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CropBarleyUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CropBarleyUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CropBarleyUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CropBarleyUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomGrowth = 0;
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock()))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant0.block.getDefaultState()
					.getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant1.block.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant2.block
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant3.block
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == BlockCropBarleyPlant4.block.getDefaultState().getBlock())
													|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == BlockCropBarleyPlant5.block.getDefaultState().getBlock())
															|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == BlockCropBarleyPlant6.block.getDefaultState().getBlock())))))))) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", (int) (x));
					$_dependencies.put("y", (int) (y));
					$_dependencies.put("z", (int) (z));
					ProcedureCropBreak.executeProcedure($_dependencies);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant7.block.getDefaultState()
					.getBlock())) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", (int) (x));
					$_dependencies.put("y", (int) (y));
					$_dependencies.put("z", (int) (z));
					ProcedureCropBarleyBreak.executeProcedure($_dependencies);
				}
			}
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		} else if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SAND.getStateFromMeta(0).getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SAND.getStateFromMeta(1).getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRAVEL.getDefaultState().getBlock())
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.ANVIL.getStateFromMeta(0)
								.getBlock())
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.ANVIL
										.getStateFromMeta(1).getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.ANVIL
												.getStateFromMeta(2).getBlock())))
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CONCRETE_POWDER
										.getStateFromMeta(0).getBlock())
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CONCRETE_POWDER
												.getStateFromMeta(1).getBlock())
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
														.getBlock() == Blocks.CONCRETE_POWDER.getStateFromMeta(2).getBlock())
														|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																.getBlock() == Blocks.CONCRETE_POWDER.getStateFromMeta(3).getBlock())
																|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																		.getBlock() == Blocks.CONCRETE_POWDER.getStateFromMeta(4).getBlock())
																		|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																				.getBlock() == Blocks.CONCRETE_POWDER.getStateFromMeta(5).getBlock())
																				|| (((world
																						.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																								.getBlock() == Blocks.CONCRETE_POWDER
																										.getStateFromMeta(6).getBlock())
																						|| (((world.getBlockState(
																								new BlockPos((int) x, (int) (y + 1), (int) z)))
																										.getBlock() == Blocks.CONCRETE_POWDER
																												.getStateFromMeta(7).getBlock())
																								|| (((world.getBlockState(new BlockPos((int) x,
																										(int) (y + 1), (int) z)))
																												.getBlock() == Blocks.CONCRETE_POWDER
																														.getStateFromMeta(8)
																														.getBlock())
																										|| (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 1), (int) z)))
																														.getBlock() == Blocks.CONCRETE_POWDER
																																.getStateFromMeta(9)
																																.getBlock())
																												|| (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 1),
																																(int) z)))
																																		.getBlock() == Blocks.CONCRETE_POWDER
																																				.getStateFromMeta(
																																						10)
																																				.getBlock())
																														|| (((world.getBlockState(
																																new BlockPos((int) x,
																																		(int) (y + 1),
																																		(int) z)))
																																				.getBlock() == Blocks.CONCRETE_POWDER
																																						.getStateFromMeta(
																																								11)
																																						.getBlock())
																																|| (((world
																																		.getBlockState(
																																				new BlockPos(
																																						(int) x,
																																						(int) (y + 1),
																																						(int) z)))
																																								.getBlock() == Blocks.CONCRETE_POWDER
																																										.getStateFromMeta(
																																												12)
																																										.getBlock())
																																		|| (((world
																																				.getBlockState(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y + 1),
																																								(int) z)))
																																										.getBlock() == Blocks.CONCRETE_POWDER
																																												.getStateFromMeta(
																																														13)
																																												.getBlock())
																																				|| (((world
																																						.getBlockState(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y + 1),
																																										(int) z)))
																																												.getBlock() == Blocks.CONCRETE_POWDER
																																														.getStateFromMeta(
																																																14)
																																														.getBlock())
																																						|| ((world
																																								.getBlockState(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y + 1),
																																												(int) z)))
																																														.getBlock() == Blocks.CONCRETE_POWDER
																																																.getStateFromMeta(
																																																		15)
																																																.getBlock())))))))))))))))))))) {
			world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
		} else if (((!(world.isRemote)) && ((world.getLightFromNeighbors(new BlockPos((int) x, (int) (y + 1), (int) z))) > 7))) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("growthTimer", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "growthTimer")) + 0.05));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "growthTimer")) >= 20)) {
				randomGrowth = (double) Math.random();
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant0.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant2.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant1.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant1.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant3.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant2.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant2.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant4.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant3.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant3.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant5.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant4.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant4.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant6.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant5.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant5.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant7.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant6.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCropBarleyPlant6.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.5)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCropBarleyPlant7.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
