package com.giantpotato.rings_reloaded.registry;

import com.giantpotato.rings_reloaded.RingsReloaded;
import com.giantpotato.rings_reloaded.rings.crude_rings.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems{

    // Basic Gems
    public static final Item AZURITE = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.COMMON));
    public static final Item RUBY = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.COMMON));
    public static final Item PERIDOT = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.COMMON));

    // Empowered Gems
    public static final Item ALEXANDRITE = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.RARE));
    public static final Item TANZANITE = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.RARE));

    // Forbidden Gems
    public static final Item MOON_STONE = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.EPIC));
    public static final Item BLACK_OPAL = new Item(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.EPIC));

    // Block Items
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem AZURITE_ORE = new BlockItem(ModBlocks.AZURITE_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem PERIDOT_ORE = new BlockItem(ModBlocks.PERIDOT_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem ALEXANDRITE_ORE = new BlockItem(ModBlocks.ALEXANDRITE_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem TANZANITE_ORE = new BlockItem(ModBlocks.TANZANITE_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem MOON_STONE_ORE = new BlockItem(ModBlocks.MOON_STONE_ORE, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem BLACK_OPAL_ORE = new BlockItem(ModBlocks.BLACK_OPAL_ORE, new Item.Settings().group(RingsReloaded.advanced_group));


    // Gem Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem PERIDOT_BLOCK = new BlockItem(ModBlocks.PERIDOT_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem AZURITE_BLOCK = new BlockItem(ModBlocks.AZURITE_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem ALEXANDRITE_BLOCK = new BlockItem(ModBlocks.ALEXANDRITE_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem TANZANITE_BLOCK = new BlockItem(ModBlocks.TANZANITE_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem MOON_STONE_BLOCK = new BlockItem(ModBlocks.MOON_STONE_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));
    public static final BlockItem BLACK_OPAL_BLOCK = new BlockItem(ModBlocks.BLACK_OPAL_BLOCK, new Item.Settings().group(RingsReloaded.advanced_group));

    // Special Rings
    public static final Item RING = new Item(new Item.Settings().group(RingsReloaded.advanced_group).maxCount(1));
    public static final Item BAND = new Item(new Item.Settings().group(RingsReloaded.advanced_group).maxCount(1).rarity(Rarity.EPIC));

    // Crude Rings
    public static final Item WATERBREATHING_RING = new WaterbreathingRing(new Item.Settings().group(RingsReloaded.advanced_group).rarity(Rarity.COMMON).maxCount(1));

    public static void registerItems(){
        System.out.println("Registering items.");
        registerGems();
        registerOres();
        registerGemBlocks();
        registerRings();
    }

    private static void registerRings(){
        registerSpecialRings();
        registerCrudeRings();
        registerUncommonRings();
        registerRareRings();
        registerMythicalRings();
        registerArcaneRings();
        registerTarnishedRings();
    }

    private static void registerSpecialRings() {
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "ring"), RING);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "band"), BAND);
    }
    private static void registerCrudeRings(){
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "waterbreathing_ring"), WATERBREATHING_RING);
    }
    private static void registerUncommonRings(){

    }
    private static void registerRareRings(){

    }
    private static void registerMythicalRings(){

    }
    private static void registerArcaneRings(){

    }
    private static void registerTarnishedRings(){

    }

    private static void registerGemBlocks() {
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "peridot_block"), PERIDOT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "azurite_block"), AZURITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "alexandrite_block"), ALEXANDRITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "tanzanite_block"), TANZANITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "moon_stone_block"), MOON_STONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "black_opal_block"), BLACK_OPAL_BLOCK);
    }
    private static void registerOres() {
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "azurite_ore"), AZURITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "peridot_ore"), PERIDOT_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "alexandrite_ore"), ALEXANDRITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "tanzanite_ore"), TANZANITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "moon_stone_ore"), MOON_STONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "black_opal_ore"), BLACK_OPAL_ORE);

    }
    private static void registerGems() {
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "peridot"), PERIDOT);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "azurite"), AZURITE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "alexandrite"), ALEXANDRITE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "tanzanite"), TANZANITE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "moon_stone"), MOON_STONE);
        Registry.register(Registry.ITEM, new Identifier(RingsReloaded.MOD_ID, "black_opal"), BLACK_OPAL);
    }
}