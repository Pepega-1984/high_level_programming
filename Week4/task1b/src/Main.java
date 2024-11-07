package org.example;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string >> ");
        String input = scanner.nextLine();

        scanner.close();

        Entropy entropy = new Entropy();

        System.out.printf("%.2f\n", entropy.calculateShannon(input));
    }
}