package eu.dandadin.dansrandoms.block;

import eu.dandadin.dansrandoms.DansRandoms;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DIAMOND_BARS = registerBlock("diamond_bars",
            new PaneBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()
                    .registryKey(
                            RegistryKey.of(
                                    RegistryKeys.BLOCK,
                                    Identifier.of(DansRandoms.MOD_ID, "diamond_bars")
                            )
                    )
            ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DansRandoms.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DansRandoms.MOD_ID, name),
                new BlockItem(
                        block,
                        new Item.Settings().registryKey(
                                RegistryKey.of(
                                        RegistryKeys.ITEM,
                                        Identifier.of(DansRandoms.MOD_ID, name)
                                )
                        )
                )
        );
    }

    public static void registerModBlocks() {
        DansRandoms.LOGGER.info("Registering Mod Blocks for " + DansRandoms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.DIAMOND_BARS);
        });
    }
}
