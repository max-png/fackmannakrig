package codes.rune.fackmannakrig.business;

import codes.rune.fackmannakrig.models.Player;

import java.util.HashMap;
import java.util.HashSet;

public class MainGameLogicImpl implements GameLogic {

    public MainGameLogicImpl() {
    }

    String gameName = "Fackmannakrig";
    HashSet<Player> playerHashSet = new HashSet<>();

    @Override
    public void loadPlayers(HashSet<Player> playerHashSet) {
        this.playerHashSet = playerHashSet;
    }

    public void addPlayer(Player player){
        playerHashSet.add(player);
    }

    @Override
    public void launch() {
        System.out.println("Launching game " + gameName);
    }

}
