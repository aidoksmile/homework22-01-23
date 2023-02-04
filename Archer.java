package Game;

import Game.Shields.NoneShield;
import Game.Weapons.Bow;

public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, NoneShield shield) {
        super(name, healthPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
}
