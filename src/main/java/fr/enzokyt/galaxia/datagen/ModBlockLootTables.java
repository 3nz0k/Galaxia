package fr.enzokyt.galaxia.datagen;

import fr.enzokyt.galaxia.block.ModBlocks;
import fr.enzokyt.galaxia.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        dropSelf(ModBlocks.GALAXIUM_BLOCK.get());
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());

        dropSelf(ModBlocks.END_BLOCK.get());
        dropSelf(ModBlocks.MOON_COBBLE.get());
        dropSelf(ModBlocks.MOON_SAND.get());
        dropSelf(ModBlocks.MOON_GRASS.get());
        dropSelf(ModBlocks.MOON_DIRT.get());
        dropSelf(ModBlocks.GEM_INFUSER.get());


        add(ModBlocks.GALAXIUM_ORE.get(),
                (block) -> createOreDrop(ModBlocks.GALAXIUM_ORE.get(), ModItems.GALAXIUM_FRAGMENT.get()));
        add(ModBlocks.BISMUTH_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BISMUTH_ORE.get(), ModItems.BISMUTH.get()));

        add(ModBlocks.MOON_STONE.get(),
                (block) -> createSingleItemTableWithSilkTouch(block, ModBlocks.MOON_COBBLE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
