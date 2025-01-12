package eu.dandadin.dansrandoms;

import eu.dandadin.dansrandoms.item.ModItems;
import eu.dandadin.dansrandoms.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DansRandoms implements ModInitializer {
	public static final String MOD_ID = "dansrandoms";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModPotions.registerModPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.IRON_PICKAXE, ModPotions.HASTE_POTION);
			builder.registerPotionRecipe(ModPotions.HASTE_POTION, Items.REDSTONE, ModPotions.LONG_HASTE_POTION);
			builder.registerPotionRecipe(Potions.AWKWARD, Items.DIAMOND_PICKAXE, ModPotions.STRONG_HASTE_POTION);
			builder.registerPotionRecipe(ModPotions.STRONG_HASTE_POTION, Items.REDSTONE, ModPotions.LONG_STRONG_HASTE_POTION);
		});
	}
}