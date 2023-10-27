package net.shadow.childe.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shadow.childe.ChildeMod;

public class ModItemGroup {
    public static final ItemGroup CHILDE = FabricItemGroupBuilder.build(
            new Identifier(ChildeMod.MOD_ID, "childe_items"), () -> new ItemStack(ModItems.CHILDE_MASK)
    );
}
