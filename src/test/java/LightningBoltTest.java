import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LightningBoltTest {

    LightningBolt lightningBolt;

    @Before
    public void before(){
        lightningBolt = new LightningBolt(12);
    }


    @Test
    public void canGetDamage(){
        assertEquals(12, lightningBolt.getDamage());
    }

    @Test
    public void canSetDamage(){
        lightningBolt.setDamage(21);
        assertEquals(21, lightningBolt.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(12, lightningBolt.cast());
    }

}