package org.example.BufferedIOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BuffIInput {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = null;

        try{
            int v = 0;
            bufferedInputStream = new BufferedInputStream(new FileInputStream("Example.txt"));
//          bufferedInputStream = new BufferedInputStream(Files.newInputStream(Paths.get("Example.txt")));
            while ((v = bufferedInputStream.read()) != -1){
                System.out.print((char) v);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null){
                bufferedInputStream.close();
            }
        }

    }
}
