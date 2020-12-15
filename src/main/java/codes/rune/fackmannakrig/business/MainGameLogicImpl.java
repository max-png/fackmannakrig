package codes.rune.fackmannakrig.business;

import codes.rune.fackmannakrig.models.Player;

import java.util.HashMap;
import java.util.HashSet;

public class MainGameLogicImpl implements GameLogic {

    public MainGameLogicImpl() {
    }

    String gameName = "Fackmannakrig";
    boolean isRunning = false;

    HashSet<Player> playerHashSet = new HashSet<>();

    @Override
    public void loadPlayers(HashSet<Player> playerHashSet) {
        this.playerHashSet = playerHashSet;
    }

    @Override
    public void launch() {
        System.out.println("Launching game " + gameName);
        isRunning = true;
    }



}
