package Exercise;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import java.io.*;

public class CookTest {

    @Before
    public void setup() {
        Cook a = new Cook("Carla", new SimplePreparationStrategy());
    }

    @Test
    public void setPreparationShouldSwapPreparation(){
        Cook b = new Cook("Benny", new SimplePreparationStrategy());
        b.setPreparation(new HardrockPreparationStrategy());
        assertTrue(b.getPreparation() instanceof HardrockPreparationStrategy);
    }

    @Test
    public void shouldReturnSimplePreparationType(){
        Cook c = new Cook("Hammond", new SimplePreparationStrategy());
        Cook d = new Cook("Egmond", new SoccerPreparationStrategy());
        assertTrue(c.getPreparation() instanceof SimplePreparationStrategy);
    }

    @Test
    public void shouldReturnSoccerPreparationType(){
        Cook c = new Cook("Hammond", new SimplePreparationStrategy());
        Cook d = new Cook("Egmond", new SoccerPreparationStrategy());
        assertFalse(d.getPreparation() instanceof SimplePreparationStrategy);
    }

    @Test
    public void cookShouldPrintSoccerPreparationToConsole(){
        Cook e = new Cook("Bianca", new SoccerPreparationStrategy());
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        e.prepare();
        String expectedOutput = "Bianca has the soccer preparation:  open a beer and hum the anthem of favourite soccer team\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookShouldPrintSimplePreparationToConsole(){
        Cook f = new Cook("Brenda", new SimplePreparationStrategy());
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        f.prepare();
        String expectedOutput = "Brenda has the simple preparation:  put an apron on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void cookShouldPrintHardrockPreparationToConsole(){
        Cook g = new Cook("Lois", new HardrockPreparationStrategy());
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        g.prepare();
        String expectedOutput = "Lois has the hardrock preparation:  take a collection of knifes and set some hardrock music on\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}