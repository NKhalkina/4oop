import java.util.Random;

public abstract class Warrior<T extends Weapon, A extends Shield> extends Personage{
protected static Random rnd = new Random();
    protected Weapon weapon;
    protected Shield shield;

    public Warrior(String name, int hp, Shield shield,Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    public int protection(){
        boolean isHit = rnd.nextBoolean();
        int protectionShield = 0;
        if (isHit){
            protectionShield = rnd.nextInt(shield.protectionShield());
        }
        return protectionShield;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tЗащищён: %s", this.protection()));
        return res.toString();
    }
    public void reduceHp(int attak) {
    }
}
