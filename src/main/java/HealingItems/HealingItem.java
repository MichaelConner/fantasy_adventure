package HealingItems;

public abstract class HealingItem {

    private int healingAmount;

    public HealingItem(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }

    public void setHealingAmount(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public int heal(){
        return getHealingAmount();
    }
}
