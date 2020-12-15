package codes.rune.fackmannakrig.models;

import codes.rune.fackmannakrig.data.FighterClass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Fighter {

    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;

    private FighterClass fighterClass;

    private int level;
    private int health;
    private int mana;

    private ArrayList<Spell> spells;

    public Fighter(String name) {
        this.name = name;
        level = 0;
        id = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FighterClass getFighterClass() {
        return fighterClass;
    }

    public void setFighterClass(FighterClass fighterClass) {
        this.fighterClass = fighterClass;
        this.health = fighterClass.getHitPoints();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }
}
