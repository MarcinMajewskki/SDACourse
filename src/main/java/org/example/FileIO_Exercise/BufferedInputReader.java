package org.example.FileIO_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BufferedInputReader {
    private String selectPath;
    StringBuilder text = new StringBuilder();
    public BufferedReader input = null;

    public BufferedInputReader(String selectPath) {
        this.selectPath = selectPath;
    }

    public String getTextAsString() throws IOException {
        try {
            StringBuilder temp = new StringBuilder();
            int v = 0;
            input = new BufferedReader(new FileReader(selectPath));
            while ((v = input.read()) != -1) {
                text.append((char) v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return text.toString();
    }

    public String getLine(int line) throws IOException {
        StringBuilder temp = new StringBuilder();
        try {
            int v = 0;
            input = new BufferedReader(new FileReader(selectPath));
            for (int i = 1; i < line ; i++) {
                input.readLine();
            }
            temp.append(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return temp.toString();
    }

    public ArrayList<String> getTextAsStringArr() throws IOException, UncheckedIOException {
        ArrayList<String> textAsArrListOfLines = new ArrayList<>();
        int n = 1;
        while (!getLine(n).equals("null")){
            textAsArrListOfLines.add(getLine(n));
            n++;
        }
        return textAsArrListOfLines;
    }
}
