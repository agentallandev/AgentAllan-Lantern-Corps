package com.agentallan.aalc.procedures;

import net.minecraft.world.IWorld;

import java.util.Map;

import com.agentallan.aalc.particle.GreenLanternParticleParticle;
import com.agentallan.aalc.AalcMod;

public class GreenLanternArmorBodyTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AalcMod.LOGGER.warn("Failed to load dependency x for procedure GreenLanternArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AalcMod.LOGGER.warn("Failed to load dependency y for procedure GreenLanternArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AalcMod.LOGGER.warn("Failed to load dependency z for procedure GreenLanternArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AalcMod.LOGGER.warn("Failed to load dependency world for procedure GreenLanternArmorBodyTickEvent!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(GreenLanternParticleParticle.particle, x, y, z, 0, 1, 0);
	}
}
