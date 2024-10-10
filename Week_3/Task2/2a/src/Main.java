package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту пирамиды: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        scanner.close();
    }
}
