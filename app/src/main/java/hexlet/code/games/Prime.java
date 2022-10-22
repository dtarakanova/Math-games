package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void primeGame() {
        var numberOfRounds = 3;
        var maxLimit = 100;
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[numberOfRounds];
        String[] rightAnswer = new String[numberOfRounds];

        for (var i = 0; i < numberOfRounds; i++) {
            int numberToCheck = (int) (Math.random() * maxLimit);
            question[i] = "Question: " + numberToCheck;
            rightAnswer[i] = isPrime(numberToCheck) ? "yes" : "no";
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
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
