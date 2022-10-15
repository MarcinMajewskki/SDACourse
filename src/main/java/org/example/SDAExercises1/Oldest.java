package org.example.SDAExercises1;

import java.util.ArrayList;
public interface Oldest {
    public static Game isTheOldest(ArrayList<Game> games){
        Game game = new Game();
        game = games.stream().max((o1, o2) -> o1.getRelaseYear() < o2.getRelaseYear() ? 1 : -1).get();
        System.out.println(game);
        return game;
    }
}
