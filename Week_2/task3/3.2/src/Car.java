package org.example;

public class Car {
    private String model;
    private Engine engine;
    private Passenger passenger1;
    private Passenger passenger2;
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public void addPassenger(Passenger passenger) {
        Passenger newPassenger = null;
        if (passenger1 == null) {
            passenger1 = passenger;
            newPassenger = passenger1;
        } else if (passenger2 == null) {
            passenger2 = passenger;
            newPassenger = passenger2;
        }
        System.out.printf(newPassenger != null ? "%s зашел\n" : "Нет места для %s\n", passenger.getName());
    }
    public void removePassenger(Passenger passenger) {
        Passenger removedPassenger = null;
        if (passenger1 == passenger) {
            removedPassenger = passenger1;
            passenger1 = null;
        } else if (passenger2 == passenger) {
            removedPassenger = passenger2;
            passenger2 = null;
        }
        System.out.printf(removedPassenger != null ? "%s вышел\n" : "%s нет в машине\n", passenger.getName());
            }
    public String toString() {
        return String.format("""
                        Места в машине %s (%d):
                        - %s
                        - %s""",
                model,
                engine.getPower(),
                passenger1 == null ? "пусто" : passenger1.getName(),
                passenger2 == null ? "пусто" : passenger2.getName());
    }
}




