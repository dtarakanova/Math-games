package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int QUESTIONSARRAYSIZE = 3;
    private static final int ANSWERSARRAYSIZE = 2;
    private static final int MINLENGTH = 5;
    private static final int MAXLENGTH = 6;
    private static final int MINSTEP = 1;
    private static final int MAXSTEP = 9;
    private static final String GAMETASK = "What number is missing in the progression?";


    public static void generateProgression() {
        String[][] questionAnswer = new String[QUESTIONSARRAYSIZE][ANSWERSARRAYSIZE];

        for (var i = 0; i < QUESTIONSARRAYSIZE; i++) {
            var progressionLength = (int) (Math.random() * MINLENGTH + MAXLENGTH);
            var baseElement = Utils.findRandomNumber();
            var progressionStep = (int) (Math.random() * MAXSTEP + MINSTEP);
            var missingElement = (int) (Math.random() * progressionLength);
            String[] progressionToPrint = createProgression(baseElement, progressionStep, progressionLength);
            String answer = progressionToPrint[missingElement];
            progressionToPrint[missingElement] = "..";
            String question = "Question: " + String.join(" ", progressionToPrint);
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAMETASK, questionAnswer);
    }


    private static String[] createProgression(int baseElement, int progressionStep, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(baseElement + i * progressionStep);
        }
        return progression;
    }

}

