public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public int attack(){
        return weapon.attack();
    }

}
