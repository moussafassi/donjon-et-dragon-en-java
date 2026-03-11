package fr.campus.dungeoncrawler.board;
import fr.campus.dungeoncrawler.items.Weapon;

/**
 * Représente une case contenant une arme sur le plateau
 * Hérite de la classe Cell
 */
public class WeaponCell extends Cell{
    /**
     * pour l'arme présente sur le plateau
     */
    //  appelle la classe Weapon.
    private Weapon weapon;

    /**
     * Constructeur de la case avec une arme
     * @param position position de la case sur le plateau
     * @param weapon paramètre de l'arme trouver
     */
    public WeaponCell(int position, Weapon weapon) {
        super(position);
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }

    /**
     * Retourne de manière textuelle ce que contient la case
     * @return chaine de caractére qui indique qu'on a trouvé une arme.
     */
    @Override
    public String toString(){
        return "Vous avez trouvé une arme : " + weapon;
    }
}
