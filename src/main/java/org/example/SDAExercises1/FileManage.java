package org.example.SDAExercises1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManage {

    public static void writeToFile(String filePath, ArrayList games) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            String line = null;
            for (Object game : games) {
                line = game.toString();
                    bw.write(line);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Game> readFromFile(String filePath){
        ArrayList<Game> games = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String text = "";
            while ((text = br.readLine()) != null){
                ArrayList<String> temp = new ArrayList<>(List.of(text.split(",")));
                String title = temp.get(0);
                String type = temp.get(1);
                int year = Integer.parseInt(temp.get(2));
                long sold = Integer.parseInt(temp.get(3));

                games.add(new Game(title, type, year, sold));
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return games;
    }

}
