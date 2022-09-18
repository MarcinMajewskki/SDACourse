package org.example.stringi;

public class Main {
    public static void main(String[] args) {
//        Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (https://pl.wikipedia.org/wiki/Szyfr_Cezara)
//
//        Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
//        Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ

        String str = "MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG";

        String encrypted = Cezar.encrypt(str);
        System.out.println(encrypted);
        System.out.println(Cezar.decrypt(encrypted));



        System.out.println(StringCheck.getStringLength("Ewa"));

        System.out.println(StringCheck.compareTwoStrings("Ewa","Ela"));

        System.out.println(StringCheck.compareTwoStrings("Ewa","Eka"));

        System.out.println(StringCheck.compareTwoStrings("Eka","Ela"));

        System.out.println(StringCheck.checkIfStartsWith("Ewa",'E'));

        System.out.println(StringCheck.checkIfStartsWith("Ewa",'e'));

        System.out.println(StringCheck.checkIfEndsWith("Ewa",'A'));

        System.out.println(StringCheck.checkIfEndsWith("Ewa",'a'));

        System.out.println(StringCheck.letterAlphIndex('B'));

        System.out.println(StringCheck.makeItToCharArr("Ewa"));

        System.out.println(StringCheck.changeLetters("Pszczola",'c','s'));

        System.out.println(StringCheck.getPartOfString("EloEloElo",3,5));

          System.out.println(StringCheck.removeWhiteSigns("Ala ma kota !"));

        System.out.println(StringCheck.getReverseString("Ala ma kota!"));

    }
}
