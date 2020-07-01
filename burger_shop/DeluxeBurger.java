package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private String name;
    private double price = 10.00;
    private Meat meat;
    private Bread bread;
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public static final DeluxeBurger deluxe = new DeluxeBurger("Deluxe Burger", Meat.steak, Bread.brioche);

    DeluxeBurger(String name, Meat meat, Bread bread){
        super(name, meat, bread);
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public boolean addTopping(Topping newTopping){
        if (toppings.size() < 6) {
            if(toppings.size() > 0) {
                for (int i = 0; i < toppings.size(); i++) {
                    if (toppings.contains(newTopping)) {
                        System.out.println("Topping already added");
                        return false;
                    } else {
                        toppings.add(newTopping);
                        return true;
                    }
                }
            } else {
                toppings.add(newTopping);
                return true;
            }
        }
        else{
            System.out.println("Max toppings already added.");
            return false;
        }
        return false;
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
