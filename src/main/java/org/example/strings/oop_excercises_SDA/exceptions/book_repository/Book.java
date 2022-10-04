package org.example.strings.oop_excercises_SDA.exceptions.book_repository;

public class Book {
    private int isbn;
    private String title;
    private String  author;
    private int releaseYear;

    public Book() {
        this.isbn = 0;
        this.title = "empty";
        this.author = "empty";
        this.releaseYear = 0;
    }

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
