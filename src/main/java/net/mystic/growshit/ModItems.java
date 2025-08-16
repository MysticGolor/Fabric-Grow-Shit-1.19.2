package net.mystic.growshit;

import net.minecraft.util.Identifier;
import net.mystic.growshit.GrowShit;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ModItems {



    private static Item registerItem(String name, Item item){
        return null;
        //Registry.register(Registry.ITEM, new Identifier(GrowShit.MOD_ID, name), item);
    }

    public static void registerModItems(){
        GrowShit.LOGGER.debug("Register Mod Items for " + GrowShit.MOD_ID);
    }
}
