package org.example.exceptions.book_repository;

public class NoBookFoundException extends Exception{
    int id;
    String name;

    public NoBookFoundException(int id){
        super("Cannot find book of index : " + id);
    }
    public NoBookFoundException(String name){
        super("Cannot find book of title : " + name);
    }

}
