package com.tomashesvkyi.scbam.Client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tomashesvkyi.scbam.Transaction.Transaction;
import com.tomashesvkyi.scbam.Transaction.TransactionType;

import java.util.ArrayList;

public class Client {
    ArrayList<Transaction> transactions = new ArrayList<>();
    private String nameOfClient;
    private double amountOfMoney;

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    @JsonIgnore
    public int getTransactionsSize() {
        return transactions.size();
    }

    public Client(String name, double money){
        nameOfClient = name;
        amountOfMoney = money;
    }

    public Client(){}

    public void withdraw(double amount){
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount));
        amountOfMoney -= amount;
    }

    public void replenishment(double amount){
        transactions.add(new Transaction(TransactionType.REPLENISHMENT, amount));
        amountOfMoney += amount;
    }

}
