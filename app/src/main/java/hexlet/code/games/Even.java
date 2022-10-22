package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void evenGame() {
        var numberOfRounds = 3;
        var maxLimit = 100;
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] question = new String[numberOfRounds];
        String[] rightAnswer = new String[numberOfRounds];

        for (var i = 0; i < numberOfRounds; i++) {
            int numberForTest = (int) (Math.random() * maxLimit);
            question[i] = "Question: " + numberForTest;
            rightAnswer[i] = evenGameCheck(numberForTest);
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }

    private static String evenGameCheck(int numberForTest) {
        return numberForTest % 2 == 0 ? "yes" : "no";
    }
}
