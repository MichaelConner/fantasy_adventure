package Player;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends Mage {


    public Warlock(String name, int health, IDefend buddy, ISpell spell) {
        super(name, health, buddy, spell);
    }

}
