package fr.campus.dungeoncrawler.board;

/**
 * Représente une case vide du plateau
 * Hérite de la classe Cell
 */
public class EmptyCell extends Cell {
    /**
     * constructeur de la case vide
     * @param position position de la case sur le plateau
     */
    public EmptyCell(int position){
        super(position);
    }

    /**
     * Retourne de manière littérale ce que contient la case.
     * @return chaîne de caractére qui indique que la case est vide.
     */
    @Override
    public String toString(){
        return "Case vide";
    }
}
