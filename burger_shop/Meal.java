package burger_shop;
import java.util.ArrayList;
public class Meal {
    private Side side;
    private Burger burger;
    private Drink drink;
    private double price;

    private ArrayList<Side> sides = new ArrayList<Side>();

    public static final Meal valueMeal = new Meal(Side.fries, Burger.value, Drink.coke, 7.00);

    private Meal(Side side, Burger burger, Drink drink, double price) {
        this.side = side;
        this.burger = burger;
        this.drink = drink;
        this.price = price;
    }

    public Side getSide() {
        return side;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public void addSide(Side side) {
        if (sides.size() < 3) {
            sides.add(side);
        } else {
            System.out.println("Already added max amount of sides.");
        }
    }

    @Override
    public String toString() {
        String meal = "Value Meal:\nPrice: $" + price + "\nSides: " + side.getName() + "\n";

        for (Side s : sides) {
            meal += s.getName();
            meal += ", ";
        }

        meal += "Burger: " + this.burger.toString() + "Drink: " + drink.getName();

        return meal;
    }
}
