public class Axe extends Weapon implements IWeapon {

    public Axe(int damage) {
        super(damage);
    }

    public int attack(){
        return getDamage();
    }

}

