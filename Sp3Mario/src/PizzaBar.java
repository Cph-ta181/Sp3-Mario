import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PizzaBar {
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();
    private MenuKort menu;

    public  PizzaBar(MenuKort menu){
        this.menu = menu;
    }

    public ArrayList<Bestilling> getBestillinger() {
        sortBestillinger();
        return bestillinger;
    }

    public MenuKort getMenu() {
        return menu;
    }

    private void sortBestillinger(){
        Collections.sort(bestillinger, new Comparator<Bestilling>() {
            public int compare(Bestilling b1, Bestilling b2) {
                return b1.getDatetime().compareTo(b2.getDatetime());
            }
        });
    }

    public int calculateLastMonthEarnings(){
        int earnings = 0;

        return earnings;
    }

    public int calcultateTodaysEarnings(){
        int earnings = 0;

        return earnings;
    }


}
