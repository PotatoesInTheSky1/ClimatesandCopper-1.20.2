package net.pots.climatesandcopper.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pots.climatesandcopper.ClimatesandCopper;

public class ModItems {
    public  static  final  Item  FROST_SPIDER_EYE = registerItem("frost_spider_eye", new Item(new FabricItemSettings()));
    public  static  final  Item  BURNT_GUNPOWDER = registerItem("burnt_gunpowder", new Item(new FabricItemSettings()));
    public static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FROST_SPIDER_EYE);
        entries.add(BURNT_GUNPOWDER);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ClimatesandCopper.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ClimatesandCopper.LOGGER.info("Registering Mod Items for" + ClimatesandCopper.MOD_ID );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}

