package fr.campus.dungeoncrawler.board;
import  fr.campus.dungeoncrawler.characters.Enemy;

/**
 * Représente une case avec un ennemi sur le plateau
 * Hérite de la classe Cell
 */
public class EnemyCell extends Cell{
    private Enemy enemy;
    /**
     * Constructeur de la case avec un ennemi
     * @param position position de la case sur le plateau
     */
    public EnemyCell(int position, Enemy enemy){
        super(position);
        this.enemy = enemy;
    }

    /**
     * constructeur de l'enemy
     * @return retourne l'enemy
     */
    public Enemy getEnemy(){
        return enemy;
    }

    /**
     * Retourne une représentation ce qui se passe sur la case.
     * @return texte disant ce qui se passe sur la case
     */
    @Override
    public  String toString(){
        return " UN ennemi apparaît" + enemy;
    }
}
