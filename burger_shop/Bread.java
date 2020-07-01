package burger_shop;

public class Bread {
    private String name;

    public static final Bread white = new Bread("White");
    public static final Bread wheat = new Bread("Wheat");
    public static final Bread brioche = new Bread("Brioche");

    private Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
