package org.example.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSExample {
    public static void main(String[] args) throws IOException {
        String textExample = "QWERTYUIOP";

        FileOutputStream out = null;

        try {
            out = new FileOutputStream("Example.txt");
            for (char c : textExample.toCharArray()) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null){
                out.close();
            }
        }

    }
}
