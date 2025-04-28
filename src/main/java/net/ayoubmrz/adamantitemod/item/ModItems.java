package net.ayoubmrz.adamantitemod.item;

import net.ayoubmrz.adamantitemod.AdamantiteMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", new Item(new Item.Settings()));

    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword",
            new SwordItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 3, -2.4f))));
    public static final Item ADAMANTITE_PICKAXE = registerItem("adamantite_pickaxe",
            new PickaxeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 1, -2.8f))));
    public static final Item ADAMANTITE_SHOVEL = registerItem("adamantite_shovel",
            new ShovelItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 1.5f, -3.0f))));
    public static final Item ADAMANTITE_AXE = registerItem("adamantite_axe",
            new AxeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 6, -3.2f))));
    public static final Item ADAMANTITE_HOE = registerItem("adamantite_hoe",
            new HoeItem(ModToolMaterials.ADAMANTITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADAMANTITE, 0, -3f))));

    public static final Item ADAMANTITE_HELMET = registerItem("adamantite_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item ADAMANTITE_CHESTPLATE = registerItem("adamantite_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item ADAMANTITE_LEGGINGS = registerItem("adamantite_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item ADAMANTITE_BOOTS = registerItem("adamantite_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item ADAMANTITE_HORSE_ARMOR = registerItem("adamantite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdamantiteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdamantiteMod.LOGGER.info("Registering Mod Items for " + AdamantiteMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ADAMANTITE_INGOT);
            entries.add(RAW_ADAMANTITE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ADAMANTITE_SWORD);
            entries.add(ADAMANTITE_AXE);
            entries.add(ADAMANTITE_HELMET);
            entries.add(ADAMANTITE_CHESTPLATE);
            entries.add(ADAMANTITE_LEGGINGS);
            entries.add(ADAMANTITE_BOOTS);
            entries.add(ADAMANTITE_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ADAMANTITE_PICKAXE);
            entries.add(ADAMANTITE_SHOVEL);
            entries.add(ADAMANTITE_AXE);
            entries.add(ADAMANTITE_HOE);
        });
    }
}
