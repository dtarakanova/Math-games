package src.main.java.hexlet.code;

import java.util.Scanner;

import src.main.java.hexlet.code.games.*;

import static hexlet.code.App.gameNumber;

public class Engine {
    private static String userName;
    private static String answer;
    public static String correctAnswer;

    //Механика игры
    public static void gameMechanics() {
        greeting();
        gameRules();
        int rightAnswers = 3;
        int i = 0;
        while (i < rightAnswers) {
            launchGame();
            askQuesion();
            getAnswer();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == rightAnswers) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    //Приветствие и ввод имени
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    //Условия игры
    public static void gameRules() {
        switch (gameNumber) {
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                break;
            case 4:
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
                break;
            default:
                System.out.println("No game under number " + gameNumber + " found.");
                break;
        }
    }

    //Запуск игры
    public static void launchGame() {
        switch (gameNumber) {
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calculationGame();
                break;
            case 4:
                GCD.findGCD();
                break;
            case 5:
                Progression.generateProgression();
                break;
            default:
                System.out.println("No game under number " + gameNumber + " found.");
                break;
        }
    }

    public static void askQuesion() {
        switch (gameNumber) {
            case 2:
                System.out.println("Question: " + Even.numberForTest);
                break;
            case 3:
                System.out.println("Question: " + Calc.firstNumber + " " + Calc.operator + " " + Calc.secondNumber);
                break;
            case 4:
                System.out.println("Question: " + GCD.numberOne + " " + GCD.numberTwo);
                break;
            case 5:
                System.out.println("Question: " + Progression.progressionToPrint);
                break;
            default:
                System.out.println("No game under number " + gameNumber + " found.");
                break;
        }
    }

    //Получение ответа пользователя
    public static void getAnswer() {
        Scanner ta = new Scanner(System.in);
        System.out.print("Your answer: ");
        answer = ta.next();
    }

}
