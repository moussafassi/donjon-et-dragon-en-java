package fr.campus.dungeoncrawler.board;

public class Board {
    private Tile[] tiles;
    private final int SIZE = 64;
    public Board(){
        tiles = new Tile[SIZE];
        for (int i = 0; i < SIZE; i++){
            tiles[i] = new Tile(i + 1); // cases numérotée de 1 à 64
        }
    }
    public int getSize(){
        return SIZE;
    }
    public Tile getTile(int position){
        if (position >= 1 && position <= SIZE) {
            return tiles[position - 1];
        }
        return null;
    }
}
