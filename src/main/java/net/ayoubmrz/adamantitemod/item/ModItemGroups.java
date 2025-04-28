package net.ayoubmrz.adamantitemod.item;

import net.ayoubmrz.adamantitemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ayoubmrz.adamantitemod.AdamantiteMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ADAMANTITE_EQUIPMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdamantiteMod.MOD_ID, "adamantite_equipments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ADAMANTITE_INGOT))
                    .displayName(Text.translatable("itemgroup.adamantitemod.adamantite_equipments"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.RAW_ADAMANTITE);

                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);

                        entries.add(ModItems.ADAMANTITE_SWORD);
                        entries.add(ModItems.ADAMANTITE_PICKAXE);
                        entries.add(ModItems.ADAMANTITE_SHOVEL);
                        entries.add(ModItems.ADAMANTITE_AXE);
                        entries.add(ModItems.ADAMANTITE_HOE);

                        entries.add(ModItems.ADAMANTITE_HELMET);
                        entries.add(ModItems.ADAMANTITE_CHESTPLATE);
                        entries.add(ModItems.ADAMANTITE_LEGGINGS);
                        entries.add(ModItems.ADAMANTITE_BOOTS);

                        entries.add(ModItems.ADAMANTITE_HORSE_ARMOR);

                    }).build());

    public static void registerItemGroups() {
        AdamantiteMod.LOGGER.info("Registering Item Groups for " + AdamantiteMod.MOD_ID);
    }
}

