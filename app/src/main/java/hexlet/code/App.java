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
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner gn = new Scanner(System.in);
        gameNumber = Integer.parseInt(gn.next());
        System.out.println();
        chooseGame();
    }

    public static void chooseGame() {
        if (gameNumber == 0) {
            System.exit(0);
        } else if (gameNumber == 1) {
            Engine.greeting();
        } else if (gameNumber >= 2 && gameNumber <= 6) {
            Engine.gameMechanics();
        } else {
            System.out.println("No game " + gameNumber + " found");
        }
    }
}
