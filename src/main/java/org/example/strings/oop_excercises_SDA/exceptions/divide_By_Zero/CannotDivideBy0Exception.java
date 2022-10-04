package org.example.exceptions.divide_By_Zero;

public class CannotDivideBy0Exception extends Exception{
    public CannotDivideBy0Exception(){
        super("You cannot divide by 0!");
    }
}
