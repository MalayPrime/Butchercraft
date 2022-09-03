package com.lance5057.butchercraft.items;

import com.lance5057.butchercraft.Butchercraft;
import com.lance5057.butchercraft.tags.ButchercraftEntityTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.storage.loot.LootTable;

public class ButcherKnifeItem extends SwordItem {

    public ButcherKnifeItem (Properties builderIn) {
        super(Tiers.IRON, 3, 0, builderIn);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity entity, InteractionHand hand) {
        final ResourceLocation lootTableLocation = new ResourceLocation(Butchercraft.MOD_ID, "butcher_knife/" + entity.getType().getRegistryName().getPath());
        if (player.getServer() != null) {
            final LootTable lootTable = player.getServer().getLootTables().get(lootTableLocation);
            if (entity.getType().is(ButchercraftEntityTags.CARCASSES) && entity instanceof Mob mob && lootTable != LootTable.EMPTY) {
                mob.lootTable = lootTableLocation;
                entity.setLastHurtByPlayer(player);
                entity.hurt(DamageSource.playerAttack(player), 99999);
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }



//    @Override
//    public ActionResultType useOn(ItemUseContext context) {
//	
//
//	if (recipe != null) {
//	    World world = context.getLevel();
//	    context.
//
//	    if (recipe.getRecipeOutput().getItem() instanceof BlockItem) {
//		BlockItem b = (BlockItem) recipe.getRecipeOutput().getItem();
//		to = b.getBlock().getDefaultState();
//
//		for (Entry<Property<?>, Comparable<?>> entry : this.getCommonProperties(origState, state).entrySet()) {
//		    Property property = state.getBlock().getStateContainer().getProperty(entry.getKey().getName());
//		    final Optional<Comparable> propValue = property.parseValue(entry.getValue().toString());
//		    propValue.ifPresent(comparable -> to = to.with(property, comparable));
//		}
//
////		world.setBlockState(pos, to);
////
////		for (int i = 0; i < 5; i++) {
////		    world.addParticle(
////			    new ItemParticleData(ParticleTypes.ITEM, context.getPlayer().getHeldItemOffhand()),
////			    pos.getX() + 0.5f, pos.getY() + 1, pos.getZ() + 0.5f, (world.random.nextFloat() - 0.5f) / 2,
////			    (world.random.nextFloat() - 0.5f) / 2, (world.random.nextFloat() - 0.5f) / 2);
////		}
////		world.playSound(context.getPlayer(), pos, SoundEvents.BLOCK_LANTERN_HIT, SoundCategory.BLOCKS, 1, 1);
//
//		return ActionResultType.sidedSuccess(!world.isClientSide);
//	    }
//	}
//	return ActionResultType.FAIL;
//    }
}
