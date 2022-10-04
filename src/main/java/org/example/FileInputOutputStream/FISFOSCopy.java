package org.example.FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISFOSCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("Example.txt");
            outputStream = new FileOutputStream("ExampleCopy.txt");
            int num = 0;
            while ((num = inputStream.read()) != -1) {
                outputStream.write((char) num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

        }
    }
}
