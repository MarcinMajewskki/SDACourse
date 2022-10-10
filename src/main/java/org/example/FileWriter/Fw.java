package org.example.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Fw {
    public static void main(String[] args) throws IOException {

        String str = "Text Example";
        char[] chars = str.toCharArray();

        FileWriter fw = null;


        try {
            fw = new FileWriter("files\\SecondExample.txt");
            for (char c : chars) {
                fw.write( c );
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fw != null){
                fw.close();
            }
        }

    }
}
