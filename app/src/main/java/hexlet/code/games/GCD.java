package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int QUESTIONSARRAYSIZE = 3;
    private static final int ANSWERSARRAYSIZE = 2;
    private static final String GAMETASK = "Find the greatest common divisor of given numbers.";


    public static void findGCD() {
        String[][] questionAnswer = new String[QUESTIONSARRAYSIZE][ANSWERSARRAYSIZE];

        for (var i = 0; i < QUESTIONSARRAYSIZE; i++) {
            int numberOne = Utils.findRandomNumber();
            int numberTwo = Utils.findRandomNumber();
            String question = "Question: " + numberOne + " " + numberTwo;
            String answer = String.valueOf(gcdCalculation(numberOne, numberTwo));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAMETASK, questionAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
