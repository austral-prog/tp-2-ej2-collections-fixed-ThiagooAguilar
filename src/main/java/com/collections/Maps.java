package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        //Implementa la función create_inventory que crea un "inventario" a partir de una lista de artículos. Debe devolver un dict que contenga cada nombre de artículo emparejado con su cantidad respectiva.
        Map<String, Integer> inventory = new HashMap<>();
        for (int i = 0; i < items.size(); i++) {
            if (inventory.containsKey(items.get(i))) {
                inventory.put(items.get(i), inventory.get(items.get(i)) + 1);
            }else{
                inventory.put(items.get(i), 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // Implementa la función add_items que agrega una lista de artículos a un inventario:
        for (int i = 0; i < items.size(); i++) {
            if (inventory.containsKey(items.get(i))) {
                inventory.put(items.get(i), inventory.get(items.get(i)) + 1);
            }else {
                inventory.put(items.get(i), 1);
            }

        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentValue = inventory.get(item);
                if (currentValue > 0) {
                    inventory.put(item, currentValue - 1);
                }
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            Integer count = entry.getValue();
            if (count > 0) {
                list.add(entry);
            }
        }

        return list;
    }
}
