package fr.campus.dungeoncrawler.board;
import fr.campus.dungeoncrawler.items.Potion;

/**
 * Représente une case contenant une arme sur le plateau
 * hérite de la classe Cell
 */
public class PotionCell extends Cell{
    /**
     * Pour la potion présente sur le plateau
     */
    private Potion potion;

    /**
     * Constructeur de la case avec une potion.
     * @param position position de la case
     * @param potion paramètre de la potion
     */
    public PotionCell(int position, Potion potion){
        super(position);
        this.potion = potion;
    }

    /**
     * Retourne de manière textuelle ce que contient la case
     * @return chaine de caractére qui indique qu'on a trouvé une potion.
     */
    @Override
    public String toString(){
        return "Vous avez trouvé une potion : " + potion ;
    }
}
