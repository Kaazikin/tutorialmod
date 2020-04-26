package com.github.kaazikin.tutorialmod.init;

import com.github.kaazikin.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TutorialMod.MODID);

    public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(3)));

    public static final RegistryObject<Block> JENKAAZ_BLOCK = BLOCKS.register("jenkaaz_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).slipperiness((float) 0.1).lightValue(5)));


}
