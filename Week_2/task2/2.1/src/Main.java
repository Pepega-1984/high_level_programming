package org.example;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vania D.",LocalDateTime.of(2000,Month.APRIL,5,4,50), "Math", 12345, 4.9);
        Student student2 = new Student("Sasha M.", LocalDateTime.of(1999,Month.FEBRUARY,2,9,43), "Physics", 67890, 4.5);
        Student student3 = new Student("Lesha F.",LocalDateTime.of(2001,Month.AUGUST,12,4,23), "IT", 34567, 4.2);

        System.out.println("Student 1: " + student1.toString());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Is excellent student: " + student1.isExcellentStudent());

        System.out.println("Student 2: " + student2.toString());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Is excellent student: " + student2.isExcellentStudent());

        System.out.println("Student 3: " + student3.toString());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Is excellent student: " + student3.isExcellentStudent());
    }
}