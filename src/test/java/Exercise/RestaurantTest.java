package Exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RestaurantTest {
    private Restaurant restaurant;

    @Before
    public void setup() {
        restaurant = new Restaurant("Sweet stuff");
    }

    @Test
    public void makeAllCooksPrintPreparationsToConsole(){
        Cook alice = new Cook("Alice", new SimplePreparationStrategy());
        Cook george = new Cook ("George", new SoccerPreparationStrategy());
        restaurant.addCook(alice);
        restaurant.addCook(george);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        restaurant.prepareCooks();
        String expectedOutput = "Alice has the simple preparation:  put an apron on\nGeorge has the soccer preparation:  open a beer and hum the anthem of favourite soccer team\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}