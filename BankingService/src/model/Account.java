package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance = 0;
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount) {
        validateAmount(amount);
        balance += amount;
        transactions.add(new Transaction(LocalDate.now(), amount, balance));
    }

    public void withdraw(int amount) {
        validateAmount(amount);

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;
        transactions.add(new Transaction(LocalDate.now(), -amount, balance));
    }

    public void printStatement() {
        System.out.println("DATE | AMOUNT | BALANCE");

        for (Transaction transaction : transactions) {
            System.out.println(
                    transaction.getDate() + " | " +
                            transaction.getAmount() + " | " +
                            transaction.getBalance()
            );
        }
    }

    private void validateAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
