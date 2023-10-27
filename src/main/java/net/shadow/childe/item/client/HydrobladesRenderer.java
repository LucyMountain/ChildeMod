package net.shadow.childe.item.client;

import net.shadow.childe.item.custom.Hydroblades;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HydrobladesRenderer extends GeoItemRenderer<Hydroblades> {
    public HydrobladesRenderer() {
        super(new HydrobladesModel());
    }
}
