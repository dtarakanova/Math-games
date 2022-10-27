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
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;


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
            case EVEN_GAME -> Even.evenGame();
            case CALC_GAME -> Calc.calculationGame();
            case GCD_GAME -> GCD.findGCD();
            case PROGRESSION_GAME -> Progression.generateProgression();
            case PRIME_GAME -> Prime.primeGame();
            default -> System.out.println("No game " + gameNumber + " found");
        }
    }
}
