package com.tomashesvkyi.scbam.Client;

import com.tomashesvkyi.scbam.Transaction.Transaction;
import com.tomashesvkyi.scbam.Transaction.TransactionType;

import java.util.ArrayList;

public class Client {
    ArrayList<Transaction> transactions = new ArrayList<>();
    private String nameOfClient;
    private double amountOfMoney;

    public String getNameOfClient() {
        return nameOfClient;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public int getTransactionsSize() {
        return transactions.size();
    }

    public Client(String name, double money){
        nameOfClient = name;
        amountOfMoney = money;
    }

    public void withdraw(double amount){
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount));
        amountOfMoney -= amount;
    }

    public void replenishment(double amount){
        transactions.add(new Transaction(TransactionType.REPLENISHMENT, amount));
        amountOfMoney += amount;
    }

}
