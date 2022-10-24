package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int NUMBEROFROUNDS = 3;
    private static final String GAMETASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void evenGame() {
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberForTest = Utils.findRandomNumber();
            question[i] = "Question: " + numberForTest;
            rightAnswer[i] = evenGameCheck(numberForTest);
        }

        Engine.gameMechanics(GAMETASK, question, rightAnswer);
    }

    private static String evenGameCheck(int numberForTest) {
        return numberForTest % 2 == 0 ? "yes" : "no";
    }
}
