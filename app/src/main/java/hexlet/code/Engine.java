package hexlet.code;

import java.util.Scanner;

public class Engine {

    /* Общая механика для всех игр:
    1. Приветствие и получение имени пользователя.
    2. Вывод правил выбранной игры.
    3. Вывод конкретного вопроса.
    4. Получение ответа пользователя и его сравнение с правильным ответом.
    5. В случае неверного ответа пользователя игра заканчивается, а пользователю предлагается попробовать снова.
       После трех верных ответов игра завершается победой.
     */

    public static final int QUESTIONS_ARRAY_SIZE = 3;


    public static void gameMechanics(String gameTask, String[][] questionAnswer) {
        String userName;
        String answer;

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameTask);
        for (String[] result: questionAnswer) {
            String question = "Question: " + result[0];
            String rightAnswer = result[1];
            System.out.println(question);
            Scanner ta = new Scanner(System.in);
            System.out.print("Your answer: ");
            answer = ta.next();

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
