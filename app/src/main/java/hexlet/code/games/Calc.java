package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int NUMBEROFROUNDS = 3;
    private static final int MAXLIMIT = 100;

    public static void calculationGame() {
        String gameTask = "What is the result of the expression?";
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            // Генерация чисел
            int firstNumber = (int) (Math.random() * MAXLIMIT);
            int secondNumber = (int) (Math.random() * MAXLIMIT);
            // Генерация оператора
            char[] allOperators = {'+', '-', '*'};
            char operator = ' ';
            var operatorPosition = (int) (Math.random() * allOperators.length);
            if (allOperators[operatorPosition] == '+') {
                operator = '+';
            } else if (allOperators[operatorPosition] == '-') {
                operator = '-';
            } else if (allOperators[operatorPosition] == '*') {
                operator = '*';
            }
            question[i] = "Question: " + firstNumber + " " + operator + " " + secondNumber;
            rightAnswer[i] = String.valueOf(calculate(operator, firstNumber, secondNumber));
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
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
