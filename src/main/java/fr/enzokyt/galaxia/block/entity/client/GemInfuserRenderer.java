package fr.enzokyt.galaxia.block.entity.client;

import fr.enzokyt.galaxia.block.entity.GemInfuserEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GemInfuserRenderer extends GeoBlockRenderer<GemInfuserEntity> {
    public GemInfuserRenderer(BlockEntityRendererProvider.Context context) {
        super(new GemInfuserModel());
    }
}
