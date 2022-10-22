package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int NUMBEROFROUNDS = 3;
    private static final int MAXLIMIT = 100;

    public static void evenGame() {
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            int numberForTest = (int) (Math.random() * MAXLIMIT);
            question[i] = "Question: " + numberForTest;
            rightAnswer[i] = evenGameCheck(numberForTest);
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }

    private static String evenGameCheck(int numberForTest) {
        return numberForTest % 2 == 0 ? "yes" : "no";
    }
}
