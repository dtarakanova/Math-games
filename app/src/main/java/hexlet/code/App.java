package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
}
