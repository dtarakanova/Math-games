package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner gn = new Scanner(System.in);
        String gameNumber = gn.next();
        System.out.println();

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
