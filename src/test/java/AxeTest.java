import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe(12);
    }


    @Test
    public void canGetDamage(){
        assertEquals(12, axe.getDamage());
    }

    @Test
    public void canSetDamage(){
        axe.setDamage(21);
        assertEquals(21, axe.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(12, axe.getDamage());
    }

}