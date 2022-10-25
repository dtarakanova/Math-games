package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int QUESTIONSARRAYSIZE = 3;
    private static final int ANSWERSARRAYSIZE = 2;
    private static final String GAMETASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void evenGame() {
        String[][] questionAnswer = new String[QUESTIONSARRAYSIZE][ANSWERSARRAYSIZE];
        for (var i = 0; i < QUESTIONSARRAYSIZE; i++) {
            int numberForTest = Utils.findRandomNumber();
            String question = "Question: " + numberForTest;
            String answer = evenGameCheck(numberForTest) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAMETASK, questionAnswer);
    }

    private static boolean evenGameCheck(int numberForTest) {
        return numberForTest % 2 == 0;
    }
}
