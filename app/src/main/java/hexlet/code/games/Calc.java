package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTIONS_ARRAY_SIZE;

public class Calc {
    private static final int ANSWERS_ARRAY_SIZE = 2;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;
    private static final String GAME_TASK = "What is the result of the expression?";


    public static void calculationGame() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];

        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            int firstNumber = Utils.findRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.findRandomNumber(MIN_NUMBER, MAX_NUMBER);
            char[] allOperators = {'+', '-', '*'};
            int length = allOperators.length;
            var operatorPosition = Utils.findPosition(length);
            char operator = allOperators[operatorPosition];
            String question = firstNumber + " " + operator + " " + secondNumber;
            String answer = String.valueOf(calculate(operator, firstNumber, secondNumber));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAME_TASK, questionAnswer);
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
