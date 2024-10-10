package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        double alpha = number / 2.0;
        double e = 1e-6;
        while (Math.abs(alpha * alpha - number) > e) {
            alpha = (alpha + number / alpha) / 2.0;
        }
        System.out.println("√" + number + "≈" + alpha);

        scanner.close();
    }
}
