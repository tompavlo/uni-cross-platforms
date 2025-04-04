package com.tomashesvkyi.scbam.Client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tomashesvkyi.scbam.Transaction.Transaction;
import com.tomashesvkyi.scbam.jsonmapper.JsonMapper;

import java.util.*;


public class ClientRepository {


    ArrayList<Client> clientList = new ArrayList<>();
    Client curClient = null;
    JsonMapper jsonMapper;

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }


    public ClientRepository(JsonMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }


    public void createClient() {
        System.out.println("Enter name and surname of client");
        Scanner scanner = new Scanner(System.in);
        String clientName = scanner.nextLine();
        System.out.println("Input initial amount of client's money");
        double money = scanner.nextDouble();
        Client client = new Client(clientName, money);
        addClient(client);
    }

    public Client getCurrentClient() {
        return curClient;
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void printAllClients() {
        int i = 1;
        for (Client client : clientList) {
            System.out.println("№" + i);
            System.out.println("Name: " + client.getNameOfClient());
            System.out.println("Amount of money: " + client.getAmountOfMoney());
            ++i;
        }
    }


    public void decideWhatToDoWithClient(int nav) {
        Scanner localScanner = new Scanner(System.in);
        switch (nav) {
            case 1:
                clientList.remove(curClient);
                curClient = null;
                break;
            case 2:
                for (Transaction transaction : curClient.transactions) {
                    System.out.println(transaction.toString());
                }
                break;
            case 3:
                double amount;
                do {
                    System.out.println("Input amount to withdraw");
                    amount = localScanner.nextDouble();
                } while (amount > curClient.getAmountOfMoney() || amount < 0);
                curClient.withdraw(amount);
                System.out.println("$" + amount + " were successfully withdrawed");
                System.out.println("Current balance " + curClient.getAmountOfMoney());
                break;
            case 4:
                double amountToRepl;
                do {
                    System.out.println("Input amount to replenish");
                    amountToRepl = localScanner.nextDouble();
                } while (amountToRepl < 0);
                curClient.replenishment(amountToRepl);
                System.out.println("$" + amountToRepl + " were successfully replenished");
                System.out.println("Current balance " + curClient.getAmountOfMoney());
                break;
        }
    }

    public boolean findById(int id) {
        if (id - 1 >= clientList.size()) {
            return false;
        } else {
            curClient = clientList.get(id - 1);
            System.out.println("Your current clients is " + curClient.getNameOfClient());
            return true;
        }
    }

    public boolean findByName(String name) {
        for (Client client : clientList) {
            if (client.getNameOfClient().equals(name)) {
                System.out.println("Your client was successfully found!");
                curClient = client;
                return true;
            }
        }
        return false;
    }

    public void printCurClient() {
        System.out.println(curClient.getNameOfClient());
        System.out.println("Total money: " + curClient.getAmountOfMoney());
    }

    public void chooserOfSorting(int option) {
        switch (option) {
            case 1:
                clientList.sort(Comparator.comparing(Client::getNameOfClient));
                break;
            case 2:
                clientList.sort(Comparator.comparing(Client::getNameOfClient).reversed());
                break;
            case 3:
                clientList.sort(Comparator.comparing(Client::getAmountOfMoney));
                break;
            case 4:
                clientList.sort(Comparator.comparing(Client::getAmountOfMoney).reversed());
                break;
            case 5:
                clientList.sort(Comparator.comparing(Client::getTransactionsSize));
                break;
            case 6:
                clientList.sort(Comparator.comparing(Client::getTransactionsSize).reversed());
                break;
        }
    }


}

