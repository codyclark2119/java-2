package burger_shop;

public class Topping {
    private String name;
    private double price;

    private Topping(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public static final Topping Cheese = new Topping("Cheese", 0.75);
    public static final Topping Pickles = new Topping("Pickles", 0.50);
    public static final Topping Jalapenos = new Topping("Jalapenos", 0.50);
    public static final Topping Bacon = new Topping("Bacon", 1.00);
    public static final Topping Onions = new Topping("Grilled Onion", 1.00);
}
