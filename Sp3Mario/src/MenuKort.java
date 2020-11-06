import java.io.File;
import java.util.List;

public class MenuKort {
    private List<Pizza> pizzas;

    public MenuKort(String filename) {
        File file = new File("/resources");

    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizza(Pizza pizzaToAdd){
        pizzas.add(pizzaToAdd);
    }

    public void removePizza(Pizza pizzaToRemove) {
        pizzas.remove(pizzaToRemove);
    }
}