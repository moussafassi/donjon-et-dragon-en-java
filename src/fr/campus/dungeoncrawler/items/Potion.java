package fr.campus.dungeoncrawler.items;

/**
 * Potion défensiveutilisée par un personnage.
 * hérire de DéfensiveEquipement
 */
public class Potion extends DefensiveEquipement{
    /**
     * constructeur Potion
     * @param name nom de la potion
     * @param defenseLevel niveau de défense ou valeur de soin
     */
    public Potion(String name, int defenseLevel){
        super(name, defenseLevel);
    }
}

