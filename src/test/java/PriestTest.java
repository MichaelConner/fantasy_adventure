import HealingItems.HealingHerb;
import Player.Priest;
import HealingItems.HealingPotion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PriestTest {

    Priest priest;
    HealingPotion potion;
    HealingHerb redHerb;

    @Before
    public void before(){
        potion = new HealingPotion(12);
        redHerb = new HealingHerb(20);

        priest = new Priest("Anduin", 20, potion);
    }

    @Test
    public void canGetName(){
        assertEquals("Anduin", priest.getName());
    }

    @Test
    public void canSetName(){
        priest.setName("tyrande");
        assertEquals("tyrande", priest.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, priest.getHealth());
    }

    @Test
    public void canSetHealth(){
        priest.setHealth(30);
        assertEquals(30, priest.getHealth());
    }

    @Test
    public void canGetHealingItem(){
        assertEquals(potion, priest.getHealingItem());
    }

    @Test
    public void canSetHealingItem(){
        priest.setHealingItem(redHerb);
        assertEquals(redHerb, priest.getHealingItem());
    }

    @Test
    public void canHeal(){
        assertEquals(12, priest.heal());
    }

}

