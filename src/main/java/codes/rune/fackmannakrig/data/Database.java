package codes.rune.fackmannakrig.data;

import codes.rune.fackmannakrig.models.Fighter;
import codes.rune.fackmannakrig.models.Player;

import java.util.HashSet;

public class Database {

    HashSet<Player> playerHashSet = new HashSet<>();
    HashSet<Fighter> fighterHashSet = new HashSet<>();


    void poulateHashSets(){

    }

    public HashSet<Player> getPlayerHashSet() {
        return playerHashSet;
    }

    public HashSet<Fighter> getFighterHashSet() {
        return fighterHashSet;
    }
}
