package eu.dandadin.dansrandoms.item;

import eu.dandadin.dansrandoms.DansRandoms;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DansRandoms.MOD_ID, "pink_garnet")))));
    public static final Item EMPTY_EGG = registerItem("empty_egg", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DansRandoms.MOD_ID, "empty_egg")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DansRandoms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DansRandoms.LOGGER.info("Registering Mod Items for " + DansRandoms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EMPTY_EGG);
        });
    }
}
