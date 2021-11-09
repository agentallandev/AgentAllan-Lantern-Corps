package com.agentallan.aalc.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.agentallan.aalc.item.WillRingItem;
import com.agentallan.aalc.item.RageRingItem;
import com.agentallan.aalc.item.LoveRingItem;
import com.agentallan.aalc.item.LifeRingItem;
import com.agentallan.aalc.item.HopeRingItem;
import com.agentallan.aalc.item.GreedRingItem;
import com.agentallan.aalc.item.FearRingItem;
import com.agentallan.aalc.item.DeathRingItem;
import com.agentallan.aalc.item.CompassionRingItem;
import com.agentallan.aalc.item.BlankRingItem;
import com.agentallan.aalc.AalcModVariables;
import com.agentallan.aalc.AalcMod;

public class BlankRingItemInInventoryTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure BlankRingItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AalcModVariables.PlayerVariables())).hasLantern))) {
			if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) >= 100)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(LifeRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > 74)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(LoveRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > 49)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CompassionRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > 24)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(WillRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) == 0)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(HopeRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > (-26))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GreedRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > (-51))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(FearRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) > (-76))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(RageRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) == (-100))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(DeathRingItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.hasLantern = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AalcModVariables.PlayerVariables())).hasLantern)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BlankRingItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
