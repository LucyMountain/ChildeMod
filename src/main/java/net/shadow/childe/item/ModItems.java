package net.shadow.childe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shadow.childe.ChildeMod;
import net.shadow.childe.item.custom.Hydroblades;


public class ModItems {

    public static final  Item CHILDE_MASK = registerItem("childe_mask",
            new Item(new FabricItemSettings().group(ModItemGroup.CHILDE)));
    public static final  Item HYDROBLADES = registerItem("hydroblades",
            new Hydroblades(new FabricItemSettings().group(ModItemGroup.CHILDE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChildeMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ChildeMod.LOGGER.debug("Registering Mod Items for "+ ChildeMod.MOD_ID);
    }
}
