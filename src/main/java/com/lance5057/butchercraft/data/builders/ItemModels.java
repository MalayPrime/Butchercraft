package com.lance5057.butchercraft.data.builders;

import com.lance5057.butchercraft.Butchercraft;
import com.lance5057.butchercraft.ButchercraftItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ModelProvider<ItemModelBuilder> {
	private final ExistingFileHelper fh;

	public ItemModels(DataGenerator generator, ExistingFileHelper fh) {
		super(generator, Butchercraft.MOD_ID, ITEM_FOLDER, ItemModelBuilder::new, fh);
		this.fh = fh;
	}

	@Override
	public String getName() {
		return "Butchercraft item models";
	}

	@Override
	protected void registerModels() {
		Butchercraft.logger.info("/tItem Models - ");

		forItem(ButchercraftItems.BONE_SAW, "bonesaw");
		forItem(ButchercraftItems.BUTCHER_KNIFE, "butcherknife");
		forItem(ButchercraftItems.GUT_KNIFE, "gutknife");
		forItem(ButchercraftItems.FAT, "fat");
		// forItem(ButchercraftItems.GRINDER_TIP, "grindtip");
		forItem(ButchercraftItems.LEATHER_CORD, "leathercord");
		forItem(ButchercraftItems.LEATHER_SCRAP, "leatherscrap");
		// forItem(ButchercraftItems.EXTRUDER_TIP, "sausagetip");
		forItem(ButchercraftItems.SINEW, "sinew");
		forItem(ButchercraftItems.SKINNING_KNIFE, "skinningknife");
		// forItem(ButchercraftItems.SPATULA, "spatula");
		forItem(ButchercraftItems.HORN, "horn");
		forItem(ButchercraftItems.LARD, "lard");
		forItem(ButchercraftItems.GELATIN, "gelatin");
//		forItem(ButchercraftItems.SOAP, "soap");

		// forItem(ButchercraftItems.COW_CARCASS, "cow_carcass");
		getBuilder(ButchercraftItems.COW_CARCASS.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID, "item/cow")));
		getBuilder(ButchercraftItems.PIG_CARCASS.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID, "item/pig")));
		getBuilder(ButchercraftItems.SHEEP_CARCASS.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID, "item/sheep")));
		getBuilder(ButchercraftItems.SHEEP_CARCASS.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID, "item/chicken")));

		forItem(ButchercraftItems.BRAIN, "brain");
		forItem(ButchercraftItems.COOKED_BRAIN, "cooked_brain");
		forItem(ButchercraftItems.HEART, "heart");
		forItem(ButchercraftItems.COOKED_HEART, "cooked_heart");
		forItem(ButchercraftItems.KIDNEY, "kidney");
		forItem(ButchercraftItems.COOKED_KIDNEY, "cooked_kidney");
		forItem(ButchercraftItems.LIVER, "liver");
		forItem(ButchercraftItems.COOKED_LIVER, "cooked_liver");
		forItem(ButchercraftItems.LUNG, "lung");
		forItem(ButchercraftItems.COOKED_LUNG, "cooked_lung");
		forItem(ButchercraftItems.STOMACH, "stomach");
		forItem(ButchercraftItems.COOKED_STOMACH, "cooked_stomach");
		forItem(ButchercraftItems.TRIPE, "tripe");
		forItem(ButchercraftItems.COOKED_TRIPE, "cooked_tripe");
		forItem(ButchercraftItems.BEEF_TONGUE, "tongue");
		forItem(ButchercraftItems.COOKED_BEEF_TONGUE, "cooked_tongue");

		forItem(ButchercraftItems.BEEF_STEW_MEAT, "stew_beef");
		forItem(ButchercraftItems.COOKED_BEEF_STEW_MEAT, "cooked_stew_beef");
		forItem(ButchercraftItems.BEEF_ROAST, "roast");
		forItem(ButchercraftItems.COOKED_BEEF_ROAST, "cooked_roast");
		forItem(ButchercraftItems.BEEF_RIBS, "ribs");
		forItem(ButchercraftItems.COOKED_BEEF_RIBS, "cooked_ribs");
		forItem(ButchercraftItems.CUBED_BEEF, "cubed_beef");
		forItem(ButchercraftItems.COOKED_CUBED_BEEF, "cooked_cubed_beef");
		forItem(ButchercraftItems.GROUND_BEEF, "ground_beef");
		forItem(ButchercraftItems.COOKED_GROUND_BEEF, "cooked_ground_beef");
		forItem(ButchercraftItems.BEEF_SCRAPS, "beef_scraps");
		forItem(ButchercraftItems.COOKED_BEEF_SCRAPS, "cooked_beef_scraps");
		forItem(ButchercraftItems.OXTAIL, "oxtail");
		forItem(ButchercraftItems.COOKED_OXTAIL, "cooked_oxtail");

		forItem(ButchercraftItems.PORK_STEW_MEAT, "stew_pork");
		forItem(ButchercraftItems.COOKED_PORK_STEW_MEAT, "cooked_stew_pork");
		forItem(ButchercraftItems.PORK_ROAST, "roast");
		forItem(ButchercraftItems.COOKED_PORK_ROAST, "cooked_roast");
		forItem(ButchercraftItems.PORK_RIBS, "pork_ribs");
		forItem(ButchercraftItems.COOKED_PORK_RIBS, "cooked_pork_ribs");
		forItem(ButchercraftItems.CUBED_PORK, "cubed_pork");
		forItem(ButchercraftItems.COOKED_CUBED_PORK, "cooked_cubed_pork");
		forItem(ButchercraftItems.GROUND_PORK, "ground_pork");
		forItem(ButchercraftItems.COOKED_GROUND_PORK, "cooked_ground_pork");
		forItem(ButchercraftItems.PORK_SCRAPS, "pork_scraps");
		forItem(ButchercraftItems.COOKED_PORK_SCRAPS, "cooked_pork_scraps");

//		getBuilder(ButchercraftItems.PIG_HOOVES.getId().getPath())
//				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID, "item/pig_foot")));

		forItem(ButchercraftItems.LAMB_STEW_MEAT, "stew_lamb");
		forItem(ButchercraftItems.COOKED_LAMB_STEW_MEAT, "cooked_stew_lamb");
		forItem(ButchercraftItems.LAMB_ROAST, "roast");
		forItem(ButchercraftItems.COOKED_LAMB_ROAST, "cooked_roast");
		forItem(ButchercraftItems.LAMB_RIBS, "lamb_ribs");
		forItem(ButchercraftItems.COOKED_LAMB_RIBS, "cooked_lamb_ribs");
		forItem(ButchercraftItems.CUBED_LAMB, "cubed_lamb");
		forItem(ButchercraftItems.COOKED_CUBED_LAMB, "cooked_cubed_lamb");
		forItem(ButchercraftItems.GROUND_LAMB, "ground_lamb");
		forItem(ButchercraftItems.COOKED_GROUND_LAMB, "cooked_ground_lamb");
		forItem(ButchercraftItems.LAMB_SCRAPS, "lamb_scraps");
		forItem(ButchercraftItems.COOKED_LAMB_SCRAPS, "cooked_lamb_scraps");

		forBlockItem(ButchercraftItems.HOOK_BLOCK_ITEM, "hook");
		
		forBlockItem(ButchercraftItems.BUTCHER_BLOCK_BLOCK_ITEM, "butcher_block");

		forBlockItem(ButchercraftItems.BEEF_BLOCK_ITEM, "beef_block");
		forBlockItem(ButchercraftItems.COOKED_BEEF_BLOCK_ITEM, "cooked_beef_block");
		forBlockItem(ButchercraftItems.PORK_BLOCK_ITEM, "pork_block");
		forBlockItem(ButchercraftItems.COOKED_PORK_BLOCK_ITEM, "cooked_pork_block");
		forBlockItem(ButchercraftItems.LAMB_BLOCK_ITEM, "lamb_block");
		forBlockItem(ButchercraftItems.COOKED_LAMB_BLOCK_ITEM, "cooked_lamb_block");

		forBlockItem(ButchercraftItems.COW_HIDE, "cow_hide");
		forBlockItem(ButchercraftItems.PIG_HIDE, "pig_hide");
		forBlockItem(ButchercraftItems.SHEEP_HIDE, "sheep_hide");

	}

	public void forItem(RegistryObject<? extends Item> item, String name) {
		this.singleTexture(item.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + name));
	}

	public void forMaterialItem(RegistryObject<? extends Item> item, String name) {
		this.singleTexture(item.getId().getPath(), mcLoc("item/handheld"), "layer0",
				modLoc("item/material/" + name + "/" + item.getId().getPath()));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, String name) {
		getBuilder(item.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Butchercraft.MOD_ID,
						"block/" + ForgeRegistries.BLOCKS.getKey(item.get().getBlock()).getPath())));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, ResourceLocation modelLocation) {
		getBuilder(item.getId().getPath()).parent(new ModelFile.UncheckedModelFile(modelLocation));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, ResourceLocation modelLocation, String key,
			ResourceLocation texture) {
		getBuilder(item.getId().getPath()).parent(new ModelFile.UncheckedModelFile(modelLocation)).texture(key,
				texture);
	}

}