
import java.io.*;
import java.util.*;

public class PizzaBar {
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();
    private ArrayList<Bestilling> completedBestillinger = new ArrayList<>();
    private MenuKort menu;

    public PizzaBar(MenuKort menu) {
        this.menu = menu;
        this.completedBestillinger = readCompletedOrders();
    }

    public ArrayList<Bestilling> getBestillinger() {
        sortBestillinger(bestillinger);
        return bestillinger;
    }

    public MenuKort getMenu() {
        return menu;
    }

    private void sortBestillinger(ArrayList<Bestilling> arrList) {
        Collections.sort(arrList, new Comparator<Bestilling>() {
            public int compare(Bestilling b1, Bestilling b2) {
                return b1.getDatetime().compareTo(b2.getDatetime());
            }
        });
    }

    public void removeBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
        completedBestillinger.add(bestilling);
        saveCompletedOrders();
    }

    private void saveCompletedOrders() {
        try {
            FileOutputStream fop = new FileOutputStream("/resources/completedOrders.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fop);
            oos.writeObject(completedBestillinger);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Bestilling> readCompletedOrders() {
        ArrayList<Bestilling> orders = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("/resources/completedOrders.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            orders = (ArrayList<Bestilling>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public int calculateThisMonthEarnings() {
        int earnings = 0;
        sortBestillinger(completedBestillinger);

        for (int i = 0; completedBestillinger.get(i).getDatetime().get(Calendar.MONTH) == Calendar.MONTH; i++) {
            earnings += completedBestillinger.get(i).totalPrice();
        }
        return earnings;
    }


}
