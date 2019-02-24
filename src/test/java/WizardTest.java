import Player.Wizard;
import Sidekicks.Dragon;
import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WizardTest {

    Wizard wizard;
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

        wizard = new Wizard("Gandalf", 20, dragon, fireball);
    }

    @Test
    public void canGetName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canSetName(){
        wizard.setName("Saruman");
        assertEquals("Saruman", wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, wizard.getHealth());
    }

    @Test
    public void canSetHealth(){
        wizard.setHealth(30);
        assertEquals(30, wizard.getHealth());
    }

    @Test
    public void canGetBuddy(){
        assertEquals(dragon, wizard.getBuddy());
    }

    @Test
    public void canSetBuddy(){
        wizard.setBuddy(draco);
        assertEquals(draco, wizard.getBuddy());
    }

    @Test
    public void canGetSpell(){
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void canSetSpell(){
        wizard.setSpell(blastwave);
        assertEquals(blastwave, wizard.getSpell());
    }

    @Test
    public void canHaveBuddyDefend(){
        assertEquals(3, wizard.defend());
    }

    @Test
    public void canCastSpell(){
        assertEquals(12, wizard.cast());
    }

}
