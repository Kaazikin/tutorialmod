package com.github.kaazikin.tutorialmod;

import com.github.kaazikin.tutorialmod.init.ModBlocks;
import com.github.kaazikin.tutorialmod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@Mod(TutorialMod.MODID)
public final class TutorialMod {

    public static final String MODID = "tutorialmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public TutorialMod(){
        LOGGER.debug("Hello from Tutorial Mod!");
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
