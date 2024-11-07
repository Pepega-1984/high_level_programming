package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email adress >> ");
        String emailAdress = scanner.nextLine();
        scanner.close();
        System.out.println();

        if (Email.isEmail(emailAdress)) {
            System.out.println("Correct email adress!");
        } else {
            System.out.println("Incorrect email adress!");
        }
    }
}