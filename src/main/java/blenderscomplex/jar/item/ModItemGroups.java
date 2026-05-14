package blenderscomplex.jar.item;

import blenderscomplex.jar.BlendersComplex;
import blenderscomplex.jar.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class ModItemGroups {
    public static final ItemGroup BLENDERSCOMPLEX_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlendersComplex.MOD_ID, "blenders-complex"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blenderscomplex"))
                    .icon(() -> new ItemStack(ModItems.GROUPICON)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FLASHLIGHT);
                        entries.add(ModBlocks.COMPLEX_CARPET);

                    }).build());



    public static void registerItemGroups() {

    }
}
