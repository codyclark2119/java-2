package burger_shop;

public class Drink {
    private String name;

    public static final Drink water = new Drink("Water");
    public static final Drink pepsi = new Drink("Pepsi");
    public static final Drink sprite = new Drink("Sprite");
    public static final Drink coke = new Drink("Coke");

    private Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
