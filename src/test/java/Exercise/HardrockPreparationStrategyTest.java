package Exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HardrockPreparationStrategyTest {

    @Before
    public void setup() {
        PreparationStrategy p = new HardrockPreparationStrategy();
    }

    @Test
    public void getName() {
        PreparationStrategy p = new HardrockPreparationStrategy();
        assertEquals(p.getName(), "hardrock preparation");
    }

    @Test
    public void execute() {
        PreparationStrategy p = new HardrockPreparationStrategy();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        p.execute();
        String expectedOutput = "take a collection of knifes and set some hardrock music on";
        assertEquals(expectedOutput, outContent.toString());
    }
}