package blenderscomplex.jar.block;

import blenderscomplex.jar.BlendersComplex;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COMPLEX_CARPET = registerBlock("complex_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).slipperiness(0.9999999f).strength(-10000000f).sounds(BlockSoundGroup.WOOL)));
    public static final Block COMPLEX_WALL = registerBlock("complex_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(-10000000f).sounds(BlockSoundGroup.WOOD)));
    public static final Block COMPLEX_CEILING = registerBlock("complex_ceiling",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(-10000000f).sounds(BlockSoundGroup.LODESTONE)));
    public static final Block COMPLEX_LIGHT = registerBlock("complex_light",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(-10000000f).sounds(BlockSoundGroup.GLASS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlendersComplex.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlendersComplex.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
    }
}
