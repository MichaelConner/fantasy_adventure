import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(12);
    }

    @Test
    public void canGetHealth(){
        assertEquals(12, orc.getHealth());
    }

    @Test
    public void canSetHealth(){
        orc.setHealth(21);
        assertEquals(21, orc.getHealth());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(11);
        assertEquals(1, orc.getHealth());
    }

    @Test
    public void canTakeDamageFull(){
        orc.takeDamage(12);
        assertEquals(0, orc.getHealth());
    }

    @Test
    public void canTakeDamageOverkill(){
        orc.takeDamage(13);
        assertEquals(0, orc.getHealth());
    }

}
