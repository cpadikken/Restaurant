package Exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class PreparationFactoryTest {

    @Test
    public void returnsSimplePreparationStrategy(){
        assertTrue(PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE) instanceof SimplePreparationStrategy);
    }

}