package at.berke.projects.atm;

import at.berke.projects.atm.Account;

import java.util.Scanner;

public class CashMachine {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        options();
    }


    public static void options() {
        Account berke = new Account();
        berke.setBankbalance(500);

        while (true) {
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                int amountplus = scanner.nextInt();
                System.out.println("Sie haben " + amountplus + " eingezahlt!");
                berke.setBankbalance(berke.getBankbalance() + amountplus);
            }

            if (selection == 2) {
                System.out.println("Wieviel würden Sie gerne abheben?");
                int amountminus = scanner.nextInt();
                System.out.println("Sie haben " + amountminus + " abgehoben!");
                berke.setBankbalance(berke.getBankbalance() - amountminus);
            }

            if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt " + berke.getBankbalance());
            }

            if (selection == 4) {
                System.out.println("Die Maschine wurde beendet!");
                break;
            }
        }
    }
}
