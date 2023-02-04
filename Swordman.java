package Game;

import Game.Shields.MetallShield;
import Game.Weapons.Sword;

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, MetallShield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }
}
