package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int QUESTIONSARRAYSIZE = 3;
    private static final int ANSWERSARRAYSIZE = 2;
    private static final String GAMETASK = "What is the result of the expression?";


    public static void calculationGame() {
        String[][] questionAnswer = new String[QUESTIONSARRAYSIZE][ANSWERSARRAYSIZE];

        for (var i = 0; i < QUESTIONSARRAYSIZE; i++) {
            int firstNumber = Utils.findRandomNumber();
            int secondNumber = Utils.findRandomNumber();
            char[] allOperators = {'+', '-', '*'};
            var operatorPosition = (int) (Math.random() * allOperators.length);
            char operator = allOperators[operatorPosition];
            String question = "Question: " + firstNumber + " " + operator + " " + secondNumber;
            String answer = String.valueOf(calculate(operator, firstNumber, secondNumber));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAMETASK, questionAnswer);
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
