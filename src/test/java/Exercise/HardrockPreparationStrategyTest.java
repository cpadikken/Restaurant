package Exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HardrockPreparationStrategyTest {
    private PreparationStrategy strategy;

    @Before
    public void setup() {
        strategy = new HardrockPreparationStrategy();
    }

    @Test
    public void getName() {
        assertEquals(strategy.getName(), "hardrock preparation");
    }

    @Test
    public void execute() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        strategy.execute();
        String expectedOutput = "take a collection of knifes and set some hardrock music on";
        assertEquals(expectedOutput, outContent.toString());
    }
}