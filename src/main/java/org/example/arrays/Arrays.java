package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    //        Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
    //        Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
    //        Tablica wyjściowa: [20, 30, 40, 50]

    public static int[] removeDuplicatesInArr(int[] intArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < intArr.length; i++) {
            if (!arrayList.contains(intArr[i])) {
                arrayList.add(intArr[i]);
            }
        }
        
        int[] withoutDuplicates = new int[arrayList.size()];
        for (int i = 0; i < withoutDuplicates.length; i++) {
            withoutDuplicates[i] = arrayList.get(i);
        }
        return withoutDuplicates;
    }
    public static void printArr(int[] intArr){
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}

