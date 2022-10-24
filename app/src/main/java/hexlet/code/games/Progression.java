package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int NUMBEROFROUNDS = 3;
    private static final int MINLENGTH = 5;
    private static final int MAXLENGTH = 6;
    private static final int MINSTEP = 1;
    private static final int MAXSTEP = 9;
    private static final String GAMETASK = "What number is missing in the progression?";


    public static void generateProgression() {
        String[] question = new String[NUMBEROFROUNDS];
        String[] rightAnswer = new String[NUMBEROFROUNDS];

        for (var i = 0; i < NUMBEROFROUNDS; i++) {
            var progressionLength = (int) (Math.random() * MINLENGTH + MAXLENGTH);
            var baseElement = Utils.findRandomNumber();
            var progressionStep = (int) (Math.random() * MAXSTEP + MINSTEP);
            var missingElement = (int) (Math.random() * progressionLength);
            String[] progressionToPrint = createProgression(baseElement, progressionStep, progressionLength);
            rightAnswer[i] = progressionToPrint[missingElement];
            progressionToPrint[missingElement] = "..";
            question[i] = "Question: " + String.join(" ", progressionToPrint);
        }

        Engine.gameMechanics(GAMETASK, question, rightAnswer);
    }


    private static String[] createProgression(int baseElement, int progressionStep, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(baseElement + i * progressionStep);
        }
        return progression;
    }

}

