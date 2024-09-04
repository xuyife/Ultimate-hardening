package cool.js.xuyifei.item;

import cool.js.xuyifei.UltimateHardening;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HARDENED_MATERIAL = registerItems("hardened_material", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(UltimateHardening.MOD_ID, id), item);
    }
    public static void registerModItems(){
        UltimateHardening.LOGGER.info("UltimateHardening[终极硬化]：注册物品");
    }
}
