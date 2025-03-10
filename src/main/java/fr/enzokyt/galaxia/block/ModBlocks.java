package fr.enzokyt.galaxia.block;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.custom.GemInfuser;
import fr.enzokyt.galaxia.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Galaxia.MOD_ID);


//BLOCK
    public static final RegistryObject<Block> GALAXIUM_BLOCK = registerBlock("galaxium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_BLOCK = registerBlock("end_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOON_COBBLE = registerBlock("moon_cobble",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> MOON_STONE = registerBlock("moon_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

//ORE
    public static final RegistryObject<Block> GALAXIUM_ORE = registerBlock("galaxium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

//BLOCK
    public static final RegistryObject<Block> MOON_SAND = registerBlock("moon_sand",
        ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.SAND)
                .strength(1.0f).noOcclusion().sound(SoundType.SAND)));

    public static final RegistryObject<Block> MOON_GRASS = registerBlock("moon_grass",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(1.0f).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> MOON_DIRT = registerBlock("moon_dirt",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(1.0f).sound(SoundType.GRASS)));

//ANIMATED BLOCK
    public static final RegistryObject<Block> GEM_INFUSER = BLOCKS.register("gem_infuser",
            () -> new GemInfuser(BlockBehaviour.Properties.of(Material.STONE).strength(4.0f).sound(SoundType.ANVIL)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }
}
