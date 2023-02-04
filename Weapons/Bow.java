package Game.Weapons;

import java.util.Random;

public class Bow extends Weapon {
    private int range;

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return "Bow [range=" + range + "], " + "damage = " + pointOfDamage;
    }
}
