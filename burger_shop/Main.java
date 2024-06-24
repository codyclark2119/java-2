package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(HealthBurger.health, Bread.brioche, Meat.steak);
        ArrayList<Topping> exToppings = new ArrayList<>(Arrays.asList(Topping.Jalapenos, Topping.Bacon, Topping.Cheese));
        ArrayList<Side> exSides = new ArrayList<>(Arrays.asList(Side.fries, Side.friedMushrooms));
        order1.addToppings(exToppings);
        order1.addDrink(Drink.sprite);
        order1.addSides(exSides);
        Order order2 = new Order(Meal.valueMeal);
        System.out.println(order1.toString());
        System.out.println(order2.toString());
    }
}
