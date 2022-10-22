package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int NUMBEROFROUNDS = 3;
    private static final int MINLIMIT = 1;
    private static final int MAXLIMIT = 99;

    public static void findGCD() {
        String gameTask = "Find the greatest common divisor of given numbers.";
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberOne = (int) (MINLIMIT + Math.random() * MAXLIMIT);
            int numberTwo = (int) (MINLIMIT + Math.random() * MAXLIMIT);
            question[i] = "Question: " + numberOne + " " + numberTwo;
            rightAnswer[i] = String.valueOf(gcdCalculation(numberOne, numberTwo));
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
