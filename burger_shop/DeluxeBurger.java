package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger {
    private String name;
    private double price = 10.00;
    private Meat meat;
    private Bread bread;
    private ArrayList<Topping> toppings = new Arraylist<>();

    public static final DeluxeBurger deluxe = new DeluxeBurger("Deluxe Burger", Meat.steak, Bread.brioche);

    DeluxeBurger(String name, Meat meat, Bread bread){
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Topping newTopping){
        if (toppings.size() < 6) {
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

    public double totalBurgerPrice(){
        for (int j = 0; j < toppings.size(); j++) {
            price += toppings.get(i).getPrice();
        }
        return price;
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
