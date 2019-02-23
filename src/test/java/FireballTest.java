import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FireballTest {

    Fireball fireball;

    @Before
    public void before(){
        fireball = new Fireball(12);
    }


    @Test
    public void canGetDamage(){
        assertEquals(12, fireball.getDamage());
    }

    @Test
    public void canSetDamage(){
        fireball.setDamage(21);
        assertEquals(21, fireball.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(12, fireball.getDamage());
    }

}