package Spells;

import Interfaces.ISpell;

public abstract class Spell implements ISpell {

    private int damage;

    public Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int cast(){
        return getDamage();
    }

}
