package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int ANSWERS_ARRAY_SIZE = 2;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";


    public static void findGCD() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];

        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            int numberOne = Utils.findRandomNumber();
            int numberTwo = Utils.findRandomNumber();
            String question = "Question: " + numberOne + " " + numberTwo;
            String answer = String.valueOf(gcdCalculation(numberOne, numberTwo));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAME_TASK, questionAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
