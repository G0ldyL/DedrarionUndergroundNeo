package Hivens.hdu.common.registry;

import Hivens.hdu.HDU;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HDU.MODID);

        public static final Supplier<CreativeModeTab> DEDRARION_UNDERGROUND_ITEM = CREATIVE_MOD_TAB.register("dedrarion_underground_item_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.RUBY.get()))
                        .title(Component.translatable("creativetab.hdu_tab"))
                        .displayItems((itemDisplayParameters, output) ->  {

                            output.accept(ModItem.RAW_ETHEREUM.get());
                            output.accept(ModItem.RUBY.get());
                            output.accept(ModItem.ETHEREUM.get());
                            output.accept(ModItem.ETHEREUM_DUST.get());
                            output.accept(ModItem.EFTORIT.get());
                            output.accept(ModItem.RUBY.get());
                            output.accept(ModItem.CATALYST_OF_DEBAUCHERY.get());

                        }).build());

    public static final Supplier<CreativeModeTab> DEDRARION_UNDERGROUND_BLOCK = CREATIVE_MOD_TAB.register("dedrarion_underground_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.RUBY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HDU.MODID, "dedrarion_underground_item_tab"))
                    .title(Component.translatable("creativetab.hdu.dedrarion_underground_block"))
                    .displayItems((itemDisplayParameters, output) ->  {

                        // Ore Blocks
                        output.accept(ModBlock.ETHEREUM_ORE.get());
                        output.accept(ModBlock.ETHEREUM_BLOCK.get());
                        output.accept(ModBlock.RAW_ETHEREUM_BLOCK.get());

                        // Ruby

                        output.accept(ModBlock.RUBY_ORE.get());
                        output.accept(ModBlock.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlock.RUBY_BLOCK.get());

                        // Eftorit

                        output.accept(ModBlock.EFTORIT_ORE.get());
                        output.accept(ModBlock.DEEPSLATE_EFTORIT_ORE.get());
                        output.accept(ModBlock.EFTORIT_BLOCK.get());

                        // Blocks
                        output.accept(ModBlock.HOPE_STONE.get());
                        output.accept(ModBlock.SMOOTH_HOPE_STONE.get());
                        output.accept(ModBlock.HOPE_SHARDS.get());

                        output.accept(ModBlock.HOPE_STONE_BRICKS.get());
                        output.accept(ModBlock.SMOOTH_HOPE_STONE_BRICKS.get());
                        output.accept(ModBlock.HOPE_SHARD_BRICKS.get());
/*
                        output.accept(ModBlock.HOPE_STONE_STAIRS.get());
                        output.accept(ModBlock.SMOOTH_HOPE_STONE_STAIRS.get());
                        output.accept(ModBlock.HOPE_SHARD_STAIRS.get());

                        output.accept(ModBlock.HOPE_BRICK_STAIRS.get());
                        output.accept(ModBlock.SMOOTH_HOPE_BRICK_STAIRS.get());
                        output.accept(ModBlock.HOPE_SHARD_BRICK_STAIRS.get());
                        
 */


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
