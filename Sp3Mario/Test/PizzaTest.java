import static org.junit.Assert.*;

public class PizzaTest {

    @org.junit.Test
    public void testToString() {
        //1,57,Vesuvio

        Pizza pizza = new Pizza (1, 57, "Vesuvio");
        int expected = 34;
        int actual = pizza.toString().length();
        assertEquals(expected,actual);

    }

}
