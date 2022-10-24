package hexlet.code;

public class Utils {

    static final int MINNUMBER = 1;
    static final int MAXNUMBER = 100;

    public static int findRandomNumber() {
        return (int) ((Math.random() * (MAXNUMBER - MINNUMBER)) + MINNUMBER);
    }
}
