package Game.Shields;

import java.util.Random;

public class WoodShield extends Shield {

    public WoodShield(int protectionLevel) {
        super(protectionLevel);
    }

    @Override
    public String toString() {
        return String.format("Wood Shield protection level: %d", protectionLevel);
    }

    @Override
    public int protection() {
        return new Random().nextInt(0, protectionLevel);
    }

}
