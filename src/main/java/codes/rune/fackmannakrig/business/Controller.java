package codes.rune.fackmannakrig.business;

import codes.rune.fackmannakrig.ui.UserInterface;

public class Controller {

    GameLogic gameLogic;
    UserInterface userInterface;

    public Controller(GameLogic gameLogic, UserInterface userInterface){
        this.gameLogic = gameLogic;
        this.userInterface = userInterface;
        gameLogic.launch();
    }

}
