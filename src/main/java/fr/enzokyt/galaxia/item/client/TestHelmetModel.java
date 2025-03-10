package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.item.custom.TestHelmetItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TestHelmetModel extends GeoModel<TestHelmetItem> {
    @Override
    public ResourceLocation getModelResource(TestHelmetItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "geo/test_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TestHelmetItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "textures/armor/test_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TestHelmetItem animatable) {
        return new ResourceLocation(Galaxia.MOD_ID, "animations/test_helmet.animation.json");
    }
}
