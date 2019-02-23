import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Axe doubler;

    @Before
    public void before(){
        axe = new Axe(12);
        doubler = new Axe(20);

        dwarf = new Dwarf("Jonsi", 20, axe);
    }

    @Test
    public void canGetName(){
        assertEquals("Jonsi", dwarf.getName());
    }

    @Test
    public void canSetName(){
        dwarf.setName("Thorin");
        assertEquals("Thorin", dwarf.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, dwarf.getHealth());
    }

    @Test
    public void canSetHealth(){
        dwarf.setHealth(30);
        assertEquals(30, dwarf.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        dwarf.setWeapon(doubler);
        assertEquals(doubler, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        assertEquals(12, dwarf.attack());
    }

}
