package com.agentallan.aalc.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.agentallan.aalc.particle.GreenLanternParticleParticle;
import com.agentallan.aalc.item.PinkLanternArmorItem;
import com.agentallan.aalc.item.LoveRingItem;
import com.agentallan.aalc.AalcMod;

public class PinkRingInHandProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure PinkRingInHand!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AalcMod.LOGGER.warn("Failed to load dependency x for procedure PinkRingInHand!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AalcMod.LOGGER.warn("Failed to load dependency y for procedure PinkRingInHand!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AalcMod.LOGGER.warn("Failed to load dependency z for procedure PinkRingInHand!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AalcMod.LOGGER.warn("Failed to load dependency world for procedure PinkRingInHand!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == LoveRingItem.block)) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(PinkLanternArmorItem.boots));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0),
							new ItemStack(PinkLanternArmorItem.boots));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 1, new ItemStack(PinkLanternArmorItem.legs));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
							new ItemStack(PinkLanternArmorItem.legs));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(PinkLanternArmorItem.body));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
							new ItemStack(PinkLanternArmorItem.body));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 3, new ItemStack(PinkLanternArmorItem.helmet));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
							new ItemStack(PinkLanternArmorItem.helmet));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 10, (int) 10, (true), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 10, (int) 10, (true), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 10, (int) 3, (true), (false)));
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
			world.addParticle(GreenLanternParticleParticle.particle, x, y, z, 0, 1, 0);
		} else {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(PinkLanternArmorItem.helmet);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(PinkLanternArmorItem.body);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(PinkLanternArmorItem.body);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(PinkLanternArmorItem.boots);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = ((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).abilities.isCreativeMode
						: false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).clearActivePotions();
		}
	}
}
