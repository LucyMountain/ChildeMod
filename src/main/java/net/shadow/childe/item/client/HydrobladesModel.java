package net.shadow.childe.item.client;

import net.minecraft.util.Identifier;
import net.shadow.childe.ChildeMod;
import net.shadow.childe.item.custom.Hydroblades;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HydrobladesModel extends AnimatedGeoModel<Hydroblades> {
    @Override
    public Identifier getModelResource(Hydroblades object) {
        return new Identifier(ChildeMod.MOD_ID, "geo/hydroblades.geo.json");
    }

    @Override
    public Identifier getTextureResource(Hydroblades object) {
        return new Identifier(ChildeMod.MOD_ID, "textures/item/hydroblades.png");
    }

    @Override
    public Identifier getAnimationResource(Hydroblades animatable) {
        return new Identifier(ChildeMod.MOD_ID, "animations/hydroblades.animation.json");
    }
}
