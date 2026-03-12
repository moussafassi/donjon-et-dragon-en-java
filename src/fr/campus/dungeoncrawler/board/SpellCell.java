package fr.campus.dungeoncrawler.board;
import fr.campus.dungeoncrawler.items.Spell;

/**
 * Représente une case contenant un sort sur le plateau
 * Hérite de la classe Cell
 */
public class SpellCell extends Cell {
    /**
     * pour le sort présent sur le plateau
     */
    private Spell spell;

    /**
     * constructeur de la case avec une arme
     * @param position position de la case sur le plateau
     * @param spell paramètre du sort trouver
     */
    public SpellCell(int position, Spell spell){
        super(position);
        this.spell = spell;
    }

    /**
     * constructeur du sort
     * @return retourne le sort
     */
    public Spell getSpell(){
        return spell;
    }

    /**
     * Retourne de manière textuelle ce que contient la case
     * @return chaine de caractére qui indique qu'on a trouvé un sortilége.
     */
    @Override
    public String toString(){
        return "Vous avez trouvé un sort: " + spell;
    }
}

