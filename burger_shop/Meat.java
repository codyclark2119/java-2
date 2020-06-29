package burger_shop;

public class Meat {
    private String name;

    public static final Meat groundBeef = new Meat("Ground Beef");
    public static final Meat steak = new Meat("Steak");
    public static final Meat blackBean = new Meat("Black Bean");
    public static final Meat turkey = new Meat("Turkey");

    private Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
