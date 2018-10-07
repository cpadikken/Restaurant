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
        Cook alice = new Cook("Alice", PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE));
        Cook george = new Cook ("George", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));
        restaurant.addCook(alice);
        restaurant.addCook(george);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        restaurant.prepareCooks();
        String expectedOutput = "Alice has the simple preparation:  put an apron on\nGeorge has the soccer preparation:  open a beer and hum the anthem of favourite soccer team\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void removesAllCooksFromArrayList(){
        Cook alice = new Cook("Alice", PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE));
        Cook george = new Cook ("George", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));
        Cook annie = new Cook ("Annie", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));
        restaurant.addCook(alice);
        restaurant.addCook(george);
        restaurant.addCook(annie);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        restaurant.removeAllCooksWithPreparationType("soccer preparation");
        restaurant.prepareCooks();
        String expectedOutput = "Alice has the simple preparation:  put an apron on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testReplaceExistingCookWithNewCook(){
        Cook alice = new Cook("Alice", PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE));
        restaurant.addCook(alice);
        restaurant.replaceExistingCookWithNewCook(alice, "Chip");
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        restaurant.prepareCooks();
        String expectedOutput = "Chip has the simple preparation:  put an apron on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}