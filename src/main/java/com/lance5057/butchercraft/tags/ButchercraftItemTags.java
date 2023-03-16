package com.lance5057.butchercraft.tags;

import com.lance5057.butchercraft.Butchercraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ButchercraftItemTags {
	public static final TagKey<Item> CARCASSES = butcherTag("carcasses");

	// Generic Meat
	public static final TagKey<Item> MEAT = forgeTag("meat");
	public static final TagKey<Item> MEAT_RAW = forgeTag("meat/raw");
	public static final TagKey<Item> MEAT_COOKED = forgeTag("meat/cooked");

	public static final TagKey<Item> SCRAP_MEAT = forgeTag("meat/scrap");
	public static final TagKey<Item> SCRAP_MEAT_RAW = forgeTag("meat/scrap/raw");
	public static final TagKey<Item> SCRAP_MEAT_COOKED = forgeTag("meat/scrap/cooked");

	public static final TagKey<Item> ROAST = forgeTag("meat/roast");
	public static final TagKey<Item> ROAST_RAW = forgeTag("meat/roast/raw");
	public static final TagKey<Item> ROAST_COOKED = forgeTag("meat/roast/cooked");

	public static final TagKey<Item> RIBS = forgeTag("meat/ribs");
	public static final TagKey<Item> RIBS_RAW = forgeTag("meat/ribs/raw");
	public static final TagKey<Item> RIBS_COOKED = forgeTag("meat/ribs/cooked");

	public static final TagKey<Item> CUBED_MEAT = forgeTag("meat/cubed");
	public static final TagKey<Item> CUBED_MEAT_RAW = forgeTag("meat/cubed/raw");
	public static final TagKey<Item> CUBED_MEAT_COOKED = forgeTag("meat/cubed/cooked");

	public static final TagKey<Item> STEW_MEAT = forgeTag("meat/stew");
	public static final TagKey<Item> STEW_MEAT_RAW = forgeTag("meat/stew/raw");
	public static final TagKey<Item> STEW_MEAT_COOKED = forgeTag("meat/stew/cooked");

	public static final TagKey<Item> GROUND_MEAT = forgeTag("ground_meat");
	public static final TagKey<Item> GROUND_MEAT_RAW = forgeTag("ground_meat/raw");
	public static final TagKey<Item> GROUND_MEAT_COOKED = forgeTag("ground_meat/cooked");

	// Beef
	public static final TagKey<Item> BEEF = forgeTag("beef");

	public static final TagKey<Item> BEEF_RAW = forgeTag("beef/raw");
	public static final TagKey<Item> SCRAP_BEEF_RAW = forgeTag("beef/scrap/raw");
	public static final TagKey<Item> BEEF_ROAST_RAW = forgeTag("beef/roast/raw");
	public static final TagKey<Item> BEEF_RIBS_RAW = forgeTag("beef/ribs/raw");
	public static final TagKey<Item> CUBED_BEEF_RAW = forgeTag("beef/cubed/raw");
	public static final TagKey<Item> STEW_BEEF_RAW = forgeTag("beef/stew/raw");

	public static final TagKey<Item> BEEF_COOKED = forgeTag("beef/cooked");
	public static final TagKey<Item> SCRAP_BEEF_COOKED = forgeTag("beef/scrap/cooked");
	public static final TagKey<Item> BEEF_ROAST_COOKED = forgeTag("beef/roast/cooked");
	public static final TagKey<Item> BEEF_RIBS_COOKED = forgeTag("beef/ribs/cooked");
	public static final TagKey<Item> CUBED_BEEF_COOKED = forgeTag("beef/cubed/cooked");
	public static final TagKey<Item> STEW_BEEF_COOKED = forgeTag("beef/stew/cooked");

	// Pork
	public static final TagKey<Item> PORK = forgeTag("pork");

	public static final TagKey<Item> PORK_RAW = forgeTag("pork/raw");
	public static final TagKey<Item> SCRAP_PORK_RAW = forgeTag("pork/scrap/raw");
	public static final TagKey<Item> PORK_ROAST_RAW = forgeTag("pork/roast/raw");
	public static final TagKey<Item> PORK_RIBS_RAW = forgeTag("pork/ribs/raw");
	public static final TagKey<Item> CUBED_PORK_RAW = forgeTag("pork/cubed/raw");
	public static final TagKey<Item> STEW_PORK_RAW = forgeTag("pork/stew/raw");

	public static final TagKey<Item> PORK_COOKED = forgeTag("pork/cooked");
	public static final TagKey<Item> SCRAP_PORK_COOKED = forgeTag("pork/scrap/cooked");
	public static final TagKey<Item> PORK_ROAST_COOKED = forgeTag("pork/roast/cooked");
	public static final TagKey<Item> PORK_RIBS_COOKED = forgeTag("pork/ribs/cooked");
	public static final TagKey<Item> CUBED_PORK_COOKED = forgeTag("pork/cubed/cooked");
	public static final TagKey<Item> STEW_PORK_COOKED = forgeTag("pork/stew/cooked");

	// Mutton
	public static final TagKey<Item> MUTTON = forgeTag("mutton");

	public static final TagKey<Item> MUTTON_RAW = forgeTag("mutton/raw");
	public static final TagKey<Item> SCRAP_MUTTON_RAW = forgeTag("mutton/scrap/raw");
	public static final TagKey<Item> MUTTON_ROAST_RAW = forgeTag("mutton/roast/raw");
	public static final TagKey<Item> MUTTON_RIBS_RAW = forgeTag("mutton/ribs/raw");
	public static final TagKey<Item> CUBED_MUTTON_RAW = forgeTag("mutton/cubed/raw");
	public static final TagKey<Item> STEW_MUTTON_RAW = forgeTag("mutton/stew/raw");

	public static final TagKey<Item> MUTTON_COOKED = forgeTag("mutton/cooked");
	public static final TagKey<Item> SCRAP_MUTTON_COOKED = forgeTag("mutton/scrap/cooked");
	public static final TagKey<Item> MUTTON_ROAST_COOKED = forgeTag("mutton/roast/cooked");
	public static final TagKey<Item> MUTTON_RIBS_COOKED = forgeTag("mutton/ribs/cooked");
	public static final TagKey<Item> CUBED_MUTTON_COOKED = forgeTag("mutton/cubed/cooked");
	public static final TagKey<Item> STEW_MUTTON_COOKED = forgeTag("mutton/stew/cooked");

	public static final TagKey<Item> OFFAL = forgeTag("offal");
	public static final TagKey<Item> OFFAL_RAW = forgeTag("offal/raw");
	public static final TagKey<Item> OFFAL_COOKED = forgeTag("offal/cooked");

	public static final TagKey<Item> TRIPE = forgeTag("tripe");
	public static final TagKey<Item> TRIPE_RAW = forgeTag("tripe/raw");
	public static final TagKey<Item> TRIPE_COOKED = forgeTag("tripe/cooked");

	public static final TagKey<Item> STOMACH = forgeTag("stomach");
	public static final TagKey<Item> STOMACH_RAW = forgeTag("stomach/raw");
	public static final TagKey<Item> STOMACH_COOKED = forgeTag("stomach/cooked");

	public static final TagKey<Item> LUNG = forgeTag("lung");
	public static final TagKey<Item> LUNG_RAW = forgeTag("lung/raw");
	public static final TagKey<Item> LUNG_COOKED = forgeTag("lung/cooked");

	public static final TagKey<Item> LIVER = forgeTag("liver");
	public static final TagKey<Item> LIVER_RAW = forgeTag("liver/raw");
	public static final TagKey<Item> LIVER_COOKED = forgeTag("liver/cooked");

	public static final TagKey<Item> KIDNEY = forgeTag("kidney");
	public static final TagKey<Item> KIDNEY_RAW = forgeTag("kidney/raw");
	public static final TagKey<Item> KIDNEY_COOKED = forgeTag("kidney/cooked");

	public static final TagKey<Item> HEART = forgeTag("heart");
	public static final TagKey<Item> HEART_RAW = forgeTag("heart/raw");
	public static final TagKey<Item> HEART_COOKED = forgeTag("heart/cooked");

	public static final TagKey<Item> BRAIN = forgeTag("brain");
	public static final TagKey<Item> BRAIN_RAW = forgeTag("brain/raw");
	public static final TagKey<Item> BRAIN_COOKED = forgeTag("brain/cooked");

	public static final TagKey<Item> GELATIN = forgeTag("gelatin");
	public static final TagKey<Item> GELATIN_PROVIDER = butcherTag("gelatin_provider");

	public static TagKey<Item> forgeTag(String tag) {
		return ItemTags.create(new ResourceLocation("forge", tag));
	}

	public static TagKey<Item> butcherTag(String tag) {
		return ItemTags.create(new ResourceLocation(Butchercraft.MOD_ID, tag));
	}
}
