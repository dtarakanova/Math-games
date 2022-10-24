package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int NUMBEROFROUNDS = 3;
    private static final String GAMETASK = "Find the greatest common divisor of given numbers.";


    public static void findGCD() {
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberOne = Utils.findRandomNumber();
            int numberTwo = Utils.findRandomNumber();
            question[i] = "Question: " + numberOne + " " + numberTwo;
            rightAnswer[i] = String.valueOf(gcdCalculation(numberOne, numberTwo));
        }

        Engine.gameMechanics(GAMETASK, question, rightAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
