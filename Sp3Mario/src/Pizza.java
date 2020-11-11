//@Sania

import java.io.Serializable;

public class Pizza implements Serializable {


    private String pizzaName;
    private int number;
    private int price;

    public Pizza(String pizzaName, int number, int price) {
        this.pizzaName = pizzaName;
        this.number = number;
        this.price = price;
    }

    public String getPizzaName() {

        return pizzaName;
    }

    public int getNumber() {

        return number;
    }


    public int getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizzaName + " Nr: " + number + " Pris: " + price;
    }

}