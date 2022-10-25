package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int QUESTIONSARRAYSIZE = 3;
    private static final int ANSWERSARRAYSIZE = 2;

    private static final String GAMETASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void primeGame() {
        String[][] questionAnswer = new String[QUESTIONSARRAYSIZE][ANSWERSARRAYSIZE];

        for (var i = 0; i < QUESTIONSARRAYSIZE; i++) {
            int numberToCheck = Utils.findRandomNumber();
            String question = "Question: " + numberToCheck;
            String answer = isPrime(numberToCheck) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAMETASK, questionAnswer);
    }


    private static boolean isPrime(int numberToCheck) {
        var minNumber = 2;
        if (numberToCheck < minNumber) {
            return false;
        } else {
            for (var i = 2; i < numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
