package at.berke.projects.test;

import java.util.Scanner;

public class CoffeMachine {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        options();
    }

    public static void options() {
        Value coffee1 = new Value();
        coffee1.setWatertank(1000);
        coffee1.setCoffeebeans(100);



        while (true) {
            System.out.println("1. Einschalten");
            System.out.println("2. Größe einstellen in ml");
            System.out.println("3. Stärke einstellen");
            System.out.println("4. Wasser nachfüllen");
            System.out.println("5. Bohnen nachfüllen");
            System.out.println("6. Kaffee rauslassen");
            System.out.println("7. Ausschalten");

            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Die Maschine wurde eingeschaltet");
            }

            if (selection == 2) {
                System.out.println("Wie groß wollen Sie Ihren Kaffe haben? (40-200ml)");
                coffee1.setSize(scanner.nextInt());
                if (coffee1.getSize() >= 40 && coffee1.getSize() <= 200) {
                    System.out.println("Sie haben die Größe " + coffee1.getSize() + " ausgewählt");
                } else {
                    System.out.println("Der Kaffee ist zu groß oder zu klein!");
                }
            }

            if (selection == 3) {
                System.out.println("Wie stark wollen Sie Ihren Kaffe haben? (1-10)");
                coffee1.setStrength(scanner.nextInt());
                if (coffee1.getStrength() >= 1 && coffee1.getStrength() <= 10) {
                    System.out.println("Sie haben die Stärke " + coffee1.getStrength() + " ausgewählt");
                }else {
                    System.out.println("Der Kaffe ist zu wenig stark oder zu stark!");
                }

            }

            if (selection == 4) {
                System.out.println("Wie viel ml Wasser wollen Sie nachfüllen?");
                int amountwater = scanner.nextInt();
                System.out.println("Sie haben " + amountwater + " ml nachgefüllt");
                coffee1.setWatertank(coffee1.getWatertank()+amountwater);
            }

            if (selection == 5) {
                System.out.println("Wie viel Bohnen wollen Sie nachfüllen?");
                int amountbeans = scanner.nextInt();
                System.out.println("Sie haben " + amountbeans + " nachgefüllt");
                coffee1.setCoffeebeans(coffee1.getCoffeebeans()+amountbeans);
            }

            if (selection == 6) {
                if (coffee1.getWatertank() >= coffee1.getSize() && coffee1.getCoffeebeans() >= coffee1.getStrength()) {
                    System.out.println("Es wurde ein Kaffe mit der Stärke " + coffee1.getStrength() + " und mit der Größe " + coffee1.getSize() + " rausgelassen");
                    coffee1.setWatertank(coffee1.getWatertank()- coffee1.getSize());
                    coffee1.setCoffeebeans(coffee1.getCoffeebeans()-coffee1.getStrength());
                    System.out.println("Es sind noch " + coffee1.getCoffeebeans() + " Bohnen vorhanden");
                    System.out.println("Es sind noch " + coffee1.getWatertank() + " ml im Tank vorhanden");
                } else {
                    System.out.println("Es ist nicht genügend Wasser im Tank drinnen oder es sind zu wenig Bohnen vorhanden. Bitte füllen sie es nach!");
                }
            }

            if (selection == 7) {
                System.out.println("Die Maschine wurde beendet!");
                break;
            }
        }
    }
}
