package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.item.custom.GalaxiumArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GalaxiumArmorModel extends GeoModel<GalaxiumArmorItem> {
    @Override
    public ResourceLocation getModelResource(GalaxiumArmorItem animatable) {
         return new ResourceLocation(Galaxia.MOD_ID, "geo/galaxium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GalaxiumArmorItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "textures/armor/galaxium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GalaxiumArmorItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "animations/galaxium_armor.animation.json");
    }
}
