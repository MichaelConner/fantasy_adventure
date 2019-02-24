import Player.Warlock;
import Sidekicks.Dragon;
import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WarlockTest {

    Warlock warlock;
    Fireball fireball;
    Fireball blastwave;
    Dragon dragon;
    Dragon draco;

    @Before
    public void before(){
        fireball = new Fireball(12);
        blastwave = new Fireball(20);
        dragon = new Dragon(3);
        draco = new Dragon(4);

        warlock = new Warlock("Andy Warlock", 20, dragon, fireball);
    }

    @Test
    public void canGetName(){
        assertEquals("Andy Warlock", warlock.getName());
    }

    @Test
    public void canSetName(){
        warlock.setName("Adam Warlock");
        assertEquals("Adam Warlock", warlock.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, warlock.getHealth());
    }

    @Test
    public void canSetHealth(){
        warlock.setHealth(30);
        assertEquals(30, warlock.getHealth());
    }

    @Test
    public void canGetBuddy(){
        assertEquals(dragon, warlock.getBuddy());
    }

    @Test
    public void canSetBuddy(){
        warlock.setBuddy(draco);
        assertEquals(draco, warlock.getBuddy());
    }

    @Test
    public void canGetSpell(){
        assertEquals(fireball, warlock.getSpell());
    }

    @Test
    public void canSetSpell(){
        warlock.setSpell(blastwave);
        assertEquals(blastwave, warlock.getSpell());
    }

    @Test
    public void canCastSpell(){
        assertEquals(12, warlock.cast());
    }

}
