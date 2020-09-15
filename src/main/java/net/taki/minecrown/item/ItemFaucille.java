
package net.taki.minecrown.item;

import net.taki.minecrown.creativetab.TabMinecrownPaysanTable;
import net.taki.minecrown.block.BlockStrawberryBush_3;
import net.taki.minecrown.block.BlockStrawberryBush_2;
import net.taki.minecrown.block.BlockStrawberryBush_1;
import net.taki.minecrown.block.BlockStrawberryBush_0;
import net.taki.minecrown.block.BlockCranberryBush_3;
import net.taki.minecrown.block.BlockCranberryBush_2;
import net.taki.minecrown.block.BlockCranberryBush_1;
import net.taki.minecrown.block.BlockCranberryBush_0;
import net.taki.minecrown.block.BlockCandleberryBush_3;
import net.taki.minecrown.block.BlockCandleberryBush_2;
import net.taki.minecrown.block.BlockCandleberryBush_1;
import net.taki.minecrown.block.BlockCandleberryBush_0;
import net.taki.minecrown.block.BlockBlackberryBush_3;
import net.taki.minecrown.block.BlockBlackberryBush_2;
import net.taki.minecrown.block.BlockBlackberryBush_1;
import net.taki.minecrown.block.BlockBlackberryBush_0;
import net.taki.minecrown.ElementsMinecrownMOD;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import com.google.common.collect.Multimap;

@ElementsMinecrownMOD.ModElement.Tag
public class ItemFaucille extends ElementsMinecrownMOD.ModElement {
	@GameRegistry.ObjectHolder("minecrown:faucille")
	public static final Item block = null;
	public ItemFaucille(ElementsMinecrownMOD instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("faucille").setRegistryName("faucille").setCreativeTab(TabMinecrownPaysanTable.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("minecrown:faucille", "inventory"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			setMaxDamage(100);
			setMaxStackSize(1);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 0f, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
			}
			return multimap;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			IBlockState require;
			require = BlockCranberryBush_2.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCranberryBush_3.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCranberryBush_1.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCranberryBush_0.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockBlackberryBush_0.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockBlackberryBush_1.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockBlackberryBush_2.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockBlackberryBush_3.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockStrawberryBush_0.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockStrawberryBush_1.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockStrawberryBush_2.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockStrawberryBush_3.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCandleberryBush_0.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCandleberryBush_1.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCandleberryBush_2.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			require = BlockCandleberryBush_3.block.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 4f;
			return 0;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
			stack.damageItem(1, entityLiving);
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
			stack.damageItem(2, attacker);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
