package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,10,0,10,3,7,4,5,-4,-8,-9};
        System.out.println(countMax(myArray));
    }
    public static int countMax(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        int count = 0;
        for (int number: array) {
            if (number > max) {
                max = number;
            }
        }
        for (int number: array) {
            if (number == max) {
                count++;
            }
        }
        return count;
    }
}