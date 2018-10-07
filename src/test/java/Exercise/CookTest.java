package Exercise;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import java.io.*;

public class CookTest {
    private Cook a;

    @Before
    public void setup() {
        a = new Cook("Carla", PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE));
    }

    @Test
    public void shouldReturnSimplePreparationType(){
        assertTrue(a.getPreparation() instanceof SimplePreparationStrategy);
    }

    @Test
    public void setPreparationShouldChangePreparation(){
        a.setPreparation(new HardrockPreparationStrategy());
        assertTrue(a.getPreparation() instanceof HardrockPreparationStrategy);
    }

    @Test
    public void shouldReturnSoccerPreparationType(){
        a.setPreparation(new SoccerPreparationStrategy());
        assertFalse(a.getPreparation() instanceof SimplePreparationStrategy);
    }

    @Test
    public void cookShouldPrintSoccerPreparationToConsole(){
        Cook b = new Cook("Bianca", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        b.prepare();
        String expectedOutput = "Bianca has the soccer preparation:  open a beer and hum the anthem of favourite soccer team\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookShouldPrintSimplePreparationToConsole(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        a.prepare();
        String expectedOutput = "Carla has the simple preparation:  put an apron on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookShouldPrintHardrockPreparationToConsole(){
        Cook c = new Cook("Lois", PreparationFactory.getPreparationStrategy(PreparationType.HARDROCK));
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        c.prepare();
        String expectedOutput = "Lois has the hardrock preparation:  take a collection of knifes and set some hardrock music on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookShouldPrintMeditationPreparationToConsole(){
        Cook c = new Cook("Harley", PreparationFactory.getPreparationStrategy(PreparationType.MEDITATION));
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        c.prepare();
        String expectedOutput = "Harley has the meditation preparation:  5 minutes of mindfulness and a short breathing exercise\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookSetsPreparationToNull(){
        a.setPreparation(null);
        assertNull(a.getPreparation());
    }

}