package fr.campus.dungeoncrawler.board;

/**
 * représente une case du plateau de jeu
 */
public class Tile {
    /**La position de la case sur le plateau */
    private  int position;

    /**
     * constructeur de la case
     * @param position la position de la case sur le plateau
     */
    public  Tile(int position){
        this.position = position;
    }
    //getters

    /**
     * Retourn la position de la case
     * @return la position de la case sur le plateau
     */
    public int getPosition(){
        return position;
    }

    /**
     * Retourne une représentation textuelle de la case.
     * @return une chaine de caractères indiquant le numéro de la case
     */
    @Override
    public String toString(){

        return "Case " + position;
    }
}
