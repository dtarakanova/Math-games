package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int CORRECTANSWERS = 3;

    /* Общая механика для всех игр:
    1. Приветствие и получение имени пользователя.
    2. Вывод правил выбранной игры.
    3. Вывод конкретного вопроса.
    4. Получение ответа пользователя и его сравнение с правильным ответом.
    5. В случае неверного ответа пользователя игра заканчивается, а пользователю предлагается попробовать снова.
       После трех верных ответов игра завершается победой.
     */

    public static void gameMechanics(String GAMETASK, String[] question, String[] rightAnswer) {
        var i = 0;
        String userName;
        String answer;

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(GAMETASK);
        for (i = 0; i < CORRECTANSWERS; i++) {
            System.out.println(question[i]);
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
