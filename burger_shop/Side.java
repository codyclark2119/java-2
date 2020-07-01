package burger_shop;

public class Side {
    private String name;
    private double price;

    private Side(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public static final Side fries = new Side("French Fries", 1.50 );
    public static final Side onionRings = new Side("Onion Rings", 2.50 );
    public static final Side friedMushrooms = new Side("Fried Mushrooms", 2.75);

}
