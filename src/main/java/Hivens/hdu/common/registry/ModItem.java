package Hivens.hdu.common.registry;

import Hivens.hdu.Hdu;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Hdu.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
