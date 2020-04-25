package com.github.kaazikin.tutorialmod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@Mod(TutorialMod.MODID)
public final class TutorialMod {

    public static final String MODID = "tutorialmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public TutorialMod(){
        LOGGER.debug("Hello from Tutorial Mod!");
    }
}
