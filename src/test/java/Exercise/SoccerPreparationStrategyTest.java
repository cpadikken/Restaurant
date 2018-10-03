package Exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SoccerPreparationStrategyTest {
    private PreparationStrategy strategy;

    @Before
    public void setup() {
        strategy = new SoccerPreparationStrategy();
    }

    @Test
    public void getName() {
        assertEquals(strategy.getName(), "soccer preparation");
    }

    @Test
    public void execute() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        strategy.execute();
        String expectedOutput = "open a beer and hum the anthem of favourite soccer team";
        assertEquals(expectedOutput, outContent.toString());
    }
}