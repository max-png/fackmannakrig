package codes.rune.fackmannakrig.models;

import java.util.concurrent.atomic.AtomicInteger;
import static org.apache.commons.lang3.Validate.notEmpty;
import static org.apache.commons.lang3.Validate.notNull;

public class Player {

    private static final AtomicInteger count = new AtomicInteger(0);
    private String name;
    private Fighter fighter;
    private final int id;

    public Player(String name, Fighter fighter) {
        this.name = notEmpty(name);
        this.fighter = notNull(fighter);
        id = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
}
