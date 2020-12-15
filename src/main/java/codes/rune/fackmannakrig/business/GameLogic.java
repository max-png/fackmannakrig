package codes.rune.fackmannakrig.business;

import codes.rune.fackmannakrig.models.Player;

import java.util.HashSet;

public interface GameLogic {

    String gameName = "Unknown game";

    void loadPlayers(HashSet<Player> playerHashSet);
    void launch();


}
