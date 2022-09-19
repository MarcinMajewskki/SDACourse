package org.example.arrays;

public class Main {
    public static void main(String[] args) {
//        Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
//        Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
//        Tablica wyjściowa: [20, 30, 40, 50]
//
//        ------------------------------------------------------------------------------------------------------
//
//                Napisz program obliczający różnicę pomiędzy największą i najmniejszą wartością z tablicy.
//        Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
//        wynik: 50 - 20 = 30
//
//                ------------------------------------------------------------------------------------------------------
//
//        Napisz program, który odwróci zawartość tablicy, np.
//
//    [1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
//    [1, 2, 5, 3, 10] -> [10, 3, 5, 2, 1]
//
//        ------------------------------------------------------------------------------------------------------
//
//                Zadanie
//
//        Napisać program, który wczytuje od użytkownika ciąg znaków,
//                a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
//                Przykład, dla ciągu „Abrakadabra" program powinien wyświetlić 4,
//        ponieważ ostatnim znakiem jest literka „a", która występuje w podanym ciągu łącznie 4 razy.
//
//
//                ------------------------------------------------------------------------------------------------------
//
//                - Zdeklaruj zmienną "fahrenheitTemp" typu float a następnie
//        przekształć ta wartosc na stopnie Celsjusza i przypisz do zmiennej "celsiusTemp".
//
//                Wzory:
//        ---------------------
//°C = (°F - 32) × 5/9
//
//°F = °C × (9/5) + 32
//                ---------------------
//
//
//                - Napisz prosty converter temperatury.
//                - Zapytaj o rodzaj konwersji °F to °C lub °C to °F.
//                - Pobierz wartość float jako input uzytkownika.
//        - Wyświetl wynki konwersji.
//
//
//        ------------------------------------------------------------------------------------------------------
//
//
//                Korzystając z StringBuilder napisz program, który wczytuje od użytkownika ciąg znaków,
//                a następnie tworzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
//        Przykładowo, dla łańcucha „Kot" wynikiem powinien być łańcuch „toK".
//
//                ------------------------------------------------------------------------------------------------------
//
//        Napisz program, który oblicza wartość współczynnika BMI (ang. Body Mass Index)
//
//        ---------------------------
//                Wzór: waga/wzrost^2
//                ---------------------------
//
//                Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje "waga prawidłowa",
//                jeżeli poniżej to "niedowaga", jeżeli powyżej "nadwaga".
//
//                ------------------------------------------------------------------------------------------------------
//
//        Sprawdź czy data ma poprawny format dzień-miesiąc-rok, np. 01-01-2020 uwzględniające walidację dni miesiąca i wartości miesiące
//
//                ------------------------------------------------------------------------------------------------------
//
//        Napisz program który wyświetli zadaną datę w formacie:
//-> godzina::minuta dzien-miesiąc-rok
//                -> hh:mm:ss a dzien miesiąc rok
        int[] intArr = {20, 20, 30, 40, 50, 50, 50};
        Arrays.printArr(intArr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Arrays.printArr(Arrays.removeDuplicatesInArr(intArr));
    }
}
