import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(12);
    }


    @Test
    public void canGetDamage(){
        assertEquals(12, sword.getDamage());
    }

    @Test
    public void canSetDamage(){
        sword.setDamage(21);
        assertEquals(21, sword.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(12, sword.attack());
    }

}
