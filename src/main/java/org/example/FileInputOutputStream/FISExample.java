package org.example.FileInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FISExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("Example.txt");
            int num = 0;
            while ((num = inputStream.read()) != -1) {
                System.out.print((char) num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }
}
