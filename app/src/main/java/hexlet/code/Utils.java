package hexlet.code;

public class Utils {

    public static int findRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int findPosition(int length) {
        return (int) (Math.random() * length);
    }
}
