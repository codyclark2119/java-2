package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {
    private String name;
    private double price = 6.00;
    private Meat meat;
    private Bread bread;

    public static final HealthBurger health = new HealthBurger("Health Burger", Meat.blackBean, Bread.wheat);

    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    HealthBurger(String name, Meat meat, Bread bread){
        super(name, meat, bread);
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Topping newTopping){
        if (toppings.size() < 4 && newTopping.getHealth() == true) {
            for (int i = 0; i < toppings.size(); i++) {
                if (toppings.get(i).getName() == newTopping.getName()) {
                    System.out.println("Topping already added");
                } else {
                    toppings.add(newTopping);
                }
            }
        }
        else{
            System.out.println("Max toppings already added.");
        }
    }

    @Override
    public String toString() {
        String customerBurger = "Plain Burger:\nBun: " + this.bread + "\nMeat" + this.meat + "\nToppings: ";
        for (int k = 0; k < toppings.size(); k++) {
            customerBurger += toppings.get(k).getName();
            customerBurger += "\n";
        }
        return customerBurger;
    }
}
