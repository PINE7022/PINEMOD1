package net.pine7022.bluecraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pine7022.bluecraft.BlueCraft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BlueCraft.MODID);

    //アイテム追加(ブルーストーン)
    public static final DeferredItem<Item> BLUESTONE = ITEMS.register("bluestone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TICKET = ITEMS.register("ticket",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WRENCH = ITEMS.register("wrench",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

