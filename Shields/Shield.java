package Game.Shields;

import Game.Shieldable;

public abstract class Shield implements Shieldable {
    protected int protectionLevel;

    public Shield(int protectionLevel) {
        this.protectionLevel = protectionLevel;
    }
}
