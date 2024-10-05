package org.example;

public class Engine {
    private int power;
    public Engine(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        if (power <= 0) {
            System.out.println("Мощность должна быть больше 0");
        } else {
            this.power = power;
        }
    }
}
