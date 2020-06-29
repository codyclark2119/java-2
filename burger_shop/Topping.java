package burger_shop;

public class Topping {
    private String name;
    private double price;
    private boolean isHealthy;

    private Topping(String name, double price, boolean isHealthy){
        this.name = name;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean getHealth(){
        return isHealthy;
    }

    public static final Topping Cheese = new Topping("Cheese", 0.75, false);
    public static final Topping Pickles = new Topping("Pickles", 0.50, true);
    public static final Topping Jalapenos = new Topping("Jalapenos", 0.50, true);
    public static final Topping Bacon = new Topping("Bacon", 1.00, false);
    public static final Topping Onions = new Topping("Grilled Onion", 1.00, true);
}
