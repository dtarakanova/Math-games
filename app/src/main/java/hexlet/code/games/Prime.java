package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class Prime {
    public static int numberToCheck;
    public static void primeGame() {
        numberToCheck = (int) (Math.random() * 100);
        checkIfPrime();
    }
    public static void checkIfPrime() {
        for (var i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                correctAnswer = "no";
                break;
            } else {
                correctAnswer = "yes";
            }
        }
    }
}
