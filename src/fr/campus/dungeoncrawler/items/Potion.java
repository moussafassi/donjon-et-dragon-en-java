package fr.campus.dungeoncrawler.items;

/**
 * Potion défensiveutilisée par un personnage.
 * hérire de DéfensiveEquipement
 */
public class Potion extends DefensiveEquipement{
    private int quantity;
    /**
     * constructeur Potion
     * @param name nom de la potion
     * @param defenseLevel niveau de défense ou valeur de soin
     */
    public Potion(String name, int defenseLevel,int quantity){
        super(name, defenseLevel);
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void decreaseQantity(){
        if(quantity > 0) quantity--;
    }
}

