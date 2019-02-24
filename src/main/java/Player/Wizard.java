package Player;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Wizard extends Mage {

    public Wizard(String name, int health, IDefend buddy, ISpell spell) {
        super(name, health, buddy, spell);
    }

}
