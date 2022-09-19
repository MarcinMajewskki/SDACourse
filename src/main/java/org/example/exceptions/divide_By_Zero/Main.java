package org.example.exceptions.divide_By_Zero;

public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
    double x = 12.6d;
    double y = 0.0d;

    divide(x,y);

    }

    public static double divide(double x, double y)
            throws CannotDivideBy0Exception {
        if (y == 0) {
            throw new CannotDivideBy0Exception();
        } else {
            return x / y;
        }
    }
}
