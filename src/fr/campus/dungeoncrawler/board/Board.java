package fr.campus.dungeoncrawler.board;

/**
 * Représente le palteau de jeu.
 * Il contient un certain nombre de cases (Tile).
 */
public class Board {
    private Tile[] tiles;
    /** Nombre total de cases du plateau*/
    private final int SIZE = 64;
    public Board(){
        tiles = new Tile[SIZE];
        for (int i = 0; i < SIZE; i++){
            tiles[i] = new Tile(i + 1); // cases numérotée de 1 à 64
        }
    }

    /**
     * Retourne la taille du plateau.
     * @return le nombre de cases du plateau
     */
    public int getSize(){
        return SIZE;
    }

    /**
     * retourne la case (Tile) correspondant à la position sur le plateau
     * @param position La position de la case qui doit être entre 1 et 64?
     * @return la case (Tile) corresponadnt à la position, ou null si c'est invalide.
     */
    public Tile getTile(int position){
        if (position >= 1 && position <= SIZE) {
            return tiles[position - 1];
        }
        return null;
    }
}
