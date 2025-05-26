package net.pine7022.bluecraft.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.pine7022.bluecraft.BlueCraft;
import net.pine7022.bluecraft.entity.ModEntities;
import net.pine7022.bluecraft.entity.client.RaiModel;
import net.pine7022.bluecraft.entity.custom.RaiEntity;

@EventBusSubscriber(modid = BlueCraft.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RaiModel.LAYER_LOCATION, RaiModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RAI.get(), RaiEntity.createAttributes().build());
    }
}
