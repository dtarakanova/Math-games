package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
