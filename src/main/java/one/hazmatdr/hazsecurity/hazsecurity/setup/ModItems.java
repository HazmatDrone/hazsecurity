package one.hazmatdr.hazsecurity.hazsecurity.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final RegistryObject<Item> KEY = Registration.ITEMS.register("key", () ->
            new Item(new Item.Properties().group(ItemGroup.TOOLS)));

    public static void register() {}
}
