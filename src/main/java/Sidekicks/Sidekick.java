package Sidekicks;

import Interfaces.IDefend;

public abstract class Sidekick implements IDefend {

    int strength;

    public Sidekick(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int defend(){
        return getStrength();
    }

}
