package net.ayoubmrz.adamantitemod.block;

import net.ayoubmrz.adamantitemod.AdamantiteMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            new Block (AbstractBlock.Settings.create().strength(50.0F, 1200.0F).requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            new Block (AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool()));

    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3.0F, 3.0F).requiresTool()));
    public static final Block ADAMANTITE_DEEPSLATE_ORE = registerBlock("adamantite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdamantiteMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AdamantiteMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AdamantiteMod.LOGGER.info("Registering Mod Blocks For " + AdamantiteMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(RAW_ADAMANTITE_BLOCK);
            entries.add(ADAMANTITE_ORE);
            entries.add(ADAMANTITE_DEEPSLATE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ADAMANTITE_BLOCK);
        });
    }

}
