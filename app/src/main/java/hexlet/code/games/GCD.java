package hexlet.code.games;


import hexlet.code.Engine;

public class GCD {

    public static void findGCD() {
        var numberOfRounds = 3;
        var minLimit = 1;
        var maxLimit = 99;
        String gameTask = "Find the greatest common divisor of given numbers.";
        String[] question = new String[numberOfRounds];
        String[] rightAnswer = new String[numberOfRounds];

        for (var i = 0; i < numberOfRounds; i++) {
            int numberOne = (int) (minLimit + Math.random() * maxLimit);
            int numberTwo = (int) (minLimit + Math.random() * maxLimit);
            question[i] = "Question: " + numberOne + " " + numberTwo;
            rightAnswer[i] = String.valueOf(gcdCalculation(numberOne, numberTwo));
        }

        Engine.gameMechanics(gameTask, question, rightAnswer);
    }


    private static int gcdCalculation(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : gcdCalculation(numberTwo, numberOne % numberTwo);
    }
}
