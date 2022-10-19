package hexlet.code;

import src.main.java.hexlet.code.Engine;

import java.util.Scanner;

public class App {
    public static int gameNumber;

    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner gn = new Scanner(System.in);
        gameNumber = Integer.parseInt(gn.next());
        System.out.println();
        chooseGame();
    }

    public static void chooseGame() {
        switch (gameNumber) {
            case 0:
                break;
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.gameMechanics();
                break;
            case 3:
                Engine.gameMechanics();
                break;
            default:
                System.out.println("No game " + gameNumber + " found");
                break;
        }
    }
}
