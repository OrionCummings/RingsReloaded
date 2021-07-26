package com.giantpotato.rings_reloaded;

import com.giantpotato.rings_reloaded.registry.ModBlocks;
import com.giantpotato.rings_reloaded.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RingsReloaded implements ModInitializer {

	public static final String MOD_ID = "rings_reloaded";

	public static final ItemGroup advanced_group = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "advanced_group"))
			.icon(() -> new ItemStack(ModItems.RING))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.RING));
				stacks.add(new ItemStack(ModItems.BAND));

				stacks.add(new ItemStack(ModItems.RUBY));
				stacks.add(new ItemStack(ModItems.PERIDOT));
				stacks.add(new ItemStack(ModItems.AZURITE));
				stacks.add(new ItemStack(ModItems.ALEXANDRITE));
				stacks.add(new ItemStack(ModItems.TANZANITE));
				stacks.add(new ItemStack(ModItems.MOON_STONE));
				stacks.add(new ItemStack(ModItems.BLACK_OPAL));

				stacks.add(new ItemStack(ModItems.RUBY_BLOCK));
				stacks.add(new ItemStack(ModItems.PERIDOT_BLOCK));
				stacks.add(new ItemStack(ModItems.AZURITE_BLOCK));
				stacks.add(new ItemStack(ModItems.ALEXANDRITE_BLOCK));
				stacks.add(new ItemStack(ModItems.TANZANITE_BLOCK));
				stacks.add(new ItemStack(ModItems.MOON_STONE_BLOCK));
				stacks.add(new ItemStack(ModItems.BLACK_OPAL_BLOCK));

				stacks.add(new ItemStack(ModBlocks.RUBY_ORE));
				stacks.add(new ItemStack(ModBlocks.PERIDOT_ORE));
				stacks.add(new ItemStack(ModBlocks.AZURITE_ORE));
				stacks.add(new ItemStack(ModBlocks.ALEXANDRITE_ORE));
				stacks.add(new ItemStack(ModItems.TANZANITE_ORE));
				stacks.add(new ItemStack(ModItems.MOON_STONE_ORE));
				stacks.add(new ItemStack(ModItems.BLACK_OPAL_ORE));

				stacks.add(new ItemStack(ModItems.WATERBREATHING_RING));
			}).build();

	public static void initOreGeneration(){
		System.out.println("Initializing ore generation.");
		// TODO
	}

	@Override
	public void onInitialize() {
		System.out.println("Thanks for using RingsReloaded!");
		System.out.println("Beginning initialization for RingsReloaded.");
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		initOreGeneration();
		System.out.println("Completed initialization of RingsReloaded. Happy crafting!");
	}
}
