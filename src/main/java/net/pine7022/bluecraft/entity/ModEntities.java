package net.pine7022.bluecraft.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pine7022.bluecraft.BlueCraft;
import net.pine7022.bluecraft.entity.custom.RaiEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, BlueCraft.MODID);


    public static final Supplier<EntityType<RaiEntity>> RAI =
            ENTITY_TYPES.register("rai", () -> EntityType.Builder.of(RaiEntity::new, MobCategory.CREATURE)
                    .sized(0.85f,1.35f).build("rai"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
