package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTIONS_ARRAY_SIZE;

public class GCD {
    private static final int ANSWERS_ARRAY_SIZE = 2;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";


    public static void findGCD() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];

        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            int numberOne = Utils.findRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int numberTwo = Utils.findRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = numberOne + " " + numberTwo;
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
