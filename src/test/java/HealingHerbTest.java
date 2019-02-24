import HealingItems.HealingHerb;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HealingHerbTest {

    HealingHerb herb;

    @Before
    public void before(){
        herb = new HealingHerb(12);
    }


    @Test
    public void canGetHealingAmount(){
        assertEquals(12, herb.getHealingAmount());
    }

    @Test
    public void canSetHealingAmount(){
        herb.setHealingAmount(21);
        assertEquals(21, herb.getHealingAmount());
    }

    @Test
    public void canHeal(){
        assertEquals(12, herb.heal());
    }

}
