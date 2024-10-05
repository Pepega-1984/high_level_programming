package org.example;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Сумма снятия должна быть положительной");
            return;
        }
        if (amount > balance) {
            System.out.println("Недостаточно средств\n" + amount + '\n' + "На счету №" + accountNumber);
            return;
        }

        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
