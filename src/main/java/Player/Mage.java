package Player;

import Interfaces.IDefend;

public abstract class Mage extends Player {

    IDefend buddy;

    public Mage(String name, int health, IDefend buddy) {
        super(name, health);
        this.buddy = buddy;
    }

    public int defend(){
        buddy.defend();
    }

}
