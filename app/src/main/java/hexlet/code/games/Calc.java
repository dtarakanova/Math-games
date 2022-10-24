package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int NUMBEROFROUNDS = 3;
    private static final String GAMETASK = "What is the result of the expression?";


    public static void calculationGame() {
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int firstNumber = Utils.findRandomNumber();
            int secondNumber = Utils.findRandomNumber();
            char[] allOperators = {'+', '-', '*'};
            var operatorPosition = (int) (Math.random() * allOperators.length);
            char operator = allOperators[operatorPosition];
            question[i] = "Question: " + firstNumber + " " + operator + " " + secondNumber;
            rightAnswer[i] = String.valueOf(calculate(operator, firstNumber, secondNumber));
        }

        Engine.gameMechanics(GAMETASK, question, rightAnswer);
    }


    private static int calculate(char operator, int firstNumber, int secondNumber) {
        var result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Unknown operator " + operator);
                break;
        }
        return result;
    }
}
