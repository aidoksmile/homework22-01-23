package Game;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Shieldable shield;

    public Warrior(String name, int healthPoint, Weaponable weapon, Shieldable shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(Weaponable weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Shieldable getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return String.format("name: %s, health point: %d, weapon: %s, shield: %s", name, healthPoint, weapon, shield);
    }
}
