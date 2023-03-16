package com.lance5057.butchercraft.data.builders.recipes;

import static com.lance5057.butchercraft.ButchercraftItems.BEEF_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.BONE_SAW;
import static com.lance5057.butchercraft.ButchercraftItems.BRAIN;
import static com.lance5057.butchercraft.ButchercraftItems.BUTCHER_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.CHICKEN_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BRAIN;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_HEART;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_KIDNEY;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LIVER;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LUNG;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_STOMACH;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_TRIPE;
import static com.lance5057.butchercraft.ButchercraftItems.COW_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.COW_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.GROUND_BEEF;
import static com.lance5057.butchercraft.ButchercraftItems.GUT_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.HEART;
import static com.lance5057.butchercraft.ButchercraftItems.HOOK_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.KIDNEY;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.LIVER;
import static com.lance5057.butchercraft.ButchercraftItems.LUNG;
import static com.lance5057.butchercraft.ButchercraftItems.PIG_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.PIG_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.SHEEP_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.SHEEP_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.SKINNING_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.STOMACH;
import static com.lance5057.butchercraft.ButchercraftItems.TRIPE;
import static net.minecraft.world.item.Items.IRON_INGOT;
import static net.minecraft.world.item.Items.LEATHER;
import static net.minecraft.world.item.Items.STICK;

import java.util.function.Consumer;

import javax.annotation.Nonnull;

import com.lance5057.butchercraft.Butchercraft;
import com.lance5057.butchercraft.ButchercraftItems;
import com.lance5057.butchercraft.client.BlacklistedModel;
import com.lance5057.butchercraft.client.rendering.animation.floats.AnimatedFloat;
import com.lance5057.butchercraft.client.rendering.animation.floats.AnimatedFloatVector3;
import com.lance5057.butchercraft.client.rendering.animation.floats.AnimationFloatTransform;
import com.lance5057.butchercraft.data.builders.recipes.loottables.ButcherBlockLootTables;
import com.lance5057.butchercraft.data.builders.recipes.loottables.MeatHookLoottables;
import com.lance5057.butchercraft.tags.ButchercraftItemTags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;

public class ButchercraftRecipeProvider extends RecipeProvider {

	public ButchercraftRecipeProvider(DataGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {
		MeatHookRecipeBuilder.shapedRecipe(COW_CARCASS.get()).tool(Ingredient.of(SKINNING_KNIFE.get()), 12, true,
				new ResourceLocation(Butchercraft.MOD_ID, "meat_hook/skin_cow"),
				new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/cow"), null, true,
						new AnimationFloatTransform()),
				new BlacklistedModel(SKINNING_KNIFE.get(), new AnimationFloatTransform()
						.setRotation(new AnimatedFloatVector3().setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
						.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
								.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(BONE_SAW.get()), 12, true,
						new ResourceLocation(Butchercraft.MOD_ID, "meat_hook/delimb_cow"),
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/cow_skinned"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BONE_SAW.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(GUT_KNIFE.get()), 12, true,
						new ResourceLocation(Butchercraft.MOD_ID, "meat_hook/deoffal_cow"),
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/cow_gutted"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(GUT_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))

				.tool(Ingredient.of(BUTCHER_KNIFE.get()), 12, true,
						new ResourceLocation(Butchercraft.MOD_ID, "meat_hook/butcher_cow"),
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/cow_bisected"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BUTCHER_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cowtest"));

		MeatHookRecipeBuilder.shapedRecipe(SHEEP_CARCASS.get()).tool(Ingredient.of(SKINNING_KNIFE.get()), 12, true,
				MeatHookLoottables.SKIN_SHEEP,
				new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/sheep"), null, true,
						new AnimationFloatTransform()),
				new BlacklistedModel(SKINNING_KNIFE.get(), new AnimationFloatTransform()
						.setRotation(new AnimatedFloatVector3().setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
						.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
								.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(GUT_KNIFE.get()), 12, true, MeatHookLoottables.DISEMBOWEL_SHEEP,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/sheep_skinned"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(GUT_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(BONE_SAW.get()), 12, true, MeatHookLoottables.BISECT_SHEEP,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/sheep_gutted"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BONE_SAW.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(BUTCHER_KNIFE.get()), 12, true, MeatHookLoottables.BUTCHER_SHEEP,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/sheep_bisected"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BUTCHER_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "sheeptest"));

		MeatHookRecipeBuilder.shapedRecipe(PIG_CARCASS.get()).tool(Ingredient.of(SKINNING_KNIFE.get()), 12, true,
				MeatHookLoottables.SKIN_PIG,
				new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/pig"), null, true,
						new AnimationFloatTransform()),
				new BlacklistedModel(SKINNING_KNIFE.get(), new AnimationFloatTransform()
						.setRotation(new AnimatedFloatVector3().setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
						.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
								.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(GUT_KNIFE.get()), 12, true, MeatHookLoottables.DISEMBOWEL_PIG,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/pig_skinned"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(GUT_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(BONE_SAW.get()), 12, true, MeatHookLoottables.BISECT_PIG,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/pig_gutted"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BONE_SAW.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(BUTCHER_KNIFE.get()), 12, true, MeatHookLoottables.BUTCHER_PIG,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/pig_bisected"), null,
								true, new AnimationFloatTransform()),
						new BlacklistedModel(BUTCHER_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setRotation(new AnimatedFloatVector3().setY(new AnimatedFloat(90, 0)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(24, 0)).setZ(new AnimatedFloat(12, 0)))))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pigtest"));

		ButcherBlockRecipeBuilder.shapedRecipe(CHICKEN_CARCASS.get()).tool(Ingredient.of(Tags.Items.SHEARS), 1, true,
				ButcherBlockLootTables.PLUCK_CHICKEN,
				new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
						new AnimationFloatTransform()),
				new BlacklistedModel(Items.SHEARS, new AnimationFloatTransform()
						.setRotation(new AnimatedFloatVector3().setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
						.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
								.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(Tags.Items.SHEARS), 1, true, ButcherBlockLootTables.PLUCK_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
								new AnimationFloatTransform()),
						new BlacklistedModel(Items.SHEARS,
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(Tags.Items.SHEARS), 1, true, ButcherBlockLootTables.PLUCK_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
								new AnimationFloatTransform()),
						new BlacklistedModel(Items.SHEARS,
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(Tags.Items.SHEARS), 1, true, ButcherBlockLootTables.PLUCK_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
								new AnimationFloatTransform()),
						new BlacklistedModel(Items.SHEARS,
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(Tags.Items.SHEARS), 1, true, ButcherBlockLootTables.PLUCK_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
								new AnimationFloatTransform()),
						new BlacklistedModel(Items.SHEARS,
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(Tags.Items.SHEARS), 1, true, ButcherBlockLootTables.PLUCK_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken"), null, true,
								new AnimationFloatTransform()),
						new BlacklistedModel(Items.SHEARS,
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.tool(Ingredient.of(GUT_KNIFE.get()), 12, true, ButcherBlockLootTables.DEOFFAL_CHICKEN,
						new BlacklistedModel(new ResourceLocation(Butchercraft.MOD_ID, "meathook/chicken_plucked"),
								null, true, new AnimationFloatTransform()),
						new BlacklistedModel(GUT_KNIFE.get(),
								new AnimationFloatTransform()
										.setRotation(new AnimatedFloatVector3()
												.setZ(new AnimatedFloat(-45, 45, 0, 0.05f, true, true)))
										.setLocation(new AnimatedFloatVector3().setX(new AnimatedFloat(8, 0))
												.setY(new AnimatedFloat(0, 0)).setZ(new AnimatedFloat(12, 0)))))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "butcher_chicken"));

		ShapedRecipeBuilder.shaped(BONE_SAW.get()).define('I', IRON_INGOT).define('S', STICK).pattern("IIS")
				.pattern("IIS").unlockedBy("has_iron", has(IRON_INGOT))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "bone_saw"));
		ShapedRecipeBuilder.shaped(BUTCHER_KNIFE.get()).define('I', IRON_INGOT).define('S', STICK).pattern(" II")
				.pattern(" II").pattern("S  ").unlockedBy("has_iron", has(IRON_INGOT))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "butcher_knife"));
		ShapedRecipeBuilder.shaped(SKINNING_KNIFE.get()).define('I', IRON_INGOT).define('S', STICK).pattern(" II")
				.pattern("S  ").unlockedBy("has_iron", has(IRON_INGOT))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "skinning_knife"));
		ShapedRecipeBuilder.shaped(GUT_KNIFE.get()).define('I', IRON_INGOT).define('S', STICK).pattern("I  ")
				.pattern(" I ").pattern(" S ").unlockedBy("has_iron", has(IRON_INGOT))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "gut_knife"));

		ShapedRecipeBuilder.shaped(HOOK_BLOCK_ITEM.get()).define('I', IRON_INGOT).define('C', Items.CHAIN)
				.define('N', Items.IRON_NUGGET).pattern("III").pattern("NCN").pattern("NNN")
				.unlockedBy("has_iron", has(IRON_INGOT))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "meat_hook"));

		ShapelessRecipeBuilder.shapeless(BEEF_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.BEEF_RAW), 9)
				.unlockedBy("has_beef", has(ButchercraftItemTags.BEEF_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_block"));
		ShapelessRecipeBuilder.shapeless(COOKED_BEEF_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.BEEF_COOKED), 9)
				.unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_beef_block"));
		ShapelessRecipeBuilder.shapeless(PORK_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.PORK_RAW), 9)
				.unlockedBy("has_pork", has(ButchercraftItemTags.PORK_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_block"));
		ShapelessRecipeBuilder.shapeless(COOKED_PORK_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.PORK_COOKED), 9)
				.unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_pork_block"));
		ShapelessRecipeBuilder.shapeless(LAMB_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.MUTTON_RAW), 9)
				.unlockedBy("has_lamb", has(ButchercraftItemTags.MUTTON_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_block"));
		ShapelessRecipeBuilder.shapeless(COOKED_LAMB_BLOCK_ITEM.get())
				.requires(Ingredient.of(ButchercraftItemTags.MUTTON_COOKED), 9)
				.unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_lamb_block"));

		ShapelessRecipeBuilder.shapeless(BEEF_SCRAPS.get(), 9).requires(BEEF_BLOCK_ITEM.get())
				.unlockedBy("has_beef", has(ButchercraftItemTags.BEEF_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_block_to_scraps"));
		ShapelessRecipeBuilder.shapeless(COOKED_BEEF_SCRAPS.get(), 9).requires(COOKED_BEEF_BLOCK_ITEM.get())
				.unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_beef_block_to_scraps"));
		ShapelessRecipeBuilder.shapeless(PORK_SCRAPS.get(), 9).requires(PORK_BLOCK_ITEM.get())
				.unlockedBy("has_pork", has(ButchercraftItemTags.PORK_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_block_to_scraps"));
		ShapelessRecipeBuilder.shapeless(COOKED_PORK_SCRAPS.get(), 9).requires(COOKED_PORK_BLOCK_ITEM.get())
				.unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_pork_block_to_scraps"));
		ShapelessRecipeBuilder.shapeless(LAMB_SCRAPS.get(), 9).requires(LAMB_BLOCK_ITEM.get())
				.unlockedBy("has_lamb", has(ButchercraftItemTags.MUTTON_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_block_to_scraps"));
		ShapelessRecipeBuilder.shapeless(COOKED_LAMB_SCRAPS.get(), 9).requires(COOKED_LAMB_BLOCK_ITEM.get())
				.unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_lamb_block_to_scraps"));

		ShapelessRecipeBuilder.shapeless(Items.COOKED_BEEF, 4).requires(ButchercraftItems.COOKED_BEEF_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_beef_roast_to_steaks"));
		ShapelessRecipeBuilder.shapeless(Items.COOKED_PORKCHOP, 4).requires(ButchercraftItems.COOKED_PORK_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_pork_roast_to_steaks"));
		ShapelessRecipeBuilder.shapeless(Items.COOKED_MUTTON, 4).requires(ButchercraftItems.COOKED_LAMB_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_lamb_roast_to_steaks"));

		ShapelessRecipeBuilder.shapeless(Items.BEEF, 4).requires(ButchercraftItems.BEEF_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_roast_to_steaks"));
		ShapelessRecipeBuilder.shapeless(Items.PORKCHOP, 4).requires(ButchercraftItems.PORK_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_roast_to_steaks"));
		ShapelessRecipeBuilder.shapeless(Items.MUTTON, 4).requires(ButchercraftItems.LAMB_ROAST.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_roast_to_steaks"));

		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_CUBED_BEEF.get()).requires(Items.COOKED_BEEF)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_beef_to_cubes"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_CUBED_PORK.get()).requires(Items.COOKED_PORKCHOP)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_pork_to_cubes"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_CUBED_LAMB.get()).requires(Items.COOKED_MUTTON)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_lamb_to_cubes"));

		ShapelessRecipeBuilder.shapeless(ButchercraftItems.CUBED_BEEF.get()).requires(Items.BEEF)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_to_cubes"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.CUBED_PORK.get()).requires(Items.PORKCHOP)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_to_cubes"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.CUBED_LAMB.get()).requires(Items.MUTTON)
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_RAW))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_to_cubes"));

		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_GROUND_BEEF.get(), 4)
				.requires(COOKED_BEEF_SCRAPS.get()).requires(BUTCHER_KNIFE.get())
				.unlockedBy("has_beef_cooked", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_beef_scraps_to_ground"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_GROUND_PORK.get(), 4)
				.requires(COOKED_PORK_SCRAPS.get()).requires(BUTCHER_KNIFE.get())
				.unlockedBy("has_pork_cooked", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_pork_scraps_to_ground"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.COOKED_GROUND_LAMB.get(), 4)
				.requires(COOKED_LAMB_SCRAPS.get()).requires(BUTCHER_KNIFE.get())
				.unlockedBy("has_lamb_cooked", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cooked_lamb_scraps_to_ground"));

		ShapelessRecipeBuilder.shapeless(GROUND_BEEF.get(), 4).requires(BEEF_SCRAPS.get()).requires(BUTCHER_KNIFE.get())
				.unlockedBy("has_beef", has(ButchercraftItemTags.BEEF_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "beef_scraps_to_ground"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.GROUND_PORK.get(), 4).requires(PORK_SCRAPS.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_pork", has(ButchercraftItemTags.PORK_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pork_scraps_to_ground"));
		ShapelessRecipeBuilder.shapeless(ButchercraftItems.GROUND_LAMB.get(), 4).requires(LAMB_SCRAPS.get())
				.requires(BUTCHER_KNIFE.get()).unlockedBy("has_lamb", has(ButchercraftItemTags.MUTTON_COOKED))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lamb_scraps_to_ground"));

		ShapelessRecipeBuilder.shapeless(ModItems.BARBECUE_STICK.get()).requires(ButchercraftItemTags.CUBED_MEAT_RAW)
				.requires(ForgeTags.VEGETABLES_ONION).requires(ForgeTags.VEGETABLES_TOMATO).requires(Items.STICK)
				.unlockedBy("has_stick", has(Items.STICK))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "kebab"));

		createFoodRecipe(Ingredient.of(BRAIN.get()), COOKED_BRAIN.get(), consumer);
		createFoodRecipe(Ingredient.of(HEART.get()), COOKED_HEART.get(), consumer);
		createFoodRecipe(Ingredient.of(KIDNEY.get()), COOKED_KIDNEY.get(), consumer);
		createFoodRecipe(Ingredient.of(LIVER.get()), COOKED_LIVER.get(), consumer);
		createFoodRecipe(Ingredient.of(LUNG.get()), COOKED_LUNG.get(), consumer);
		createFoodRecipe(Ingredient.of(STOMACH.get()), COOKED_STOMACH.get(), consumer);
		createFoodRecipe(Ingredient.of(TRIPE.get()), COOKED_TRIPE.get(), consumer);

		createFoodRecipe(Ingredient.of(ButchercraftItems.BEEF_STEW_MEAT.get()),
				ButchercraftItems.COOKED_BEEF_STEW_MEAT.get(), consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.BEEF_ROAST.get()), ButchercraftItems.COOKED_BEEF_ROAST.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.BEEF_RIBS.get()), ButchercraftItems.COOKED_BEEF_RIBS.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.CUBED_BEEF.get()), ButchercraftItems.COOKED_CUBED_BEEF.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.GROUND_BEEF.get()), ButchercraftItems.COOKED_GROUND_BEEF.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.BEEF_SCRAPS.get()), ButchercraftItems.COOKED_BEEF_SCRAPS.get(),
				consumer);

		createFoodRecipe(Ingredient.of(ButchercraftItems.PORK_STEW_MEAT.get()),
				ButchercraftItems.COOKED_PORK_STEW_MEAT.get(), consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.PORK_ROAST.get()), ButchercraftItems.COOKED_PORK_ROAST.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.PORK_RIBS.get()), ButchercraftItems.COOKED_PORK_RIBS.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.CUBED_PORK.get()), ButchercraftItems.COOKED_CUBED_PORK.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.GROUND_PORK.get()), ButchercraftItems.COOKED_GROUND_PORK.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.PORK_SCRAPS.get()), ButchercraftItems.COOKED_PORK_SCRAPS.get(),
				consumer);

		createFoodRecipe(Ingredient.of(ButchercraftItems.LAMB_STEW_MEAT.get()),
				ButchercraftItems.COOKED_LAMB_STEW_MEAT.get(), consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.LAMB_ROAST.get()), ButchercraftItems.COOKED_LAMB_ROAST.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.LAMB_RIBS.get()), ButchercraftItems.COOKED_LAMB_RIBS.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.CUBED_LAMB.get()), ButchercraftItems.COOKED_CUBED_LAMB.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.GROUND_LAMB.get()), ButchercraftItems.COOKED_GROUND_LAMB.get(),
				consumer);
		createFoodRecipe(Ingredient.of(ButchercraftItems.LAMB_SCRAPS.get()), ButchercraftItems.COOKED_LAMB_SCRAPS.get(),
				consumer);

		ShapelessRecipeBuilder.shapeless(LEATHER, 12).requires(COW_HIDE.get()).requires(SKINNING_KNIFE.get())
				.unlockedBy("has_cow_hide", has(COW_HIDE.get()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "cow_hide_to_leather"));

		ShapelessRecipeBuilder.shapeless(LEATHER, 8).requires(PIG_HIDE.get()).requires(SKINNING_KNIFE.get())
				.unlockedBy("has_pig_hide", has(PIG_HIDE.get()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "pig_hide_to_leather"));

		ShapelessRecipeBuilder.shapeless(LEATHER, 6).requires(SHEEP_HIDE.get()).requires(SKINNING_KNIFE.get())
				.unlockedBy("has_sheep_hide", has(SHEEP_HIDE.get()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "sheep_hide_to_leather"));

//		

//		ShapelessRecipeBuilder.shapeless(ModItems.MINCED_BEEF.get(), 1)
//				.requires(ButchercraftItemTags.ANY_GROUND_MEAT_RAW)
//				.unlockedBy("has_meat", has(ButchercraftItemTags.ANY_MEAT_RAW))
//				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "form_patty"));

		ShapelessRecipeBuilder.shapeless(Items.CANDLE, 6).requires(ButchercraftItems.LARD.get()).requires(Items.STRING)
				.unlockedBy("has_lard", has(ButchercraftItems.LARD.get()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID, "lard_to_candle"));
		

		
	}

	private void createFoodRecipe(Ingredient pIngredient, ItemLike pResult, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder.smoking(pIngredient, pResult, .35F, 100)
				.unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(pIngredient.getItems()[0].getItem()).getPath(),
						has(pIngredient.getItems()[0].getItem()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID,
						ForgeRegistries.ITEMS.getKey(pResult.asItem()).getPath() + "_from_smoking"));
		SimpleCookingRecipeBuilder.campfireCooking(pIngredient, pResult, .35F, 600)
				.unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(pIngredient.getItems()[0].getItem()).getPath(),
						has(pIngredient.getItems()[0].getItem()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID,
						ForgeRegistries.ITEMS.getKey(pResult.asItem()).getPath() + "_from_campfire_cooking"));
		SimpleCookingRecipeBuilder.smelting(pIngredient, pResult, .35F, 200)
				.unlockedBy("has_" + ForgeRegistries.ITEMS.getKey(pIngredient.getItems()[0].getItem()).getPath(),
						has(pIngredient.getItems()[0].getItem()))
				.save(consumer, new ResourceLocation(Butchercraft.MOD_ID,
						ForgeRegistries.ITEMS.getKey(pResult.asItem()).getPath() + "_from_smelting"));
	}

}
