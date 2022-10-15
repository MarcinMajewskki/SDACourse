package org.example.SDAExercises1;

public class Game {
    private String title;
    private String type;
    private int relaseYear;
    private long soldCopies;

    public Game() {
    }

    public Game(String title, String type, int relaseYear, long soldCopies) {
        this.title = title;
        this.type = type;
        this.relaseYear = relaseYear;
        this.soldCopies = soldCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public void setRelaseYear(int relaseYear) {
        this.relaseYear = relaseYear;
    }

    public long getSoldCopies() {
        return soldCopies;
    }

    public void setSoldCopies(long soldCopies) {
        this.soldCopies = soldCopies;
    }

    @Override
    public String toString() {
        StringBuilder game = new StringBuilder();
        game.append(title).append(",") ;
        game.append(type).append(",") ;
        game.append(relaseYear).append(",");
        game.append(soldCopies).append("\n");
        return game.toString();
    }
}
