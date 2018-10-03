package Exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SimplePreparationStrategyTest {
    private PreparationStrategy strategy;

    @Before
    public void setup() {
        strategy = new SimplePreparationStrategy();
    }

    @Test
    public void getName() {
        assertEquals(strategy.getName(), "simple preparation");
    }

    @Test
    public void execute() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        strategy.execute();
        String expectedOutput = "put an apron on";
        assertEquals(expectedOutput, outContent.toString());
    }
}