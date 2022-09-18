package org.example.stringi;

public class Cezar {

    public static String encrypt(String textToEncrypt) {
        char [] charArr = textToEncrypt.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int n = charArr[i];
            n += 2;
            charArr[i] = (char) n;
        }
        return String.valueOf(charArr);
    }

    public static String decrypt(String encrypted) {
        char [] charArr = encrypted.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int n = charArr[i];
            n -= 2;
            charArr[i] = (char) n;
        }
        return String.valueOf(charArr);
    }
}
