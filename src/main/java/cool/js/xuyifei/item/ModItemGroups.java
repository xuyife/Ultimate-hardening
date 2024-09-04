package cool.js.xuyifei.item;

import cool.js.xuyifei.UltimateHardening;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ULTIMATEHARDENING_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(UltimateHardening.MOD_ID, "ultimatehardening_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.ultimatehardening_group"))
                    .icon(() -> new ItemStack(ModItems.HARDENED_MATERIAL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HARDENED_MATERIAL);
                    }).build());
    public static void registerModItemGroups() {
        UltimateHardening.LOGGER.info("UltimateHardening[终极硬化]：注册物品栏");
    }

}
