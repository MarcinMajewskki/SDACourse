package org.example.strings.oop_excercises_SDA.exceptions.book_repository;

public class Main{
    public static void main(String[] args) throws NoBookFoundException {

        BookRepository bookRepository = new BookRepository();

        bookRepository.addNewBook("Krzyzacy","H.Sienkiewicz",1);
        bookRepository.addNewBook("Harry Potter Part 1","J.K Rowling",2);
        bookRepository.addNewBook("Harry Potter Part 2","J.K Rowling",3);
        bookRepository.addNewBook("Harry Potter Part 3","J.K Rowling",4);
        bookRepository.addNewBook("A Game of Thrones","George R. R. Martin",5);
        bookRepository.addNewBook("A Storm of Swords","George R. R. Martin",6);


        bookRepository.printAvailableBooks();

        System.out.println(bookRepository.findBook("Krzyzacy1"));
        System.out.println(bookRepository.findBook(1));
        System.out.println(bookRepository.findBook(2));

        bookRepository.removeBook(3);

        bookRepository.printAvailableBooks();

    }
}
