package org.example;

public class Repetitions {
    public static String removeCharacters(String input) {
        return input.replaceAll("(.)\\1{2,}","$1");
    }
}
