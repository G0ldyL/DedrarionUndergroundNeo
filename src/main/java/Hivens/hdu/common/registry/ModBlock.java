package Hivens.hdu.common.registry;

import Hivens.hdu.Hdu;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

import static Hivens.hdu.Hdu.MODID;

public class ModBlock {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("yourmodid");

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.register(
            "example_block", registryName -> new Block(
                    BlockBehaviour.Properties.of()
                            // The ID must be set on the block
                            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            )
    );
/*
    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(
                // This is the registry key of the registry.
                // Get these from BuiltInRegistries for vanilla registries,
                // or from NeoForgeRegistries.Keys for NeoForge registries.
                BuiltInRegistries.BLOCKS,
                // Register your objects here.
                registry -> {
                    registry.register(ResourceLocation.fromNamespaceAndPath(MODID, "example_block_1"), new Block(...));
                    registry.register(ResourceLocation.fromNamespaceAndPath(MODID, "example_block_2"), new Block(...));
                    registry.register(ResourceLocation.fromNamespaceAndPath(MODID, "example_block_3"), new Block(...));
                }
        );
    }

 */
}
