package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void calculationGame() {
        var numberOfRounds = 3;
        var maxLimit = 100;
        String gameTask = "What is the result of the expression?";
        String[] question = new String[numberOfRounds];
        String[] rightAnswer = new String[numberOfRounds];

        for (var i = 0; i < numberOfRounds; i++) {
            // Генерация чисел
            int firstNumber = (int) (Math.random() * maxLimit);
            int secondNumber = (int) (Math.random() * maxLimit);
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
