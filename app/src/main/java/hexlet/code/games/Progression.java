package src.main.java.hexlet.code.games;

import static src.main.java.hexlet.code.Engine.correctAnswer;

public class Progression {

    public static String progressionToPrint;

    public static void generateProgression() {
        //Условия для создания прогрессии
        int minLimit = 5;
        int maxLimit = 6;
        int progressionLength = (int) (Math.random() * minLimit + maxLimit);
        int supportingElement = (int) (Math.random() * 100);
        int progressionStep = (int) (Math.random() * 9 + 1);
        int missingElement = (int) (Math.random() * progressionLength);
        var progressionToDisplay = new StringBuilder();

        //Заполнение прогрессии
        for (int i = 0; i < progressionLength; i++) {
            if (i == missingElement) {
                progressionToDisplay.append("..");
                correctAnswer = String.valueOf(supportingElement);
            } else {
                progressionToDisplay.append(" " + supportingElement);
            }
            supportingElement = supportingElement + progressionStep;
            progressionToPrint = progressionToDisplay.toString();
        }
    }
}

