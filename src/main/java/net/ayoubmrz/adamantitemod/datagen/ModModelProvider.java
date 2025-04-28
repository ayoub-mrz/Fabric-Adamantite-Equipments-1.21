package net.ayoubmrz.adamantitemod.datagen;

import net.ayoubmrz.adamantitemod.block.ModBlocks;
import net.ayoubmrz.adamantitemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_BOOTS));

        itemModelGenerator.register(ModItems.ADAMANTITE_HORSE_ARMOR, Models.GENERATED);

    }
}
