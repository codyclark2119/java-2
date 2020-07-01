package burger_shop;

import java.util.ArrayList;

public class Order {
    private ArrayList<Side> sides = new ArrayList<>();
    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Drink drink;
    private Meal meal = null;
    private double price;

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }
    public Order(Meal meal){
        this.meal = meal;
    }

    public void addToppings(ArrayList<Topping> toppings){
        for(int i = 0; i < toppings.size(); i++){
            if(this.burger.addTopping(toppings.get(i))){
                System.out.println("Topping " + toppings.get(i).getName() + " added");
            }
        }
    }

    public void addSides(ArrayList<Side> newSides){
        if(sides.size() < 3){
            for(int j = 0; j < newSides.size(); j++){
                if(sides.contains(newSides.get(j))){
                    System.out.println("Side already added to order");
                } else {
                    sides.add(newSides.get(j));
                    System.out.println("Side " + newSides.get(j).getName() + " added");
                }
            }
        } else {
            System.out.println("Max sides already added");
        }
    }

    public void addBurger(Burger newBurger){
        this.burger = newBurger;
    }

    public void addDrink(Drink newDrink){
        this.drink = newDrink;
    }

    public double purchaseOrder(){
        if(this.meal != null){
            price += this.meal.getPrice();
        } else{
            price += this.burger.totalBurgerPrice();
            for(int j = 0; j < sides.size(); j++){
                price += sides.get(j).getPrice();
            }
        }
        return price;
    }

    public String toString(){
        if (this.meal == null){
            String order = "Price: $" +  purchaseOrder() + "\n" +  this.burger.getName() + "\nBun: " + this.bread.getName() + "\nMeat: " + this.meat.getName() + "\nSides:\n";
            for(int k = 0; k < sides.size(); k++){
                order += sides.get(k).getName();
                order += "\n";
            }
            order += "Drink: " + this.drink.getName();
            return order;
        } else {
            return this.meal.toString();
        }
    }
}
