package net.mystic.growshit;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item UNCURED_BUD = registerItem("uncured_bud",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CURED_BUD = registerItem("cured_bud",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(GrowShit.MOD_ID, name), item);
    }

    public static void registerModItems(){
        GrowShit.LOGGER.debug("Register Mod Items for " + GrowShit.MOD_ID);
    }
}
