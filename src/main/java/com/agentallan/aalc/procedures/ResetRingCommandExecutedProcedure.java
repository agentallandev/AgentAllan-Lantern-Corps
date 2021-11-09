package com.agentallan.aalc.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.agentallan.aalc.AalcModVariables;
import com.agentallan.aalc.AalcMod;

public class ResetRingCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure ResetRingCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hasLantern = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
