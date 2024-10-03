package org.example;

public class Main {
    public static void main(String[] args) {
        // Create instances of the Book class
        Book book1 = new Book("Java Програмирование", "John Doe", 500, 49.99);
        Book book2 = new Book("Python Основы", "Jane Smith", 300, 29.99);
        Book book3 = new Book("C++", "Bob Johnson", 400, 39.99);

        // Print the data of each book
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Pages: " + book1.getPages());
        System.out.println("Price: " + book1.getPrice());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Pages: " + book2.getPages());
        System.out.println("Price: " + book2.getPrice());

        System.out.println("\nBook 3:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Pages: " + book3.getPages());
        System.out.println("Price: " + book3.getPrice());
    }
}