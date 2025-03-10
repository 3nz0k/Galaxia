package fr.enzokyt.galaxia.item;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.ModBlocks;
import fr.enzokyt.galaxia.item.custom.GalaxiumArmorItem;
import fr.enzokyt.galaxia.item.custom.GemInfuserItem;
import fr.enzokyt.galaxia.item.custom.TestHelmetItem;
import fr.enzokyt.galaxia.util.ModTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Galaxia.MOD_ID);

    // --- [ GALAXIUM ] ---
    public static final RegistryObject<Item> GALAXIUM_FRAGMENT = ITEMS.register("galaxium_fragment",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM = ITEMS.register("galaxium",
            () -> new Item(new Item.Properties()));

    // --- [ GALAXIUM TOOLS] ---
    public static final RegistryObject<Item> GALAXIUM_PICKAXE = ITEMS.register("galaxium_pickaxe",
            () -> new PickaxeItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_AXE = ITEMS.register("galaxium_axe",
            () -> new AxeItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_HOE = ITEMS.register("galaxium_hoe",
            () -> new HoeItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_HAMMER = ITEMS.register("galaxium_hammer",
            () -> new PickaxeItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_SHOVEL = ITEMS.register("galaxium_shovel",
            () -> new ShovelItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_SWORD = ITEMS.register("galaxium_sword",
            () -> new SwordItem(Tiers.GALAXIUM, 5, 12f, new Item.Properties()));

    // --- [ GALAXIUM ARMOR ] ---
    public static final RegistryObject<Item> GALAXIUM_HELMET = ITEMS.register("galaxium_helmet",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_CHESTPLATE = ITEMS.register("galaxium_chestplate",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_LEGGINGS = ITEMS.register("galaxium_leggings",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_BOOTS = ITEMS.register("galaxium_boots",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> TEST_HELMET = ITEMS.register("test_helmet",
            () -> new TestHelmetItem(ModArmorMaterials.TESTHELMET, ArmorItem.Type.HELMET, new Item.Properties()));

    // --- [ BISMUTH ] ---

    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    // --- [ BISMUTH ARMOR ] ---


    // --- [ STICKS ] ---
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOON_STICK = ITEMS.register("moon_stick",
            () -> new FoodOnAStickItem<>((new Item.Properties()), EntityType.PIG, 7));


    // --- [ ANIMATED ITEM ] ---
    public static final RegistryObject<Item> GEM_INFUSER_ITEM = ITEMS.register("gem_infuser",
            () -> new GemInfuserItem(ModBlocks.GEM_INFUSER.get(),new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static class Tiers {
        public static final Tier GALAXIUM = new ForgeTier(
                5,
                4096,
                12f,
                1,
                350,
                ModTags.Blocks.NEEDS_GALAXIUM_TOOL,
                () -> Ingredient.of(ModItems.GALAXIUM.get()));
    }
}
