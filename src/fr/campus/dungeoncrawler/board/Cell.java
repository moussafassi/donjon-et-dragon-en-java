package fr.campus.dungeoncrawler.board;

/**
 * Classe abstraite représentant une case du plateau.
 */
public abstract class Cell {
    protected int position;

    /**
     * Constructeur de la case position
     * @param position position du la case sur le plateau
     */
    public Cell(int position) {
    this.position = position;
}

    /**
     * Retourne la position de la case sur le plateau
     * @return la position ou la case sur le plateau
     */
    public  int getPosition(){
    return position;
}

    /**
     * Retourne de manière littérale la position
     * et ce que contient la case
     * @return une chaîne de caractère qui est en lien avec les autres classe
     * qui sont en héritage
     */
    @Override
public abstract  String toString();
}