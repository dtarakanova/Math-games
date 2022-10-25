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
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        Scanner gn = new Scanner(System.in);
        int gameNumber = Integer.parseInt(gn.next());
        System.out.println();

        switch (gameNumber) {
            case GOODBYE -> System.out.println("Goodbye!");
            case GREETING -> Cli.greeting();
            case EVENGAME -> Even.evenGame();
            case CALCGAME -> Calc.calculationGame();
            case GCDGAME -> GCD.findGCD();
            case PROGRESSIONGAME -> Progression.generateProgression();
            case PRIMEGAME -> Prime.primeGame();
            default -> System.out.println("No game " + gameNumber + " found");
        }
    }
}
