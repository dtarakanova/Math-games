package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class GCD {
    public static int number1;
    public static int number2;

    public static void findGCD() {
        number1 = (int) (1 + Math.random() * 99);
        number2 = (int) (1 + Math.random() * 99);
        if (number1 >= number2) {
            for (var i = 1; i < number1; i++) {
                if ((number1 % i == 0) && (number2 % i == 0)) {
                    correctAnswer = String.valueOf(i);
                }
            }
        } else if (number1 == number2) {
            correctAnswer = String.valueOf(number1);
        } else {
            for (var i = 1; i < number2; i++) {
                if ((number1 % i == 0) && (number2 % i == 0)) {
                    correctAnswer = String.valueOf(i);
                }
            }

        }
    }
}
