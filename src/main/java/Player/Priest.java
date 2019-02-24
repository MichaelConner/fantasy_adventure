package Player;

import Interfaces.IHeal;

public class Priest extends Cleric {

    public Priest(String name, int health, IHeal healingItem) {
        super(name, health, healingItem);
    }

}
