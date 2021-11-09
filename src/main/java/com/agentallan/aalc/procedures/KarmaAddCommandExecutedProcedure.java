package com.agentallan.aalc.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import com.agentallan.aalc.AalcModVariables;
import com.agentallan.aalc.AalcMod;

public class KarmaAddCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure KarmaAddCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				AalcMod.LOGGER.warn("Failed to load dependency cmdparams for procedure KarmaAddCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"karma");
			}
		}
		{
			double _setval = (double) (((entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AalcModVariables.PlayerVariables())).karma) + new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("0");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())));
			entity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.karma = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
