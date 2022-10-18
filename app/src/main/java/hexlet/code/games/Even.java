package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class Even {
    public static int numberForTest;
    public static void evenGame() {
        numberForTest = (int) (Math.random() * 100);
        if (numberForTest % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
    }
}
