package com.tomashesvkyi.scbam.Utils;

import java.util.Scanner;

public class ConsoleLineCenter {

    public static void printGreetings() {
        System.out.println("―――――――――――――――――");
        System.out.println("|\u001B[31m  AUTHORIZE USAGE ONLY  \u001B[0m|");
        System.out.println("|------------------------|");
        System.out.println("|  \u001B[1m \u001B[34m  WELCOME TO THE    \u001B[0m |");
        System.out.println("|   \u001B[1m     \u001B[32mS\u001B[36mC\u001B[93m(b)\u001B[35mA\u001B[94mM       \u001B[0m  |");
        System.out.println("|------------------------|");
        System.out.println("|\u001B[1m\u001B[32mS-Simple               \u001B[0m |");
        System.out.println("|\u001B[1m\u001B[36mC-Console               \u001B[0m|");
        System.out.println("|\u001B[1m\u001B[93mb-bank                  \u001B[0m|");
        System.out.println("|\u001B[1m\u001B[35mA-Application           \u001B[0m|");
        System.out.println("|\u001B[1m\u001B[94mM-Manager               \u001B[0m|");
        System.out.println("―――――――――――――――――");
        System.out.println();
    }

    public static void fakeLoad() {
        try {
            Thread.sleep(1000);
            System.out.println("Loading...");
            Thread.sleep(1000);
            System.out.println("33%...");
            Thread.sleep(1000);
            System.out.println("67%...");
            Thread.sleep(1000);
            System.out.println("100%");
            Thread.sleep(300);
            System.out.println();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printChooseMenuClients() {
        System.out.println("――――――――――――――――――――");
        System.out.println("|        Choose option        |");
        System.out.println("|-----------------------------|");
        System.out.println("|1. Show list of clients      |");
        System.out.println("|2. Find clients              |");
        System.out.println("|3. Add clients               |");
        System.out.println("|4. Sort clients              |");
        System.out.println("|5. Work with current client  |");
        System.out.println("|6. Save                      |");
        System.out.println("|7. Exit                      |");
        System.out.println("――――――――――――――――――――");
        System.out.print("|Choose an option:");
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void freezeOutput() {
        System.out.println("Press Enter to continue...");
        Scanner localScanner = new Scanner(System.in);
        localScanner.nextLine();

    }

    public static boolean askToAnotherOne() {
        System.out.println("You want add another one?(true or false)");
        Scanner localScanner = new Scanner(System.in);
        return localScanner.nextBoolean();
    }

    public static int askHowToFind() {
        System.out.println("|1.Find by name           |");
        System.out.println("|2.Find by ID             |");
        Scanner localScanner = new Scanner(System.in);
        return localScanner.nextInt();
    }

    public static int askHowToSort() {
        System.out.println("―――――――――――――――――――――――――――――――――――");
        System.out.println("|\u001B[31m  ATTENTION! SORTING WILL CHANGE THE ID OF CLIENTS  \u001B[0m|");
        System.out.println("|1.Sort by name ASC                                  |");
        System.out.println("|2.Sort by name DESC                                 |");
        System.out.println("|3.Sort by money ASC                                 |");
        System.out.println("|4.Sort by money DESC                                |");
        System.out.println("|5.Sort by total transactions ASC                    |");
        System.out.println("|6.Sort by total transactions DESC                   |");
        Scanner localScanner = new Scanner(System.in);
        return localScanner.nextInt();
    }

    public static int askWhatToDoWithClient() {
        System.out.println("|1. Delete current client |");
        System.out.println("|2. Show all transactions |");
        System.out.println("|3. Withdraw              |");
        System.out.println("|4. Replenishment         |");

        Scanner localScanner = new Scanner(System.in);
        int result = localScanner.nextInt();
        if(result<1 || result>4) return askWhatToDoWithClient();
        else return result;
    }

}


