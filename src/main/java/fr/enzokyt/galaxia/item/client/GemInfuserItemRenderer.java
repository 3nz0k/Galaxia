package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.item.custom.GemInfuserItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GemInfuserItemRenderer extends GeoItemRenderer<GemInfuserItem> {
    public GemInfuserItemRenderer() {
        super(new GemInfuserItemModel());
    }
}
