package fr.enzokyt.galaxia.datagen;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Galaxia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GALAXIUM_FRAGMENT);
        simpleItem(ModItems.GALAXIUM);

        simpleItem(ModItems.BISMUTH);

        simpleItem(ModItems.IRON_STICK);
        simpleItem(ModItems.DIAMOND_STICK);
        simpleItem(ModItems.MOON_STICK);

        simpleItem(ModItems.GALAXIUM_HELMET);
        simpleItem(ModItems.GALAXIUM_CHESTPLATE);
        simpleItem(ModItems.GALAXIUM_LEGGINGS);
        simpleItem(ModItems.GALAXIUM_BOOTS);

        simpleItem(ModItems.GALAXIUM_AXE);
        simpleItem(ModItems.GALAXIUM_PICKAXE);
        simpleItem(ModItems.GALAXIUM_HAMMER);
        simpleItem(ModItems.GALAXIUM_HOE);
        simpleItem(ModItems.GALAXIUM_SHOVEL);
        simpleItem(ModItems.GALAXIUM_SWORD);

        simpleItem(ModItems.TEST_HELMET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Galaxia.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Galaxia.MOD_ID, "item/" + item.getId().getPath()));
    }
}
