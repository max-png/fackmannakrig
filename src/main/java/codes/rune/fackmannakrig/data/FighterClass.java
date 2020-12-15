package codes.rune.fackmannakrig.data;

public enum FighterClass {
    WARRIOR,
    THIEF,
    MAGICIAN;

    private int hitPoints;

    FighterClass() {
        switch(this){
            case THIEF:
                hitPoints = 100;
                break;
            case WARRIOR:
                hitPoints = 125;
                break;
            case MAGICIAN:
                hitPoints = 75;
                break;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
