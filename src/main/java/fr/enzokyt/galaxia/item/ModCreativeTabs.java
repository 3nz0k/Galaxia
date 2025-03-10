package fr.enzokyt.galaxia.item;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Galaxia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
    public static CreativeModeTab GALAXIA_ITEMS_TAB;
    public static CreativeModeTab GALAXIA_TOOLS;
    public static CreativeModeTab GALAXIA_ARMORS;
    public static CreativeModeTab GALAXIA_BLOCKS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GALAXIA_ITEMS_TAB = event.registerCreativeModeTab(new ResourceLocation(Galaxia.MOD_ID, "galaxia_items_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.GALAXIUM.get()))
                    .title(Component.translatable("creativemodetab.galaxia_items_tab")));
        GALAXIA_TOOLS = event.registerCreativeModeTab(new ResourceLocation(Galaxia.MOD_ID, "galaxia_tools"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GALAXIUM_FRAGMENT.get()))
                        .title(Component.translatable("creativemodetab.galaxia_tools")));
        GALAXIA_ARMORS = event.registerCreativeModeTab(new ResourceLocation(Galaxia.MOD_ID, "galaxia_armors"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GALAXIUM_HELMET.get()))
                        .title(Component.translatable("creativemodetab.galaxia_armors")));
        GALAXIA_BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(Galaxia.MOD_ID, "galaxia_blocks_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.GALAXIUM_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.galaxia_blocks_tab")));
    }

}
