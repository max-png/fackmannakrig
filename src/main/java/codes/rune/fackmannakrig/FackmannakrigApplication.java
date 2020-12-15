package codes.rune.fackmannakrig;

import codes.rune.fackmannakrig.business.Controller;
import codes.rune.fackmannakrig.business.GameLogic;
import codes.rune.fackmannakrig.business.MainGameLogicImpl;
import codes.rune.fackmannakrig.data.Database;
import codes.rune.fackmannakrig.ui.UserInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FackmannakrigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FackmannakrigApplication.class, args);

        GameLogic gameLogic = new MainGameLogicImpl();
        UserInterface userInterface = new UserInterface();
        Database database = new Database();

        Controller controller = new Controller(gameLogic,userInterface, database);

        controller.launch();

    }


}
