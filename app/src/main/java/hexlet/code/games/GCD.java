package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int NUMBEROFROUNDS = 3;

    public static void findGCD() {
        String gameTask = "Find the greatest common divisor of given numbers.";
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberOne = Utils.findRandomNumber();
            int numberTwo = Utils.findRandomNumber();
            question[i] = "Question: " + numberOne + " " + numberTwo;
            rightAnswer[i] = String.valueOf(gcdCalculation(numberOne, numberTwo));
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
