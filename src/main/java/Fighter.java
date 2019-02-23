public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
    
}
