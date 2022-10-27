package hexlet.code;

public class Utils {

    public static int findRandomNumber(int minNumber, int maxNumber) {
        return (int) ((Math.random() * (maxNumber - minNumber)) + minNumber);
    }
}
