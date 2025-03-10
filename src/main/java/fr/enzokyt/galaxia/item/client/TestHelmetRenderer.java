package fr.enzokyt.galaxia.item.client;

import fr.enzokyt.galaxia.item.custom.TestHelmetItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TestHelmetRenderer extends GeoArmorRenderer<TestHelmetItem> {
    public TestHelmetRenderer() {
        super(new TestHelmetModel());
    }
}
