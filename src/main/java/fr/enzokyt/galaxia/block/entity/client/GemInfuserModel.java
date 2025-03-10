package fr.enzokyt.galaxia.block.entity.client;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.entity.GemInfuserEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GemInfuserModel extends GeoModel<GemInfuserEntity> {
    @Override
    public ResourceLocation getModelResource(GemInfuserEntity animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "geo/gem_infuser.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GemInfuserEntity animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "textures/block/gem_infuser.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GemInfuserEntity animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "animations/gem_infuser.animation.json");
    }
}
