package org.example;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: java Main Radius"); //Если фргумента нет, то он возвращает ошибку
                    return;
        }
        double radius= Double.parseDouble(args[0]);
        Octagon octagon = new Octagon(radius);
        System.out.printf("Восьмиугольник: \n" +
                        "- радиус вписанной окружности=%.2f см\n" +
                        "- периметр=%.2f см\n" +
                        "- площадь=%.2f см^2\n",
                octagon.getInnerRadius(),octagon.getPerimeter(), octagon.calculateArea());
        }

    }