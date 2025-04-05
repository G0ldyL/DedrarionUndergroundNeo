package Hivens.hdu.common.registry;

import Hivens.hdu.HDU;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
@Deprecated
public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.createBlocks(HDU.MODID);

    // Ethereum
    /*
    public static final DeferredBlock<Block> ETHEREUM_ORE = registerBlock("ethereum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DIAMOND_ORE)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(120f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.DeferredBlock(1, 1))
    );

     */

    public static final DeferredBlock<Block> ETHEREUM_BLOCK = registerBlock("ethereum_block",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.OBSIDIAN)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(180f)
                    .requiresCorrectToolForDrops())
    );

    public static final DeferredBlock<Block> RAW_ETHEREUM_BLOCK = registerBlock("raw_ethereum_block",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.IRON_ORE)
                    .sound(SoundType.TUFF))
    );


    // Ruby
/*
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(15f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.DeferredBlock(1, 3))
    );

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(25f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.DeferredBlock(1, 3))
    );

 */

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(40f)
                    .requiresCorrectToolForDrops())
    );

    // Eftorit
/*
    public static  final DeferredBlock<Block> EFTORIT_ORE = registerBlock("eftorit_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(25f)
                    .requiresCorrectToolForDrops(), UniformInt.DeferredBlock(3, 5))
    );

    public static  final DeferredBlock<Block> DEEPSLATE_EFTORIT_ORE = registerBlock("deepslate_eftorit_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(40f)
                    .requiresCorrectToolForDrops(), UniformInt.DeferredBlock(3, 5))
    );

 */

    public static  final  DeferredBlock<Block> EFTORIT_BLOCK = registerBlock("eftorit_block",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_BLOCK)
                    .sound(SoundType.METAL)
                    .strength(40f)
                    .requiresCorrectToolForDrops())
    );
/*
    public static  final  DeferredBlock<Block> EFTORIT_FORGE = registerBlock("eftorit_forge",
            () -> new EftoritForgeBlock(BlockBehaviour.Properties.of(Blocks.LAPIS_BLOCK)
                    .sound(SoundType.METAL)
                    .strength(120f)
                    .requiresCorrectToolForDrops())
    );

 */



    // Hope Stone

    public static final DeferredBlock<Block> HOPE_STONE = registerBlock("hope_stone",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops())
    );

    public static final DeferredBlock<Block> SMOOTH_HOPE_STONE = registerBlock("smooth_hope_stone",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<Block> HOPE_SHARDS = registerBlock("hope_shards",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    // Hope Stone Bricks

    public static final DeferredBlock<Block> HOPE_STONE_BRICKS = registerBlock("hope_stone_bricks",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<Block> SMOOTH_HOPE_STONE_BRICKS = registerBlock("smooth_hope_bricks",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<Block> HOPE_SHARD_BRICKS = registerBlock("hope_shard_bricks",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );
/*
    // Hope Stone Stairs
    public static final DeferredBlock<StairBlock> HOPE_STONE_STAIRS = registerBlock("hope_stone_stairs",
            () -> new StairBlock(() -> ModBlock.HOPE_STONE.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<StairBlock> SMOOTH_HOPE_STONE_STAIRS = registerBlock("smooth_hope_stairs",
            () -> new StairBlock(() -> ModBlock.SMOOTH_HOPE_STONE.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<StairBlock> HOPE_SHARD_STAIRS = registerBlock("hope_shard_stairs",
            () -> new StairBlock(() -> ModBlock.HOPE_SHARDS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    // Hope Bricks Stairs
    public static final DeferredBlock<StairBlock> HOPE_BRICK_STAIRS = registerBlock("hope_brick_stairs",
            () -> new StairBlock(() -> ModBlock.HOPE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

    public static final DeferredBlock<StairBlock> SMOOTH_HOPE_BRICK_STAIRS = registerBlock("smooth_hope_brick_stairs",
            () -> new StairBlock(() -> ModBlock.SMOOTH_HOPE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );


    public static final DeferredBlock<StairBlock> HOPE_SHARD_BRICK_STAIRS = registerBlock("hope_shard_brick_stairs",
            () -> new StairBlock(() -> ModBlock.HOPE_SHARD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofFullCopy(ModBlock.HOPE_STONE.get()))
    );

 */

    // Structure
    public static final DeferredBlock<Block> BROKEN_PLANKS = registerBlock("broken_planks",
            () -> new Block(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.OAK_PLANKS))
    );
/*
    public static final DeferredBlock<Block> EXTINGUISHED_TORCH = registerBlock("extinguished_torch",
            () -> new ExtinguishedTorchBlock(BlockBehaviour.Properties.DeferredBlock()
                    .sound(SoundType.WOOD)
                    .noCollission()
                    .instabreak()
                    .lightLevel((p) -> 0))
    );

 */

/*
    public static  final  DeferredBlock<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.of(Blocks.STONE)
                    .sound(SoundType.METAL)
                    .instabreak()
            )
    );

 */









    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock<T>) BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().setId(
                        ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(HDU.MODID,name)))));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
