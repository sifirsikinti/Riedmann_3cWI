package at.berke.projects.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Random random = new Random();
        int randomName = random.nextInt(5);
        int max_tries = 8;

        ArrayList<String> list = new ArrayList<String>();

        list.add("Berke");
        list.add("Manuel");
        list.add("Paul");
        list.add("Aaron");
        list.add("Marc");
        list.add("Milian");

        System.out.println(list.get(randomName));
    }
}
