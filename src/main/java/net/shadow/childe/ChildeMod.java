package net.shadow.childe;

import net.fabricmc.api.ModInitializer;
import net.shadow.childe.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class ChildeMod implements ModInitializer {

    public static final String MOD_ID = "childe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        GeckoLib.initialize();
    }
}