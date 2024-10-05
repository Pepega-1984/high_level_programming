package org.example;

public class Book {
    private Author author;
    private String title;
    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
