package at.berke.projects.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        dice();
    }

    public static void dice() {
        System.out.println("Geben Sie die Zahl 1 ein um das Spiel zu starten!");
        int selection = scanner.nextInt();
        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(30) + 6;
            int numberPlayer = random.nextInt(30) + 6;

            System.out.println("Der Computer hat die Zahl " + randomNumber + " gewürfelt!");
            System.out.println("Der Spieler hat die Zahl " + numberPlayer + " gewürfelt!");

            if (selection == 1) {
                if (randomNumber > numberPlayer) {
                    System.out.println("Der Computer hat gewonnen!");
                } else if (randomNumber == numberPlayer) {
                    System.out.println("Es ist ein Unentschieden!");
                } else {
                    System.out.println("Der Spieler hat gewonnen!");
                } break;
            }
        }
    }
}
