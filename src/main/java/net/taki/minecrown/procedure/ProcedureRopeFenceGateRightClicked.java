package net.taki.minecrown.procedure;

import net.taki.minecrown.block.BlockRopeFenceGateOpen;
import net.taki.minecrown.block.BlockRopeFenceGateClose;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

@ElementsMinecrownMOD.ModElement.Tag
public class ProcedureRopeFenceGateRightClicked extends ElementsMinecrownMOD.ModElement {
	public ProcedureRopeFenceGateRightClicked(ElementsMinecrownMOD instance) {
		super(instance, 147);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RopeFenceGateRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RopeFenceGateRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RopeFenceGateRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RopeFenceGateRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
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
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH) || ((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
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
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateClose.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateOpen.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.open")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateOpen.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateClose.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.close")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateClose.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateOpen.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.open")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateOpen.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateClose.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.close")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			}
		} else if ((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
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
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST) || ((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
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
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateClose.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateOpen.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.open")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateOpen.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateClose.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.EAST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.close")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateClose.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateOpen.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.open")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockRopeFenceGateOpen.block.getDefaultState()
					.getBlock()) && ((new Object() {
						public EnumFacing getEnumFacing(BlockPos pos) {
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
						}
					}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRopeFenceGateClose.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, EnumFacing.WEST),
									3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fence_gate.close")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			}
		}
	}
}
