package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author tholstoy =new Author("Л.Н.Толстой", 1828);
        Author gogol = new Author("Н.В.Гоголь",1809);

        Book warandpeace = new Book(tholstoy,"Война и Мир");
        System.out.println(warandpeace);
        Book AnnaKarenina = new Book(tholstoy,"Анна Каренина");
        System.out.println(AnnaKarenina);
        Book revisor = new Book(gogol, "Ревизор");
        System.out.println(revisor);
        Book plaers = new Book(gogol,"Игроки");
        System.out.println(plaers);
    }
}