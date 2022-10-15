package org.example.SDAExercises1;

import java.util.ArrayList;

public interface Newest {
    public static Game isTheNewest(ArrayList<Game> games){
        Game game = new Game();
        game = games.stream().max((o1, o2) -> o1.getRelaseYear() > o2.getRelaseYear() ? 1 : -1).get();
        System.out.println(game);
        return game;
    }
}
