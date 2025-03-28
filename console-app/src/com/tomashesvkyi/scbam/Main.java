package com.tomashesvkyi.scbam;

import com.tomashesvkyi.scbam.Client.ClientRepository;
import com.tomashesvkyi.scbam.Utils.ConsoleLineCenter;
import com.tomashesvkyi.scbam.jsonmapper.JsonMapper;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner command = new Scanner(System.in);
        ClientRepository clientRepository = new ClientRepository();
        JsonMapper jsonMapper = new JsonMapper(clientRepository);
        ConsoleLineCenter.printGreetings();
        ConsoleLineCenter.fakeLoad();
        try{
            jsonMapper.load();
            System.out.println("Data was successfully loaded!");
        }
        catch (IOException e){
            System.out.println("Error while loading data " + e.getMessage());
            System.exit(-1);
        }
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
                    try {
                        jsonMapper.save();
                        System.out.println("Data was successfully write!");
                    }
                    catch (IOException e){
                        System.out.println("Failed to save " + e.getMessage());
                    }
                    ConsoleLineCenter.freezeOutput();
                    ConsoleLineCenter.clearConsole();
                    ConsoleLineCenter.printChooseMenuClients();
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