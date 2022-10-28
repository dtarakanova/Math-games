package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTIONS_ARRAY_SIZE;


public class Progression {

    private static final int ANSWERS_ARRAY_SIZE = 2;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 6;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 9;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;
    private static final String GAME_TASK = "What number is missing in the progression?";


    public static void generateProgression() {
        String[][] questionAnswer = new String[QUESTIONS_ARRAY_SIZE][ANSWERS_ARRAY_SIZE];

        for (var i = 0; i < QUESTIONS_ARRAY_SIZE; i++) {
            var length = Utils.findRandomNumber(MIN_LENGTH, MAX_LENGTH);
            var baseElement = Utils.findRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var progressionStep = Utils.findRandomNumber(MIN_STEP, MAX_STEP);
            var missingElement = Utils.findPosition(length);
            String[] progressionToPrint = createProgression(baseElement, progressionStep, length);
            String answer = progressionToPrint[missingElement];
            progressionToPrint[missingElement] = "..";
            String question = String.join(" ", progressionToPrint);
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.gameMechanics(GAME_TASK, questionAnswer);
    }


    private static String[] createProgression(int baseElement, int progressionStep, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(baseElement + i * progressionStep);
        }
        return progression;
    }

}

