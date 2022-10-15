package org.example.SDAExercises1;


//        Baza Danych Sklepu z Grami Komputerowymi
//        Napisz program, który służy jako baza danych sklepu z grami komputerowymi.
//        Każda gra komputera ma tytuł, gatunek, rok wydania i ilość sprzedanych egzemplarzy.
//        Program powinien wspierać przechowywanie danych w plikach.
//        Ponadto program powinien wspierać tzw kwerendy, czyli zapytania do bazy danych
//        (każda kwerenda ma nazwę, typ zwrotny i swoją logikę).
//        Przykładowe kwerendy:
//
//        Jaki jest tytuł najlepiej sprzedającej się gry?
//        Ile jest gier z gatunku Platformer?
//        Która gra miała najgorszą sprzedaż w roku 2010?
//


import java.util.ArrayList;
import java.util.List;

public class Main implements Oldest, Newest, LowestSold, MostSold {
    public static void main(String[] args) {

//        ArrayList<Game> games = new ArrayList<>();
//        games.add(new Game("Fifa10" , "Sports game" , 2009 , 20009));
//        games.add(new Game("Fifa11" , "Sports game" , 2010 , 20010));
//        games.add(new Game("Fifa12" , "Sports game" , 2011 , 20011));
//        games.add(new Game("Fifa13" , "Sports game" , 2012 , 20012));
//        games.add(new Game("Fifa14" , "Sports game" , 2013 , 20013));
//        games.add(new Game("Witcher 3", "RPG", 2015,1092090));
//        games.add(new Game("SMTHG","IDK",2020,910909));

        ArrayList<Game> temp = new ArrayList<>(List.copyOf(FileManage.readFromFile("files\\gamelist.txt")));

        System.out.println(Oldest.isTheOldest(temp));
        System.out.println(Newest.isTheNewest(temp));
        System.out.println(LowestSold.isTheLowestSold(temp));
        System.out.println(MostSold.isTheMostSold(temp));


    }

}
