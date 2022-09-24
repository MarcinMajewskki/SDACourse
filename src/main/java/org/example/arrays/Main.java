package org.example.arrays;

public class Main {
    public static void main(String[] args) {
//        Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
//        Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
//        Tablica wyjściowa: [20, 30, 40, 50]
//

        int[] intArr = {20, 20, 30, 40, 50, 50, 50};
        Arrays.printArr(intArr);

        System.out.println();
        System.out.println();
        System.out.println();

        Arrays.printArr(Arrays.removeDuplicatesInArr(intArr));
    }
}
