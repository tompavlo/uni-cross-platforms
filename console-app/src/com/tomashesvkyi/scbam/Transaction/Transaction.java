package com.tomashesvkyi.scbam.Transaction;

import java.time.LocalDateTime;

public class Transaction {
    LocalDateTime dateOfOperation;
    TransactionType transactionType;
    double amount;

    public Transaction(TransactionType transactionType, double amount) {
        dateOfOperation = LocalDateTime.now();
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return STR."""
Date of operation: \{dateOfOperation.toString()}
Transaction.Transaction type: \{transactionType.name()}
Amount: \{amount}""";
    }
}
