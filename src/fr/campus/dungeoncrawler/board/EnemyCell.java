package fr.campus.dungeoncrawler.board;

/**
 * Représente une case avec un ennemi sur le plateau
 * Hérite de la classe Cell
 */
public class EnemyCell extends Cell{
    /**
     * Constructeur de la case avec un ennemi
     * @param position position de la case sur le plateau
     */
    public EnemyCell(int position){
        super(position);
    }

    /**
     * Retourne une représentation ce qui se passe sur la case.
     * @return texte disant ce qui se passe sur la case
     */
    @Override
    public  String toString(){
        return " UN ennemi apparaît";
    }
}
