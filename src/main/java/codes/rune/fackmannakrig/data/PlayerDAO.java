package codes.rune.fackmannakrig.data;

import codes.rune.fackmannakrig.models.Player;

import java.util.ArrayList;

public interface PlayerDAO {

    void addPlayer(Player player);
    void removePlayer(int id);
    void updatePlayer(int id, String name);

    ArrayList<Player> getAllPlayers();

    Player getPlayerById(int id);
    Player getPlayerByName(String name);

}