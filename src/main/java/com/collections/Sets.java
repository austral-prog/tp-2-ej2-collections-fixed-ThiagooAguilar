package com.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    //mplementa la función check_drinks que tome el nombre de una bebida y una lista de ingredientes. La función debería devolver el nombre de la bebida seguido de "Mocktail" si la bebida no tiene ingredientes alcohólicos, y el nombre de la bebida seguido de "Cocktail" si la bebida incluye alcohol. Para los propósitos de este ejercicio, los cócteles solo incluirán alcoholes del set ALCOHOLS en sets_categories_data.py:
    public static String checkDrinks(String drink, List<String> ingredients) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ALCOHOLS.contains(ingredients.get(i))){
                return String.format("%s Cocktail", drink);
            }
        }
        return String.format("%s Mocktail", drink);
    }

}
