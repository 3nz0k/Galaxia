package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.item.custom.GalaxiumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GalaxiumArmorRenderer extends GeoArmorRenderer<GalaxiumArmorItem> {

    public GalaxiumArmorRenderer() {
        super(new GalaxiumArmorModel());
    }
}
