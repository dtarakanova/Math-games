package hexlet.code;

public class Utils {

    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static int findRandomNumber() {
        return (int) ((Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER);
    }
}
