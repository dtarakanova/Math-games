package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int QUESTIONS_ARRAY_SIZE = 3;
    private static final int ANSWERS_ARRAY_SIZE = 2;
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void evenGame() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];
        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            int numberForTest = Utils.findRandomNumber();
            String question = "Question: " + numberForTest;
            String answer = evenGameCheck(numberForTest) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAME_TASK, questionAnswer);
    }

    private static boolean evenGameCheck(int numberForTest) {
        return numberForTest % 2 == 0;
    }
}
