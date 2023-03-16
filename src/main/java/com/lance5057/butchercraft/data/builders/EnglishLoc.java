package com.lance5057.butchercraft.data.builders;

import static com.lance5057.butchercraft.ButchercraftItems.BEEF_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.BEEF_TONGUE;
import static com.lance5057.butchercraft.ButchercraftItems.BONE_SAW;
import static com.lance5057.butchercraft.ButchercraftItems.BRAIN;
import static com.lance5057.butchercraft.ButchercraftItems.BUTCHER_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BEEF_TONGUE;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_BRAIN;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_CUBED_BEEF;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_CUBED_LAMB;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_CUBED_PORK;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_GROUND_BEEF;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_GROUND_LAMB;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_GROUND_PORK;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_HEART;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_KIDNEY;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LAMB_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LIVER;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_LUNG;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_OXTAIL;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_PORK_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_STOMACH;
import static com.lance5057.butchercraft.ButchercraftItems.COOKED_TRIPE;
import static com.lance5057.butchercraft.ButchercraftItems.COW_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.COW_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.CUBED_BEEF;
import static com.lance5057.butchercraft.ButchercraftItems.CUBED_LAMB;
import static com.lance5057.butchercraft.ButchercraftItems.CUBED_PORK;
import static com.lance5057.butchercraft.ButchercraftItems.FAT;
import static com.lance5057.butchercraft.ButchercraftItems.GROUND_BEEF;
import static com.lance5057.butchercraft.ButchercraftItems.GROUND_LAMB;
import static com.lance5057.butchercraft.ButchercraftItems.GROUND_PORK;
import static com.lance5057.butchercraft.ButchercraftItems.GUT_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.HEART;
import static com.lance5057.butchercraft.ButchercraftItems.HORN;
import static com.lance5057.butchercraft.ButchercraftItems.KIDNEY;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.LAMB_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.LEATHER_CORD;
import static com.lance5057.butchercraft.ButchercraftItems.LEATHER_SCRAP;
import static com.lance5057.butchercraft.ButchercraftItems.LIVER;
import static com.lance5057.butchercraft.ButchercraftItems.LUNG;
import static com.lance5057.butchercraft.ButchercraftItems.OXTAIL;
import static com.lance5057.butchercraft.ButchercraftItems.PIG_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.PIG_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_BLOCK_ITEM;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_RIBS;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_ROAST;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_SCRAPS;
import static com.lance5057.butchercraft.ButchercraftItems.PORK_STEW_MEAT;
import static com.lance5057.butchercraft.ButchercraftItems.SHEEP_CARCASS;
import static com.lance5057.butchercraft.ButchercraftItems.SHEEP_HIDE;
import static com.lance5057.butchercraft.ButchercraftItems.SINEW;
import static com.lance5057.butchercraft.ButchercraftItems.SKINNING_KNIFE;
import static com.lance5057.butchercraft.ButchercraftItems.STOMACH;
import static com.lance5057.butchercraft.ButchercraftItems.TRIPE;

import com.lance5057.butchercraft.Butchercraft;
import com.lance5057.butchercraft.ButchercraftItems;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLoc extends LanguageProvider {

	public EnglishLoc(DataGenerator gen) {
		super(gen, Butchercraft.MOD_ID, "en_us");

	}

	@Override
	protected void addTranslations() {
		Butchercraft.logger.info("\tEN_US Localization");

		this.add("itemGroup.butchercraft.items", "Butchercraft Items");

		this.add(COOKED_BEEF_SCRAPS.get(), "Cooked Beef Straps");
		this.add(BEEF_SCRAPS.get(), "Raw Beef Scraps");
		this.add(COOKED_GROUND_BEEF.get(), "Cooked Ground Beef");
		this.add(GROUND_BEEF.get(), "Raw Ground Beef");
		this.add(COOKED_CUBED_BEEF.get(), "Cooked Cubed Beef");
		this.add(CUBED_BEEF.get(), "Raw Cubed Beef");
		this.add(COOKED_BEEF_RIBS.get(), "Cooked Beef Ribs");
		this.add(BEEF_RIBS.get(), "Raw Beef Ribs");
		this.add(COOKED_BEEF_ROAST.get(), "Cooked Beef Roast");
		this.add(BEEF_ROAST.get(), "Raw Beef Roast");

		this.add(BEEF_STEW_MEAT.get(), "Raw Beef Stew Meat");
		this.add(COOKED_BEEF_STEW_MEAT.get(), "Cooked Beef Stew Meat");
		this.add(OXTAIL.get(), "Raw Oxtail");
		this.add(COOKED_OXTAIL.get(), "Cooked Oxtail");

		this.add(COOKED_PORK_SCRAPS.get(), "Cooked Pork Straps");
		this.add(PORK_SCRAPS.get(), "Raw Pork Scraps");
		this.add(COOKED_GROUND_PORK.get(), "Cooked Ground Pork");
		this.add(GROUND_PORK.get(), "Raw Ground Pork");
		this.add(COOKED_CUBED_PORK.get(), "Cooked Cubed Pork");
		this.add(CUBED_PORK.get(), "Raw Cubed Pork");
		this.add(COOKED_PORK_RIBS.get(), "Cooked Pork Ribs");
		this.add(PORK_RIBS.get(), "Raw Pork Ribs");
		this.add(COOKED_PORK_ROAST.get(), "Cooked Pork Roast");
		this.add(PORK_ROAST.get(), "Raw Pork Roast");
		this.add(PORK_STEW_MEAT.get(), "Raw Pork Stew Meat");
		this.add(COOKED_PORK_STEW_MEAT.get(), "Cooked Pork Stew Meat");

		this.add(COOKED_LAMB_SCRAPS.get(), "Cooked Lamb Straps");
		this.add(LAMB_SCRAPS.get(), "Raw Lamb Scraps");
		this.add(COOKED_GROUND_LAMB.get(), "Cooked Ground Lamb");
		this.add(GROUND_LAMB.get(), "Raw Ground Lamb");
		this.add(COOKED_CUBED_LAMB.get(), "Cooked Cubed Lamb");
		this.add(CUBED_LAMB.get(), "Raw Cubed Lamb");
		this.add(COOKED_LAMB_RIBS.get(), "Cooked Lamb Ribs");
		this.add(LAMB_RIBS.get(), "Raw Lamb Ribs");
		this.add(COOKED_LAMB_ROAST.get(), "Cooked Lamb Roast");
		this.add(LAMB_ROAST.get(), "Raw Lamb Roast");
		this.add(LAMB_STEW_MEAT.get(), "Raw Lamb Stew Meat");
		this.add(COOKED_LAMB_STEW_MEAT.get(), "Cooked Lamb Stew Meat");

		this.add(COOKED_TRIPE.get(), "Cooked Intestines");
		this.add(TRIPE.get(), "Raw Intestines");
		this.add(COOKED_STOMACH.get(), "Cooked Stomach");
		this.add(STOMACH.get(), "Raw Stomach");
		this.add(COOKED_LUNG.get(), "Cooked Lung");
		this.add(LUNG.get(), "Raw Lung");
		this.add(COOKED_LIVER.get(), "Cooked Liver");
		this.add(LIVER.get(), "Raw Liver");
		this.add(COOKED_KIDNEY.get(), "Cooked Kidney");
		this.add(KIDNEY.get(), "Raw Kidney");
		this.add(COOKED_HEART.get(), "Cooked Heart");
		this.add(HEART.get(), "Raw Heart");
		this.add(COOKED_BRAIN.get(), "Cooked Brain");
		this.add(BRAIN.get(), "Raw Brain");
		this.add(COOKED_BEEF_TONGUE.get(), "Cooked Tongue");
		this.add(BEEF_TONGUE.get(), "Raw Tongue");

		this.add(COW_CARCASS.get(), "Cow Carcass");
		this.add(PIG_CARCASS.get(), "Pig Carcass");
		this.add(SHEEP_CARCASS.get(), "Sheep Carcass");

		this.add(BEEF_BLOCK_ITEM.get(), "Raw Beef Block");
		this.add(PORK_BLOCK_ITEM.get(), "Raw Pork Block");
		this.add(LAMB_BLOCK_ITEM.get(), "Raw Lamb Block");

		this.add(COOKED_BEEF_BLOCK_ITEM.get(), "Cooked Beef Block");
		this.add(COOKED_PORK_BLOCK_ITEM.get(), "Cooked Pork Block");
		this.add(COOKED_LAMB_BLOCK_ITEM.get(), "Cooked Lamb Block");

		this.add(BUTCHER_KNIFE.get(), "Butcher Knife");
		this.add(SKINNING_KNIFE.get(), "Skinning Knife");
		this.add(BONE_SAW.get(), "Bone Saw");
		this.add(GUT_KNIFE.get(), "Gut Knife");

		this.add(COW_HIDE.get(), "Cow Hide");
		this.add(PIG_HIDE.get(), "Pig Hide");
		this.add(SHEEP_HIDE.get(), "Sheep Hide");

		this.add(HORN.get(), "Horn");

		this.add(LEATHER_SCRAP.get(), "Leather Scrap");
		this.add(LEATHER_CORD.get(), "Leather Cord");

		this.add(FAT.get(), "Fat");
		this.add(SINEW.get(), "Sinew");
		this.add(ButchercraftItems.LARD.get(), "Lard");
		this.add(ButchercraftItems.GELATIN.get(), "Gelatin");

		this.add(ButchercraftItems.HOOK_BLOCK_ITEM.get(), "Meat Hook");
		
		this.add(ButchercraftItems.BUTCHER_BLOCK_BLOCK_ITEM.get(), "Butcher Block");

//        this.add(COW_SKULL.get(), "Cow Skull");

		// Advancements
		this.add(Butchercraft.MOD_ID + ".advancement.root.name", "Butchercraft");
		this.add(Butchercraft.MOD_ID + ".advancement.root.desc", "Welcome to Butchercraft!");

		this.add(Butchercraft.MOD_ID + ".advancement.hook.name", "On the hook");
		this.add(Butchercraft.MOD_ID + ".advancement.hook.desc", "Craft a Meat Hook");

		this.add(Butchercraft.MOD_ID + ".advancement.butcherknife.name", "Baker and Candlestick maker.");
		this.add(Butchercraft.MOD_ID + ".advancement.butcherknife.desc", "Craft a Butcher Knife");

		this.add(Butchercraft.MOD_ID + ".advancement.skinningknife.desc", "A very close shave.");
		this.add(Butchercraft.MOD_ID + ".advancement.skinningknife.name", "Craft a Skinning Knife");

		this.add(Butchercraft.MOD_ID + ".advancement.gutknife.name", "You've got guts kid.");
		this.add(Butchercraft.MOD_ID + ".advancement.gutknife.desc", "Craft a Gut Knife");

		this.add(Butchercraft.MOD_ID + ".advancement.bonesaw.name", "Skeleton's Nightmare.");
		this.add(Butchercraft.MOD_ID + ".advancement.bonesaw.desc", "Craft a Bone Saw");

		this.add(Butchercraft.MOD_ID + ".advancement.cow.name", "Where's the beef?");
		this.add(Butchercraft.MOD_ID + ".advancement.cow.desc", "Use a Butcher Knife on a Cow (Right Click)");

		this.add(Butchercraft.MOD_ID + ".advancement.pig.name", "The other white meat");
		this.add(Butchercraft.MOD_ID + ".advancement.pig.desc", "Use a Butcher Knife on a Pig (Right Click)");

		this.add(Butchercraft.MOD_ID + ".advancement.sheep.name", "Me thinks it's mutton-tastic");
		this.add(Butchercraft.MOD_ID + ".advancement.sheep.desc", "Use a Butcher Knife on a Sheep (Right Click)");

		this.add(Butchercraft.MOD_ID + ".advancement.whole_cow.name", "Everything but the moo.");
		this.add(Butchercraft.MOD_ID + ".advancement.whole_cow.desc", "Eat every edible cooked beef item.");

		this.add(Butchercraft.MOD_ID + ".advancement.whole_pig.name", "Everything but the oink.");
		this.add(Butchercraft.MOD_ID + ".advancement.whole_pig.desc", "Eat every edible cooked pork item.");

		this.add(Butchercraft.MOD_ID + ".advancement.whole_sheep.name", "Everything but the bleat.");
		this.add(Butchercraft.MOD_ID + ".advancement.whole_sheep.desc", "Eat every edible cooked mutton item.");

		this.add(Butchercraft.MOD_ID + ".advancement.everything.name", "A little bit of everything");
		this.add(Butchercraft.MOD_ID + ".advancement.everything.desc", "Eat all cooked meat.");

		this.add(Butchercraft.MOD_ID + ".advancement.everything_plus.name", "I said everything!");
		this.add(Butchercraft.MOD_ID + ".advancement.everything_plus.desc", "Eat all cooked edible parts.");

		this.add(Butchercraft.MOD_ID + ".advancement.heart.name", "Eat your heart out.");
		this.add(Butchercraft.MOD_ID + ".advancement.heart.desc", "Eat a raw heart.");

		this.add(Butchercraft.MOD_ID + ".advancement.cannibalism.name", "This isn't RimWorld...");
		this.add(Butchercraft.MOD_ID + ".advancement.cannibalism.desc", "Try to butcher a human.");

		this.add(Butchercraft.MOD_ID + ".butcherknife.rightclick", "Right click to slaughter.");
	}

}