package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int CORRECTANSWERS = 3;

    //Механика игры
    public static void gameMechanics(String gameTask, String[] question, String[] rightAnswer) {
        var i = 0;
        String userName;
        String answer;

        //Приветствие и ввод имени
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        //Запуск механики игры
        System.out.println(gameTask);
        for (i = 0; i < CORRECTANSWERS; i++) {
            System.out.println(question[i]);

            //Получение ответа пользователя
            Scanner ta = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = ta.next();

            if (answer.equals(rightAnswer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
