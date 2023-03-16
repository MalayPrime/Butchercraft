package com.lance5057.butchercraft.data.builders.recipes;

import com.lance5057.butchercraft.Butchercraft;
import com.lance5057.butchercraft.ButchercraftItems;
import com.lance5057.butchercraft.tags.ButchercraftItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.recipe.CookingRecipes;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class CookingPotRecipes extends RecipeProvider {

	public CookingPotRecipes(DataGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {
		

		

		CookingPotRecipeBuilder.cookingPotRecipe(ButchercraftItems.BUTTER.get(), 2, CookingRecipes.SLOW_COOKING, 1.0F)
				.addIngredient(Items.MILK_BUCKET).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "butter"));

		CookingPotRecipeBuilder.cookingPotRecipe(ButchercraftItems.CHEESE.get(), 2, CookingRecipes.SLOW_COOKING, 1.0F)
				.addIngredient(Items.MILK_BUCKET).addIngredient(ButchercraftItems.STOMACHE.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cheese"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.LAMB_STEW.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItems.LAMB_STEW_MEAT.get()).addIngredient(Items.CARROT)
				.addIngredient(Items.POTATO).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_stew"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.PORK_STEW.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItems.PORK_STEW_MEAT.get()).addIngredient(Items.CARROT)
				.addIngredient(Items.POTATO).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_stew"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.SAUSAGE_ROLL.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ButchercraftItems.SAUSAGE.get()).addIngredient(ModItems.WHEAT_DOUGH.get())
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "sausage_roll"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.SOS.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F, Items.BREAD)
				.addIngredient(ButchercraftItems.BEEF_SCRAPS.get()).addIngredient(Items.WHEAT)
				.addIngredient(ForgeTags.MILK).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "sos"));

		CookingPotRecipeBuilder.cookingPotRecipe(ButchercraftItems.LARD.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ButchercraftItems.FAT.get()).addIngredient(ButchercraftItems.FAT.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lard"));

//		CookingPotRecipeBuilder
//				.cookingPotRecipe(ButchercraftItems.HASH_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
//						Items.BOWL)
//				.addIngredient(ForgeTags.VEGETABLES_ONION).addIngredient(Items.POTATO)
//				.addIngredient(ButchercraftItems.GROUND_BEEF.get())
//				.addIngredient(ButchercraftItems.KETCHUP_JAR_ITEM.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "hash_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.POT_ROAST_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItemTags.ANY_ROAST_RAW).addIngredient(ForgeTags.VEGETABLES_ONION)
				.addIngredient(Items.POTATO).addIngredient(Items.CARROT).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pot_roast_feast"));

		

//		CookingPotRecipeBuilder
//				.cookingPotRecipe(ButchercraftItems.BBQ_RIBS_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
//						Items.BOWL)
//				.addIngredient(ButchercraftItemTags.ANY_RIBS_RAW).addIngredient(ButchercraftItemTags.ANY_RIBS_RAW)
//				.addIngredient(ButchercraftItemTags.ANY_RIBS_RAW).addIngredient(ButchercraftItemTags.ANY_RIBS_RAW)
//				.addIngredient(ButchercraftItems.BBQ_JAR_ITEM.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "bbq_ribs_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.MEAT_PIE_BLOCK_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItemTags.ANY_GROUND_MEAT_RAW)
				.addIngredient(ButchercraftItemTags.ANY_GROUND_MEAT_RAW)
				.addIngredient(ButchercraftItemTags.ANY_GROUND_MEAT_RAW).addIngredient(Items.POTATO)
				.addIngredient(ForgeTags.VEGETABLES_ONION).addIngredient(ModItems.PIE_CRUST.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "meat_pie"));

//		CookingPotRecipeBuilder
//				.cookingPotRecipe(ButchercraftItems.PULLED_PORK_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
//						Items.BOWL)
//				.addIngredient(ButchercraftItems.PORK_ROAST.get()).addIngredient(ButchercraftItems.PORK_ROAST.get())
//				.addIngredient(ButchercraftItems.BBQ_JAR_ITEM.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pulled_pork_feast"));

		

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.RACK_LAMB_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItems.LAMB_RIBS.get(), 2).addIngredient(ForgeTags.VEGETABLES_ONION)
				.addIngredient(Items.BREAD).addIngredient(Items.SWEET_BERRIES).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "rack_lamb_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.STIRFRY_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItemTags.ANY_SCRAP_MEAT_RAW)
				.addIngredient(ButchercraftItemTags.ANY_SCRAP_MEAT_RAW).addIngredient(ForgeTags.VEGETABLES)
				.addIngredient(ForgeTags.VEGETABLES).addIngredient(ForgeTags.VEGETABLES)
				.addIngredient(ForgeTags.VEGETABLES).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "stirfry_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.BEEF_WELLINGTON_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(ButchercraftItems.BEEF_ROAST.get(), 2).addIngredient(ModItems.WHEAT_DOUGH.get())
				.addIngredient(Tags.Items.MUSHROOMS).addIngredient(ButchercraftItems.LIVER.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_wellington_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.HAGGIS_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						ButchercraftItems.STOMACHE.get())
				.addIngredient(ButchercraftItemTags.ANY_OFFAL).addIngredient(ButchercraftItemTags.ANY_OFFAL)
				.addIngredient(ButchercraftItemTags.ANY_OFFAL).addIngredient(ButchercraftItems.LUNG.get())
				.addIngredient(Items.WHEAT).addIngredient(Items.POTATO).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "haggis_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_BLACK_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_BLACK).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "black_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_RED_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_RED).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "red_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_GREEN_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_GREEN).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "green_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_BROWN_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_BROWN).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "brown_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_BLUE_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_BLUE).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "blue_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_PURPLE_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_PURPLE).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "purple_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_CYAN_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_CYAN).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cyan_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_LIGHT_GREY_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_LIGHT_GRAY).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "light_grey_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_GREY_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_GRAY).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "grey_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_PINK_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_PINK).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pink_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_LIME_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_LIME).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lime_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_YELLOW_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_YELLOW).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "yellow_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_LIGHT_BLUE_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_LIGHT_BLUE).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "light_blue_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_MAGENTA_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_MAGENTA).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "magenta_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_ORANGE_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING,
						0.35F, Items.BOWL)
				.addIngredient(Tags.Items.DYES_ORANGE).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "orange_jelly_feast"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.JELLY_WHITE_FEAST_ITEM.get(), 1, CookingRecipes.SLOW_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(Tags.Items.DYES_WHITE).addIngredient(ButchercraftItems.GELATIN.get())
				.addIngredient(Items.SUGAR).addIngredient(Items.SWEET_BERRIES).addIngredient(Items.MILK_BUCKET)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "white_jelly_feast"));

		CookingPotRecipeBuilder.cookingPotRecipe(ButchercraftItems.GELATIN.get(), 4, CookingRecipes.SLOW_COOKING, 0.35F)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER)
				.addIngredient(ButchercraftItemTags.ANY_GELATIN_PROVIDER).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "gelatin"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.LIVER_ONIONS.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F,
						Items.BOWL)
				.addIngredient(ButchercraftItems.LIVER.get()).addIngredient(ForgeTags.VEGETABLES_ONION).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "liver_onions"));

		

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.FRIED_FISH.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ItemTags.FISHES).addIngredient(Tags.Items.CROPS_WHEAT)
				.addIngredient(ButchercraftItems.LARD.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "fried_fish"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.CHICKEN_FRIED_STEAK.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(Items.BEEF).addIngredient(Tags.Items.CROPS_WHEAT)
				.addIngredient(ButchercraftItems.LARD.get()).addIngredient(ButchercraftItems.GRAVY_ITEM.get())
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "chicken_fried_steak"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.PORK_TENDERLOIN.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(Items.PORKCHOP).addIngredient(Tags.Items.CROPS_WHEAT)
				.addIngredient(ButchercraftItems.LARD.get()).addIngredient(Items.BREAD).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_tenderloin"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.FRIED_CHICKEN.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ModItems.CHICKEN_CUTS.get()).addIngredient(Tags.Items.CROPS_WHEAT)
				.addIngredient(ButchercraftItems.LARD.get()).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "fried_chicken"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.STUFFED_HEART.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ButchercraftItems.HEART.get()).addIngredient(Tags.Items.MUSHROOMS)
				.addIngredient(Items.BREAD).addIngredient(ForgeTags.VEGETABLES_ONION).addIngredient(Items.EGG)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "stuffed_heart"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.FRIED_BRAINS.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ButchercraftItems.BRAIN.get()).addIngredient(Tags.Items.CROPS_WHEAT)
				.addIngredient(ButchercraftItems.LARD.get()).addIngredient(Items.EGG).build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "fried_brains"));

		CookingPotRecipeBuilder
				.cookingPotRecipe(ButchercraftItems.OXTAIL_SOUP.get(), 1, CookingRecipes.NORMAL_COOKING, 0.35F)
				.addIngredient(ButchercraftItems.OXTAIL.get()).addIngredient(Items.CARROT)
				.addIngredient(ButchercraftItems.STOCK_JAR_ITEM.get()).addIngredient(ForgeTags.VEGETABLES_TOMATO)
				.build(consumer, new ResourceLocation(Butchercraft.MOD_ID, "oxtail_soup"));
	}
}
