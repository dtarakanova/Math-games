package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int ANSWERS_ARRAY_SIZE = 2;

    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void primeGame() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];

        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            int numberToCheck = Utils.findRandomNumber();
            String question = "Question: " + numberToCheck;
            String answer = isPrime(numberToCheck) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAME_TASK, questionAnswer);
    }


    private static boolean isPrime(int numberToCheck) {
        int numberOfDividers = 0;
        for (int i = numberToCheck; i > 0; i--) {
            if (numberToCheck % i == 0) {
                numberOfDividers++;
            }
        }
        return numberOfDividers == 2;
    }
}
