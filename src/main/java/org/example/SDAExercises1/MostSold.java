package org.example.SDAExercises1;

import java.util.ArrayList;

public interface MostSold {
    public static Game isTheMostSold(ArrayList<Game> games) {
        Game game = new Game();
        game = games.stream().max((o1, o2) -> o1.getSoldCopies() > o2.getSoldCopies() ? 1 : -1).get();
        System.out.println(game);
        return game;
    }
}

