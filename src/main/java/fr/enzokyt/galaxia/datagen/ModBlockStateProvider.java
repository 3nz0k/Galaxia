package fr.enzokyt.galaxia.datagen;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Galaxia.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.GALAXIUM_BLOCK);
        blockWithItem(ModBlocks.GALAXIUM_ORE);

        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.BISMUTH_ORE);

        blockWithItem(ModBlocks.END_BLOCK);

        blockWithItem(ModBlocks.MOON_STONE);
        blockWithItem(ModBlocks.MOON_COBBLE);
        blockWithItem(ModBlocks.MOON_SAND);
        blockWithItem(ModBlocks.MOON_DIRT);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
