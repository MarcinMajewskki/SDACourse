package org.example.strings;

import java.util.Locale;

public class StringCheck {
    //    Napisz program obliczjacy dlugosc danego Stringa. Nie uzywaj lenght()!
//    Napisz program porownujacy dwa Stringi bez uzywania equals().
//    Napisz program tworzacy nowy String z danego char[].
//    Napisz program testujacy czy string zaczyna sie danym znakien.
//    Napisz program testujacy czy string konczy sie danym znakien.
//    Napisz program zamieniajacy String na char[] (bez uzycia toCharArray()).
//    Napisz program zwracajacy index danej litery w alfabecie.
//    Napisz program zamieniajacy wszystkie wystapienia podanego 'char' w stringu.
//    Napisz program ktory zwroci podana czesc Stringa startIndex do endIndex.
//
//    Napisz program ktory usunie wszystkie spacie z (nie uzywaj methody .trim()):
//            - konca Stringa
//- z poczatku Stringa
//- z poczatku i konca
//
//    Napisz program ktory odwraca stringa "Kasia" -> "aisaK".
    public static int getStringLength(String str) {
        char[] chars = str.toCharArray();
        int strLength = 0;
        for (char aChar : chars) {
            strLength++;
        }
        return strLength;
    }

    public static boolean compareTwoStrings(String str1, String str2) {
        int counter = 0;
        if (getStringLength(str1) != getStringLength(str2)) {
            return false;
        } else {
            for (int i = 0; i < getStringLength(str1); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static String bulidAStringFromCharArr(char[] chars) {
        String str = String.valueOf(chars);
        return str;
    }

    public static boolean checkIfStartsWith(String str, char character) {
        char[] charArr = makeItToCharArr(str);
        return charArr[0] == character;
    }

    public static boolean checkIfEndsWith(String str, char character) {
        char[] charArr = makeItToCharArr(str);
        return charArr[getStringLength(str)-1] == character;
    }

    public static char[] makeItToCharArr(String str){
        char[] charsArr = new char[getStringLength(str)];
        for (int i = 0; i < getStringLength(str) ; i++){
            charsArr[i] = str.charAt(i);
        }
        return charsArr;
    }
    public static int letterAlphIndex(char character){
        char fixedChar = String.valueOf(character).toLowerCase(Locale.ROOT).charAt(0);
        int alphIndex = (int) fixedChar;
        return alphIndex - 96;
    }

    public static String changeLetters(String str,char character, char anotherChar ){
        char[] charArr =  makeItToCharArr(str);
        for (int i = 0; i < getStringLength(str); i++) {
            if (charArr[i] == character){
                charArr[i] = anotherChar;
        }
        }
        return String.valueOf(charArr);
    }
    public static String getPartOfString(String str,int beginIndex, int endIndex){
        char[] charArr =  makeItToCharArr(str);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = beginIndex; i <= endIndex ; i++){
            stringBuilder.append(charArr[i]);
        }
        return String.valueOf(stringBuilder);
    }

    public static String removeWhiteSigns(String str){
        char[] charArr =  makeItToCharArr(str);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < getStringLength(str); i++) {
            if (charArr[i] != ' '){
            stringBuilder.append(charArr[i]);
            }
        }
        return String.valueOf(stringBuilder);
    }
 public static String getReverseString(String str){
     char[] charArr =  makeItToCharArr(str);
     StringBuilder stringBuilder = new StringBuilder();
     for (int i = getStringLength(str) - 1 ; i >=0 ; i--) {
         stringBuilder.append(charArr[i]);
     }
     return String.valueOf(stringBuilder); }
}
