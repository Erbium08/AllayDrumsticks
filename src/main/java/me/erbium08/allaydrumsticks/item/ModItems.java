package me.erbium08.allaydrumsticks.item;

import com.mojang.datafixers.TypeRewriteRule;
import me.erbium08.allaydrumsticks.Allaydrumsticks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ALLAY_DRUMSTICK = registerItem("allay_drumstick", new Item(new Item.Settings().food(ModFoodComponents.ALLAY_DRUMSTICK)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Allaydrumsticks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Allaydrumsticks.LOGGER.info("registering mod items for: " + Allaydrumsticks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ALLAY_DRUMSTICK);
        });
    }
}
