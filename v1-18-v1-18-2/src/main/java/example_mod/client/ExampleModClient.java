package example_mod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.example.Greeter;

@Environment(EnvType.CLIENT)
public class ExampleModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Greeter.greet();
    }
}
