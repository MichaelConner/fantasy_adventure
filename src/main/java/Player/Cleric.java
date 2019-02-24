package Player;

import Interfaces.IHeal;

public abstract class Cleric extends Player implements IHeal {

    IHeal potion;

    public Cleric(String name, int health, IHeal potion) {
        super(name, health);
        this.potion = potion;
    }

    public IHeal getHeal() {
        return potion;
    }

    public void setHeal(IHeal potion) {
        this.potion = potion;
    }

}
