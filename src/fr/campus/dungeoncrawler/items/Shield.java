package fr.campus.dungeoncrawler.items;

/**
 * Bouclier défensive utilisée par un personnage.
 * hérite de DefensiveEquipement
 */
public class Shield extends DefensiveEquipement{
    /**
     * construteur de Shield
     * @param name nom du bouclier
     * @param defenseLevel niveau de défense
     */
    public Shield (String name, int defenseLevel){
        super(name, defenseLevel);
    }
}
