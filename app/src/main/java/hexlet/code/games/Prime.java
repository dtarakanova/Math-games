package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int NUMBEROFROUNDS = 3;
    private static final String GAMETASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void primeGame() {
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberToCheck = Utils.findRandomNumber();
            question[i] = "Question: " + numberToCheck;
            rightAnswer[i] = isPrime(numberToCheck) ? "yes" : "no";
        }

        Engine.gameMechanics(GAMETASK, question, rightAnswer);
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
