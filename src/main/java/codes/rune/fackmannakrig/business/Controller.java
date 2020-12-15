package codes.rune.fackmannakrig.business;

import codes.rune.fackmannakrig.data.Database;
import codes.rune.fackmannakrig.ui.UserInterface;

public class Controller {

    GameLogic gameLogic;
    UserInterface userInterface;
    Database database;

    public Controller(GameLogic gameLogic, UserInterface userInterface, Database database){
        this.gameLogic = gameLogic;
        this.userInterface = userInterface;
        this.database = database;
    }

    public void launch(){
        gameLogic.launch();
        userInterface.createNewPlayer();
    }

}
