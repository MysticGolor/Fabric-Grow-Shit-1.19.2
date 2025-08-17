package net.mystic.growshit;

import net.fabricmc.api.ModInitializer;
import net.mystic.growshit.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class GrowShit implements ModInitializer {
    public static final String MOD_ID = "growshit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();

    }
}