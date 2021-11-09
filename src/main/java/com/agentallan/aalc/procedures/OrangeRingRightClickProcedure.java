package com.agentallan.aalc.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;

import com.agentallan.aalc.item.OrangeRingPowersItem;
import com.agentallan.aalc.item.GreedRingItem;
import com.agentallan.aalc.AalcMod;

public class OrangeRingRightClickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure OrangeRingRightClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == GreedRingItem.block)) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					OrangeRingPowersItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 10, (float) 20, (int) 5);
				}
			}
		}
	}
}
