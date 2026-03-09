package fr.campus.dungeoncrawler.items;

/**
 * Arme offensive utilisée par un personnage.
 * Hérite de OffensiveEquipement
 */

public class Weapon extends OffensiveEquipement {

    /**
     * constructeur de weapon
     * @param name nom de l'arme
     * @param attacklevel niveau d'attaque
     */
    public Weapon(String name, int attacklevel) {
        super(name, attacklevel);
    }
}

