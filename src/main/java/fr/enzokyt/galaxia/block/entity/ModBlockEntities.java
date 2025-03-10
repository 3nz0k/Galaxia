package fr.enzokyt.galaxia.block.entity;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.ModBlocks;
import fr.enzokyt.galaxia.block.entity.GemInfuserEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Galaxia.MOD_ID);

    public static final RegistryObject<BlockEntityType<GemInfuserEntity>> GEM_INFUSER_ENTITY =
            BLOCK_ENTITIES.register("gem_infuser_entity", () ->
                    BlockEntityType.Builder.of(GemInfuserEntity::new,
                            ModBlocks.GEM_INFUSER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
