package at.berke.projects.stringhelper;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        System.out.println("1. Palindrom?");
        System.out.println("2. Anzahl der Buchstaben");
        System.out.println("3. Wort rückwärts");
        System.out.println("4. Wörter zählen");
        System.out.println("5. Beenden");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.nextLine();

            if (selection.equals("1")) {
                isPalindrom();
            }
            if (selection.equals("2")) {
                countLetters();
            }
            if (selection.equals("3")) {
                reverseString();
            }
            if (selection.equals("4")) {
                getAmountofWords();
            }
            if (selection.equals("5")) {
                end();
            }
        }
    }

    public static void isPalindrom() {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        if (t.charAt(0) == t.charAt(t.length() - 1)) {
            System.out.println("It is a palindrom");
        } else {
            System.out.println("It isn't a palindrom");
        }
    }

    public static void countLetters() {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (Character.isLetter(t.charAt(i))) {
                count++;
            }
        }
        System.out.println("Anzahl der Buchstaben: " + count);
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        char letter;
        String reverse = "";
        for (int i = 0; i < t.length(); i++) {
            letter= t.charAt(i);
            reverse = letter + reverse;
        }
        System.out.println(reverse);
    }

    public static void getAmountofWords() {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        String [] word = t.split("\\s+");
        System.out.println("Anzahl der Wörter: " + word.length);
    }

    public static void end() {
        System.exit(0);
    }
}