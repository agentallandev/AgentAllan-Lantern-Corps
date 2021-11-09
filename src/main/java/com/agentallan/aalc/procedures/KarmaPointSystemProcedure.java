package com.agentallan.aalc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;

import java.util.Map;
import java.util.HashMap;

import com.agentallan.aalc.AalcModVariables;
import com.agentallan.aalc.AalcMod;

public class KarmaPointSystemProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingAttackEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				Entity imediatesourceentity = event.getSource().getImmediateSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("imediatesourceentity", imediatesourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AalcMod.LOGGER.warn("Failed to load dependency entity for procedure KarmaPointSystem!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				AalcMod.LOGGER.warn("Failed to load dependency sourceentity for procedure KarmaPointSystem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((sourceentity instanceof ServerPlayerEntity) && (sourceentity.world instanceof ServerWorld))
				? ((ServerPlayerEntity) sourceentity).getAdvancements()
						.getProgress(((MinecraftServer) ((ServerPlayerEntity) sourceentity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("aalc:world_of_lanterns")))
						.isDone()
				: false)) {
			if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEFINED) : false)) {
				{
					double _setval = (double) (((sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AalcModVariables.PlayerVariables())).karma) - Math.ceil(Math.random()));
					sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.karma = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEAD) : false)) {
				{
					double _setval = (double) (((sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AalcModVariables.PlayerVariables())).karma) + Math.ceil(Math.random()));
					sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.karma = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.ARTHROPOD) : false)) {
				{
					double _setval = (double) (((sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AalcModVariables.PlayerVariables())).karma) + Math.ceil(Math.random()));
					sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.karma = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.ILLAGER) : false)) {
				{
					double _setval = (double) (((sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AalcModVariables.PlayerVariables())).karma) + Math.ceil(Math.random()));
					sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.karma = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if ((entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.WATER) : false)) {
				{
					double _setval = (double) (((sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AalcModVariables.PlayerVariables())).karma) - Math.ceil(Math.random()));
					sourceentity.getCapability(AalcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.karma = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
