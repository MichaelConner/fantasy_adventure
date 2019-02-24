package HealingItems;

import Interfaces.IHeal;

public class HealingPotion extends HealingItem implements IHeal{

    public HealingPotion(int healingAmount) {
        super(healingAmount);
    }

}
