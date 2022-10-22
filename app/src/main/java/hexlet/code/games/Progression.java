package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void generateProgression() {
        var numberOfRounds = 3;
        var minLength = 5;
        var maxLength = 6;
        var baseElementLimit = 100;
        var minStep = 1;
        var maxStep = 9;
        String gameTask = "What number is missing in the progression?.";
        String[] question = new String[numberOfRounds];
        String[] rightAnswer = new String[numberOfRounds];

        for (var i = 0; i < numberOfRounds; i++) {
            var progressionLength = (int) (Math.random() * minLength + maxLength);
            var baseElement = (int) (Math.random() * baseElementLimit);
            var progressionStep = (int) (Math.random() * maxStep + minStep);
            var missingElement = (int) (Math.random() * progressionLength);
            String[] progressionToPrint = createProgression(baseElement, progressionStep, progressionLength);
            rightAnswer[i] = progressionToPrint[missingElement];
            progressionToPrint[missingElement] = "..";
            question[i] = "Question: " + String.join(" ", progressionToPrint);
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }


    private static String[] createProgression(int baseElement, int progressionStep, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(baseElement + i * progressionStep);
        }
        return progression;
    }

}

