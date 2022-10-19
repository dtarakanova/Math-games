package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class Calc {
    public static int firstNumber;
    public static int secondNumber;
    public static char operator;

    public static void calculationGame() {
        firstNumber = (int) (Math.random() * 100);
        secondNumber = (int) (Math.random() * 100);
        char[] allOperators = {'+', '-', '*'};
        int n = (int) (Math.random() * 3);
        if (allOperators[n] == '+') {
            operator = '+';
        } else if (allOperators[n] == '-') {
            operator = '-';
        } else if (allOperators[n] == '*') {
            operator = '*';
        }

        switch (allOperators[n]) {
            case '+':
                correctAnswer = String.valueOf(firstNumber + secondNumber);
                break;
            case '-':
                correctAnswer = String.valueOf(firstNumber - secondNumber);
                break;
            case '*':
                correctAnswer = String.valueOf(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator " + allOperators[n]);
        }
    }
}
