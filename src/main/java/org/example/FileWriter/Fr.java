package org.example.FileWriter;

import java.io.FileReader;
import java.io.IOException;

public class Fr {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;

        try{
            int num = 0;
            fileReader = new FileReader("files\\SecondExample.txt");
            while ((num = fileReader.read()) != -1){
                System.out.print((char) num);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                fileReader.close();
            }
        }

    }
}
