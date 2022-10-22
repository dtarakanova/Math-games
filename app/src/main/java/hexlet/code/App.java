package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {

    private static final int GOODBYE = 0;
    private static final int GREETING = 1;
    private static final int EVENGAME = 2;
    private static final int CALCGAME = 3;
    private static final int GCDGAME = 4;
    private static final int PROGRESSIONGAME = 5;
    private static final int PRIMEGAME = 6;


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
            case GOODBYE:
                System.out.println("Goodbye!");
                break;
            case GREETING:
                Cli.greeting();
                break;
            case EVENGAME:
                Even.evenGame();
                break;
            case CALCGAME:
                Calc.calculationGame();
                break;
            case GCDGAME:
                GCD.findGCD();
                break;
            case PROGRESSIONGAME:
                Progression.generateProgression();
                break;
            case PRIMEGAME:
                Prime.primeGame();
                break;
            default:
                System.out.println("No game " + gameNumber + " found");
                break;
        }
    }
}
