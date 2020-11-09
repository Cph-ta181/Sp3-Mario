//@Mathias
import java.util.List;
import java.util.GregorianCalendar;


public class Bestilling {
    private  List<Pizza> pizzas;
    private  GregorianCalendar datetime;
    private  Boolean paid;

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public GregorianCalendar getDatetime() {
        return datetime;
    }

    public Boolean getPaid() {
        return paid;
    }

    public int totalPrice(){
       int totalPrice = 0;
       for (Pizza pizza:pizzas) {
            totalPrice+=pizza.getPrice();

       }

        return totalPrice;
    }


   public void addPizza(Pizza pizzaToAdd){
       pizzas.add(pizzaToAdd);
   }

   public void removePizza(Pizza pizzaToRemove){

        pizzas.remove(pizzaToRemove);
   }

    @Override
    public String toString() {
        return "Bestilling{" + "pizzas=" + pizzas + ", datetime=" + datetime + ", paid=" + paid +
                '}';
    }
}


