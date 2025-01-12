package eu.dandadin.dansrandoms.potion;

import eu.dandadin.dansrandoms.DansRandoms;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.recipe.BrewingRecipeRegistry;
public class ModPotions {

    public static final RegistryEntry<Potion> HASTE_POTION = registerPotion("haste_potion",
            new Potion("haste_potion", new StatusEffectInstance(StatusEffects.HASTE, 6000, 1)));

    public static final RegistryEntry<Potion> LONG_HASTE_POTION = registerPotion("long_haste_potion",
            new Potion("long_haste_potion", new StatusEffectInstance(StatusEffects.HASTE, 12000, 1)));

    public static final RegistryEntry<Potion> STRONG_HASTE_POTION = registerPotion("strong_haste_potion",
            new Potion("strong_haste_potion", new StatusEffectInstance(StatusEffects.HASTE, 6000, 3)));

    public static final RegistryEntry<Potion> LONG_STRONG_HASTE_POTION = registerPotion("long_strong_haste_potion",
            new Potion("long_strong_haste_potion", new StatusEffectInstance(StatusEffects.HASTE, 12000, 3)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(DansRandoms.MOD_ID, name), potion);
    }

    public static void registerModPotions() {
        DansRandoms.LOGGER.info("Registering Mod Potions for " + DansRandoms.MOD_ID);
    }

}
