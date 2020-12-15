package codes.rune.fackmannakrig.ui;

import codes.rune.fackmannakrig.data.FighterClass;
import codes.rune.fackmannakrig.models.Fighter;
import codes.rune.fackmannakrig.models.Player;

import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);


    public void testScanner() {
        String input = sc.nextLine();
        System.out.println(input);
    }

    public Player createNewPlayer() {
        System.out.println("Hello and welcome to Player creation! What is your name?");
        System.out.println();
        String name = "";
        while (name.equals("")) {
            name = sc.nextLine();
        }
        String response = "n";
        while (response.equals("n")) {
            System.out.println(name + ", correct? y/n");
            response = sc.next();
        }
        response = "";

        while (response.equals("")) {
            System.out.println("Create new fighter or load existing? 1.New 2.Load");
            response = sc.nextLine();
            switch (response) {
                case "1":
                    Fighter newFighter = createNewFighter(name);
                    break;
                case "2":
                    loadFighter(name);
                    break;
                default:
                    System.out.println("Try again");
                    response = "";
                    break;
            }

        }

        return null;
    }

    Fighter createNewFighter(String name) {
        System.out.println("Select your fighter class: 1. Warrior\n2. Thief\n3.Wizard");
        String fighterSelection = sc.nextLine();
        FighterClass fighterClass;
        switch (fighterSelection){
            case "1":
                break;
        }


        System.out.println(fighterSelection + ", good choice!");
        return null;
    }

    Fighter loadFighter(String name) {
        //Not yet implemented
        return null;
    }

}
