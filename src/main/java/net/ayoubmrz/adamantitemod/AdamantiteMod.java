package net.ayoubmrz.adamantitemod;

import net.ayoubmrz.adamantitemod.block.ModBlocks;
import net.ayoubmrz.adamantitemod.item.ModItemGroups;
import net.ayoubmrz.adamantitemod.item.ModItems;
import net.ayoubmrz.adamantitemod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdamantiteMod implements ModInitializer {
	public static final String MOD_ID = "adamantitemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorldGen();

	}
}