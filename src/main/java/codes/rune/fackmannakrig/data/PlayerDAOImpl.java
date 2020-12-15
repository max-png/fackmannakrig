package codes.rune.fackmannakrig.data;

import codes.rune.fackmannakrig.models.Player;

import java.util.ArrayList;

public class PlayerDAOImpl implements PlayerDAO {

    Database database = new Database();


    @Override
    public void addPlayer(Player player) {
        database.addPlayer(player);
    }

    @Override
    public void removePlayer(int id) {

    }

    @Override
    public void updatePlayer(int id, String name) {

    }

    @Override
    public ArrayList<Player> getAllPlayers() {
        return null;
    }

    @Override
    public Player getPlayerById(int id) {
        return null;
    }

    @Override
    public Player getPlayerByName(String name) {
        return null;
    }
}
