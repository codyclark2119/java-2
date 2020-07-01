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

    public boolean addTopping(Topping newTopping){
        if (toppings.size() < 4) {
            if(newTopping.getHealth() == true){
                if(toppings.size() > 0) {
                    if (toppings.contains(newTopping)) {
                        System.out.println("Topping already added");
                        return false;
                    } else {
                        toppings.add(newTopping);
                        return true;
                    }
                } else {
                    toppings.add(newTopping);
                    return true;
                }
            } else{
                System.out.println("Topping does not match this burger.");
                return false;
            }

        }
        else{
            System.out.println("Max toppings already added.");
            return false;
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
