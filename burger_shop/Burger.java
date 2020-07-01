package burger_shop;
import java.util.ArrayList;
public class Burger {
    private String name;
    private double price = 6.00;
    private Meat meat;
    private Bread bread;
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public static final Burger value = new Burger("Value Burger", Meat.groundBeef, Bread.white);

    Burger(String name, Meat meat, Bread bread){
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public boolean addTopping(Topping newTopping){
        if (toppings.size() < 4) {
            if(toppings.size() > 0){
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

    public double totalBurgerPrice(){
        for (int j = 0; j < toppings.size(); j++) {
            price += toppings.get(j).getPrice();
        }
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        String customerBurger = "Plain Burger:\nBun: " + this.bread.getName() + "\nMeat: " + this.meat.getName() + "\nToppings: ";
        for (int k = 0; k < toppings.size(); k++) {
            customerBurger += toppings.get(k).getName();
            customerBurger += "\n";
        }
        return customerBurger;
    }
}
