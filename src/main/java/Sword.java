public class Sword extends Weapon implements IWeapon{

    public Sword(int damage) {
        super(damage);
    }

    public int attack(){
        return getDamage();
    }

}
