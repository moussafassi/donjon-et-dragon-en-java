package fr.campus.dungeoncrawler.items;

/**
 * Sort offensive utilisé par un personnage
 * Hérite de OffensiveEquipement
 */
public class Spell extends OffensiveEquipement{
    /**
     * Constructeur de spell
     * @param name nom du sort
     * @param attackLevel niveau d'attaque
     */
    public Spell (String name, int attackLevel){
        super(name,attackLevel);
    }
}
