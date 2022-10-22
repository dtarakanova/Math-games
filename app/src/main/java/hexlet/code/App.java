package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner gn = new Scanner(System.in);
        int gameNumber = Integer.parseInt(gn.next());
        System.out.println();

        switch (gameNumber) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calculationGame();
                break;
            case 4:
                GCD.findGCD();
                break;
            case 5:
                Progression.generateProgression();
                break;
            case 6:
                Prime.primeGame();
                break;
            default:
                System.out.println("No game " + gameNumber + " found");
                break;
        }
    }
}
