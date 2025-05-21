package net.pine7022.bluecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pine7022.bluecraft.BlueCraft;
import net.pine7022.bluecraft.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlueCraft.MODID);

   public static final Supplier<CreativeModeTab> BLUECRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("bluecraft_items_tab",
           () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUESTONE.get()))
                   .title(Component.translatable("creativetab.bluecraft.bluecraft_items"))
                   .displayItems((itemDisplayParameters, output) -> {
                       output.accept(ModItems.BLUESTONE);
                       output.accept(ModItems.TICKET);
                       output.accept(ModItems.WRENCH);
                   }).build());

   public static final Supplier<CreativeModeTab> BLUECRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("bluecraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLUESTONE_BLOCK.get()))
                    .title(Component.translatable("creativetab.bluecraft.bluecraft_blocks"))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BlueCraft.MODID, "bluecraft_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLUESTONE_BLOCK);
                        output.accept(ModBlocks.BLUESTONE_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
