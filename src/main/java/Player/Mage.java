package Player;

import Interfaces.IDefend;
import Interfaces.ISpell;

public abstract class Mage extends Player implements ISpell {

    IDefend buddy;
    ISpell spell;

    public Mage(String name, int health, IDefend buddy, ISpell spell) {
        super(name, health);
        this.buddy = buddy;
        this.spell = spell;
    }

    public IDefend getBuddy() {
        return buddy;
    }

    public void setBuddy(IDefend buddy) {
        this.buddy = buddy;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public int cast(){
        return spell.cast();
    }

    public int defend(){
        return buddy.defend();
    }

}
