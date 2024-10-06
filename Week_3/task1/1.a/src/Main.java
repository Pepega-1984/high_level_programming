package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scaner.nextInt();
        if (age % 10 == 1){
            System.out.println(age+" год");
        }
        else if (((age % 10) >= 2) && ((age % 10) <= 4)) {
            System.out.println(age+" года");
        }
        else if ((((age % 10) >= 5) || ((age % 10) == 0)) && ((age %100) >=11) || ((age % 100) <= 20)) {
            System.out.println(age + " лет");
        }
    }
}