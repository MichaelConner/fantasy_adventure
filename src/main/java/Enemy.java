public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){

        if ((health - damage) > 0){
        health -= damage;
        } else {
            health = 0;
        }
    }

}
