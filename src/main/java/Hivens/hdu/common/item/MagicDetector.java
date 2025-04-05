package Hivens.hdu.common.item;

import Hivens.hdu.common.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class MagicDetector extends Item {
    public MagicDetector(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            if (player == null) return InteractionResult.FAIL;

            Vec3 eyePos = player.getEyePosition();
            BlockPos playerPos = BlockPos.containing(eyePos);
            int range = 7;

            BlockPos closestPos = null;
            double closestDistanceSq = Double.MAX_VALUE;

            Level level = pContext.getLevel();

            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    for (int z = -range; z <= range; z++) {
                        double distSq = x * x + y * y + z * z;
                        if (distSq > range * range) continue;

                        BlockPos checkPos = playerPos.offset(x, y, z);
                        BlockState state = level.getBlockState(checkPos);

                        if (isValuableBlock(state)) {
                            if (distSq < closestDistanceSq) {
                                closestDistanceSq = distSq;
                                closestPos = checkPos;
                            }
                        }
                    }
                }
            }

            if (closestPos != null) {
                addBlockHighlight(level, closestPos);
                addLineHighlight(level, eyePos, closestPos);
                playSoundForPlayer(player);
            }
        }

        return InteractionResult.SUCCESS;
    }


    private void playSoundForPlayer(Player player) {
        if (player != null && player.level() instanceof ServerLevel serverLevel) {
            serverLevel.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.AMETHYST_BLOCK_CHIME, player.getSoundSource(), 1.0F, 1.0F);
        }
    }


    private void addBlockHighlight(Level world, BlockPos pos) {
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.GLOW, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5,
                    20, 0.5, 0.5, 0.5, 0.1);
        }
    }

    private void addLineHighlight(Level world, Vec3 fromPos, BlockPos toPos) {
        if (world instanceof ServerLevel serverLevel) {
            double xDiff = toPos.getX() - fromPos.x();
            double yDiff = toPos.getY() - fromPos.y();
            double zDiff = toPos.getZ() - fromPos.z();

            double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);

            int particleCount = (int) (distance / 2);
            for (int i = 0; i <= particleCount; i++) {
                double x = fromPos.x() + (xDiff * i / particleCount);
                double y = fromPos.y() + (yDiff * i / particleCount);
                double z = fromPos.z() + (zDiff * i / particleCount);

                serverLevel.sendParticles(ParticleTypes.GLOW, x + 0.5, y - 0.5, z + 0.5, 1, 0, 0, 0, 0);
            }
        }
    }

    private boolean isValuableBlock(BlockState state) {
        return state.is(ModTags.Blocks.METAL_DETECTOR_VALUABLES);
    }

}
