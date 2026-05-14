package blenderscomplex.jar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.minecraft.client.util.ModelIdentifier;

public class BlendersComplexClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerModelProvider((resources, out) -> out.accept(new ModelIdentifier("blenderscomplex", "flashlight_inhand", "inventory")));

    }
}
