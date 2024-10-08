package org.example;

public class Main {
    public static void main(String[] args) {
        int dayOfWeek = Integer.parseInt((args[0])); // номер дня недели
        String temperature = "тепло";
        String precipitation = "ясно";
        boolean wind = false;
        String humidity = "низкая";

        boolean playBadminton = wantToPlayBadminton(dayOfWeek, temperature, precipitation, wind, humidity);

        System.out.println("Хочу играть в бадминтон: " + (playBadminton ? "Да" : "Нет"));
    }

    public static boolean wantToPlayBadminton(int dayOfWeek, String temperature, String precipitation, boolean wind, String humidity) {
        if (dayOfWeek != 1) {
            return false;
        }

        switch (temperature) {
            case "жарко":
            case "тепло":
                break;
            default:
                return false;
        }

        switch (precipitation) {
            case "ясно":
            case "облачно":
                break;
            default:
                return false;
        }

        if (wind) {
            return false;
        }

        switch (humidity) {
            case "низкая":
                break;
            default:
                return false;
        }

        return true;
    }
}