package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.item.custom.GemInfuserItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GemInfuserItemModel extends GeoModel<GemInfuserItem> {
    @Override
    public ResourceLocation getModelResource(GemInfuserItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "geo/gem_infuser.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GemInfuserItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "textures/block/gem_infuser.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GemInfuserItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "animations/gem_infuser.animation.json");
    }
}
