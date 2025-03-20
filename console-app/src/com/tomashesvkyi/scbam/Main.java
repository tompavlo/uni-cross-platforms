package com.tomashesvkyi.scbam;

import com.tomashesvkyi.scbam.Client.ClientRepository;
import com.tomashesvkyi.scbam.Utils.ConsoleLineCenter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner command = new Scanner(System.in);
        ClientRepository clientRepository = new ClientRepository();
        ConsoleLineCenter.printGreetings();
        ConsoleLineCenter.fakeLoad();
        ConsoleLineCenter.printChooseMenuClients();
        boolean running = true;
        while (running) {
            switch (command.nextLine()) {
                case "1":
                    clientRepository.printAllClients();
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
                    break;
                case "2":
                    int howToFind = ConsoleLineCenter.askHowToFind();
                    if (howToFind == 1) {
                        System.out.println("Enter full name");
                        if (!clientRepository.findByName(command.nextLine())) {
                            System.out.println("Incorrect name");
                        } else {
                            clientRepository.printCurClient();
                            clientRepository.decideWhatToDoWithClient(ConsoleLineCenter.askWhatToDoWithClient());
                        }
                    } else if (howToFind == 2) {
                        System.out.println("Enter ID");
                        if (!clientRepository.findById(command.nextInt())) {
                            System.out.println("Incorrect ID");
                        } else {
                            clientRepository.printCurClient();
                            clientRepository.decideWhatToDoWithClient(ConsoleLineCenter.askWhatToDoWithClient());
                        }
                    } else {
                        System.out.println("Incorrect input!");
                    }
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
                    break;
                case "3":
                    do {
                        clientRepository.createClient();
                    } while (ConsoleLineCenter.askToAnotherOne());
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
                    break;
                case "4":
                    int chosen = ConsoleLineCenter.askHowToSort();
                    if (chosen > 6) {
                        System.out.println("Incorrect input!");
                    } else {
                        clientRepository.chooserOfSorting(chosen);
                        System.out.println("Sorted");
                    }
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
                    break;
                case "5":
                    if (clientRepository.getCurrentClient() == null) {
                        System.out.println("ERROR! NO CURRENT CLIENT");
                    } else {
                        clientRepository.printCurClient();
                        clientRepository.decideWhatToDoWithClient(ConsoleLineCenter.askWhatToDoWithClient());
                    }
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
                    break;
                case "6":
                    break;
                case "7":
                    running = false;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    System.out.println("Rebooting...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();

            }
        }

    }
}