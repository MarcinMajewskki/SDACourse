package org.example.strings.oop_excercises_SDA.exceptions.book_repository;

import java.util.ArrayList;
import java.util.Iterator;

public class BookRepository {
    ArrayList<Book> allBooks = new ArrayList<>();


    public void addNewBook(String title, String author, int isbn) {
        Book book = new Book(isbn, title, author);
        allBooks.add(book);
        System.out.println("You've successfully added new book!");
    }

    public Book findBook(String title) throws NoBookFoundException {
        Iterator<Book> iterator = allBooks.iterator();
        while (iterator.hasNext()) {
            Book tempBook = iterator.next();
            if (tempBook.getTitle().equals(title)) {
                System.out.println("I found !!");
                return tempBook ;
            }
        }
        throw new NoBookFoundException(title);
    }

    public Book findBook(int id) throws NoBookFoundException {
        Iterator<Book> iterator = allBooks.iterator();
        while (iterator.hasNext()) {
            Book tempBook = iterator.next();
            if (tempBook.getIsbn() == id) {
                System.out.println("I found !!");
                return tempBook ;
            }
        }
        throw new NoBookFoundException(id);
    }
    public void removeBook(int id) throws NoBookFoundException {
        Book book = findBook(id);
        allBooks.remove(book);
        System.out.println("Successfully removed : " + book);
    }
    public void printAvailableBooks(){
        for (Book currBook : allBooks) {
            System.out.println(currBook);
        }
    }
}

