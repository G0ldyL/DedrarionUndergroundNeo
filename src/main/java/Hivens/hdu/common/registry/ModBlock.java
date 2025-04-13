package Hivens.hdu.common.registry;

import Hivens.hdu.HDU;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HDU.MODID);

    // Ethereum
    public static final DeferredBlock<Block> ETHEREUM_ORE = registerBlock("ethereum_ore",
                    properties -> new DropExperienceBlock(UniformInt.of(10, 20), properties),
                    BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DIAMOND_ORE)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(120f)
                    .requiresCorrectToolForDrops()

    );

    public static final DeferredBlock<Block> ETHEREUM_BLOCK = registerBlock("ethereum_block",
                    Block::new,
                    BlockBehaviour.Properties
                    .ofFullCopy(Blocks.OBSIDIAN)
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .strength(180f)
                    .requiresCorrectToolForDrops()
    );


    public static final DeferredBlock<Block> RAW_ETHEREUM_BLOCK = registerBlock("raw_ethereum_block",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.IRON_ORE)
                    .sound(SoundType.TUFF)
    );


    // Ruby
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties),
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(15f)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties),
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(25f)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            Block::new,
            (BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(40f)
                    .requiresCorrectToolForDrops())
    );

    // Eftorit
    public static  final DeferredBlock<Block> EFTORIT_ORE = registerBlock("eftorit_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties),
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(25f)
                    .requiresCorrectToolForDrops()
    );

    public static  final DeferredBlock<Block> DEEPSLATE_EFTORIT_ORE = registerBlock("deepslate_eftorit_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties),
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.LAPIS_ORE)
                    .sound(SoundType.METAL)
                    .strength(40f)
                    .requiresCorrectToolForDrops()
    );


    public static  final  DeferredBlock<Block> EFTORIT_BLOCK = registerBlock("eftorit_block",
            Block::new,
            (BlockBehaviour.Properties
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
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> SMOOTH_HOPE_STONE = registerBlock("smooth_hope_stone",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> HOPE_SHARDS = registerBlock("hope_shards",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
    );

    // Hope Stone Bricks

    public static final DeferredBlock<Block> HOPE_STONE_BRICKS = registerBlock("hope_stone_bricks",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> SMOOTH_HOPE_STONE_BRICKS = registerBlock("smooth_hope_bricks",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> HOPE_SHARD_BRICKS = registerBlock("hope_shard_bricks",
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.DEEPSLATE)
                    .sound(SoundType.TUFF)
                    .strength(20)
                    .requiresCorrectToolForDrops()
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
            Block::new,
            BlockBehaviour.Properties
                    .ofFullCopy(Blocks.OAK_PLANKS)
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









    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> blockFactory, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<B> block = BLOCKS.registerBlock(name, blockFactory, blockProperties);
        registerBlockItem(name, block);
        return block;
    }

    private static <B extends Block> void registerBlockItem(String name, DeferredBlock<B> block) {
        ModItem.ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
