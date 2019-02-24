import HealingItems.HealingPotion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HealingPotionTest {

    HealingPotion potion;

    @Before
    public void before(){
        potion = new HealingPotion(12);
    }


    @Test
    public void canGetHealingAmount(){
        assertEquals(12, potion.getHealingAmount());
    }

    @Test
    public void canSetHealingAmount(){
        potion.setHealingAmount(21);
        assertEquals(21, potion.getHealingAmount());
    }

    @Test
    public void canHeal(){
        assertEquals(12, potion.heal());
    }

}
