import Sidekicks.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {


    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(4);
    }


    @Test
    public void canGetStrength(){
        assertEquals(4, dragon.getStrength());
    }

    @Test
    public void canSetStrength(){
        dragon.setStrength(5);
        assertEquals(5, dragon.getStrength());
    }

    @Test
    public void canDefend(){
        assertEquals(4, dragon.defend());
    }



}
