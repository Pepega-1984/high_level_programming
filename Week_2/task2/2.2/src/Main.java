package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("2300 3050 1000 3300",2500.59);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(Double.parseDouble(args[0]));
        System.out.println("На № " + bankAccount.getAccountNumber() + " добавленно " + args[0] +" руб\n" +"Доступно " + bankAccount.getBalance());

        bankAccount.withdraw(Double.parseDouble(args[1]));
        System.out.println("C № " + bankAccount.getAccountNumber() + " снято " + args[0] +" руб\n" +"Доступно " + bankAccount.getBalance());
    }

}