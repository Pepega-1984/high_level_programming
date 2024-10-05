package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Reno Megan", new Engine(135));
        System.out.println(car);

        Passenger plushkin = new Passenger("Плюшкин И.И.");
        Passenger Vanechkin = new Passenger("Ванечкин В.Ю.");

        car.addPassenger(plushkin);
        car.addPassenger(Vanechkin);
        System.out.println(car);

        car.removePassenger(plushkin);
        System.out.println(car);
    }
}