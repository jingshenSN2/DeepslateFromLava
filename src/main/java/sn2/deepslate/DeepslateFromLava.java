package sn2.deepslate;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepslateFromLava implements ModInitializer {

    public static final String MOD_ID = "deepslate_from_lava";
    public static final Identifier IDENTIFIER = new Identifier(MOD_ID);

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Let's make deepslate!");
    }

}

