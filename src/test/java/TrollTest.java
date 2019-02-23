import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(12);
    }

    @Test
    public void canGetHealth(){
        assertEquals(12, troll.getHealth());
    }

    @Test
    public void canSetHealth(){
        troll.setHealth(21);
        assertEquals(21, troll.getHealth());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(11);
        assertEquals(1, troll.getHealth());
    }

    @Test
    public void canTakeDamageFull(){
        troll.takeDamage(12);
        assertEquals(0, troll.getHealth());
    }

    @Test
    public void canTakeDamageOverkill(){
        troll.takeDamage(13);
        assertEquals(0, troll.getHealth());
    }

}
