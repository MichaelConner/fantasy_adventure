import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class KnightTest {

    Knight knight;
    Sword sword;
    Sword broadsword;

    @Before
    public void before(){
        sword = new Sword(12);
        broadsword = new Sword(20);

        knight = new Knight("The creepy old guy from the end of Indiana Jones", 20, sword);
    }

    @Test
    public void canGetName(){
        assertEquals("The creepy old guy from the end of Indiana Jones", knight.getName());
    }

    @Test
    public void canSetName(){
        knight.setName("King Arthur");
        assertEquals("King Arthur", knight.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, knight.getHealth());
    }

    @Test
    public void canSetHealth(){
        knight.setHealth(30);
        assertEquals(30, knight.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        knight.setWeapon(broadsword);
        assertEquals(broadsword, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        assertEquals(12, knight.attack());
    }

}
