package Game.Shields;

import java.util.Random;

public class NoneShield extends Shield {

    public NoneShield(int protectionLevel) {
        super(protectionLevel);
    }

    @Override
    public String toString() {
        return String.format("Ultra Shield protection level: %d", protectionLevel);
    }

    @Override
    public int protection() {
        return new Random().nextInt(0, protectionLevel);
    }

}
