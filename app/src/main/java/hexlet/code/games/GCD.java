package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class GCD {
    public static int numberOne;
    public static int numberTwo;

    public static void findGCD() {
        numberOne = (int) (1 + Math.random() * 99);
        numberTwo = (int) (1 + Math.random() * 99);
        int getMin = Math.min(numberOne,numberTwo);
            for (int i = 1; i <= getMin; i++) {
                if ((numberOne % i == 0) && (numberTwo % i == 0)) {
                    correctAnswer = String.valueOf(i);
                }
            }
    }
}
