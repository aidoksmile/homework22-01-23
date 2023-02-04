package Game.Shields;

import java.util.Random;

public class MetallShield extends Shield {
    public MetallShield(int protectionLevel) {
        super(protectionLevel);
    }

    @Override
    public String toString() {
        return String.format("Metall Shield protection level: %d", protectionLevel);
    }

    @Override
    public int protection() {
        return new Random().nextInt(0, protectionLevel);
    }

}
