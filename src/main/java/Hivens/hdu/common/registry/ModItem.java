package Hivens.hdu.common.registry;

import Hivens.hdu.HDU;
import Hivens.hdu.common.util.ModTooltipItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HDU.MODID);

    public static final DeferredItem<Item> RAW_ETHEREUM = ITEMS.registerItem("raw_ethereum",
            Item::new, new Item.Properties());


    public static final DeferredItem<Item> ETHEREUM = ITEMS.registerItem("ethereum",
            Item::new, new Item.Properties());


    public static final DeferredItem<Item> ETHEREUM_DUST = ITEMS.registerItem("ethereum_dust",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> RUBY = ITEMS.registerItem("ruby",
            Item::new, new Item.Properties());

    public  static final DeferredItem<Item> EFTORIT = ITEMS.registerItem("eftorit",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> CATALYST_OF_DEBAUCHERY = ITEMS.registerItem("catalyst_of_debauchery",
            Item::new, new Item.Properties());
/*
    public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MagicDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> FORBIDDEN_FRUIT = ITEMS.register("forbidden_fruit",
            () -> new TooltipFoodItem(new Item.Properties().food(FoodRegistry.FORBIDDEN_FRUIT), "tooltip.item.hdu.forbidden_fruit"));

    public static final DeferredItem<Item> FUEL_OF_PROMISES = ITEMS.register("fuel_of_promises",
            () -> new TooltipFuelItem(new Item.Properties(), 400, "tooltip.item.hdu.fuel_of_promises"));

 */


    /*
    public static final DeferredItem<Item> MNEMOSYNE_ALETA = ITEMS.register("mnemosyne_aleta",
            () -> new MnemosyneAletaItem(
                    Tiers.DIAMOND,  // Базовый уровень прочности (можно изменить)
                    -2,             // Модификатор урона (базовый урон минус 2)
                    -2.4f,          // Скорость атаки
                    new Item.Properties().stacksTo(1).durability(1000)
            )
    );

 */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
