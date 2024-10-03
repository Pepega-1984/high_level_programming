package org.example;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    public Book() {}
    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public int getPages() {
    return pages;
}

public double getPrice() {
    return price;
}
public void setTitle(String title) {
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setPages(int pages) {
    this.pages = pages;
}

public void setPrice(double price) {
    this.price = price;
}
}
