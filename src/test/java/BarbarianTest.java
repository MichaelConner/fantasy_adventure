import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Barbarian barbarian;
    Sword sword;
    Sword claymore;

    @Before
    public void before(){
        sword = new Sword(12);
        claymore = new Sword(20);

        barbarian = new Barbarian("Clargon The Terrible", 20, sword);
    }

    @Test
    public void canGetName(){
        assertEquals("Clargon The Terrible", barbarian.getName());
    }

    @Test
    public void canSetName(){
        barbarian.setName("Conan The Barbarian");
        assertEquals("Conan The Barbarian", barbarian.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, barbarian.getHealth());
    }

    @Test
    public void canSetHealth(){
        barbarian.setHealth(30);
        assertEquals(30, barbarian.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        barbarian.setWeapon(claymore);
        assertEquals(claymore, barbarian.getWeapon());
    }

    @Test
    public void canAttack(){
        assertEquals(12, barbarian.attack());
    }

}
