package com.tomashesvkyi.scbam.Transaction;

import java.time.LocalDateTime;

public class Transaction {
    LocalDateTime dateOfOperation;
    TransactionType transactionType;
    double amount;

    public void setDateOfOperation(LocalDateTime dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateOfOperation() {
        return dateOfOperation;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public Transaction(TransactionType transactionType, double amount) {
        dateOfOperation = LocalDateTime.now();
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Transaction(){}

    @Override
    public String toString() {
        return STR."""
Date of operation: \{dateOfOperation.toString()}
Transaction.Transaction type: \{transactionType.name()}
Amount: \{amount}""";
    }
}
