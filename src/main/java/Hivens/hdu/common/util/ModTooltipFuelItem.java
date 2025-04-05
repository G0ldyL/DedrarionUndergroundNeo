package Hivens.hdu.common.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModTooltipFuelItem extends ModTooltipItem {
    int burnTime;

    public ModTooltipFuelItem(Properties properties, int burnTime, String tooltipKey) {
        super(properties, tooltipKey);
        this.burnTime = burnTime;
    }


    @Override
    public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
        return this.burnTime;
    }
}
