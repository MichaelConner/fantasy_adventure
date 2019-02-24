package Player;

import Interfaces.IHeal;

public abstract class Cleric extends Player implements IHeal {

    IHeal healingItem;

    public Cleric(String name, int health, IHeal healingItem) {
        super(name, health);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public int heal(){
        return healingItem.heal();
    }

}
