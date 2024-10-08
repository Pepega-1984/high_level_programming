package org.example;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int month = 2; // Номер месяца 2=Февраль
        int year = 2024; // год, чтобы определить високостный он или нет

        int daysInMonth = getDaysInMonth(month, year);

        System.out.println("Количество дней в " + getMonthName(month) + " " + year + " году: " + daysInMonth);
    }

    public static int getDaysInMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); 

        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        return monthNames[month - 1];
    }
}