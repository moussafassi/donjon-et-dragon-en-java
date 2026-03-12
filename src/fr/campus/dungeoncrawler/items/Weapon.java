package fr.campus.dungeoncrawler.items;

/**
 * Arme offensive utilisée par un personnage.
 * Hérite de OffensiveEquipement
 */

public class Weapon extends OffensiveEquipement {
    private String allowedClass;
    private int quantity; // nombre disponible dans le jeu

    /**
     * constructeur de weapon
     * @param name nom de l'arme
     * @param attacklevel niveau d'attaque
     */
    public Weapon(String name, int attacklevel, int quantity, String allowedClass) {
        super(name, attacklevel);
        this.quantity = quantity;
        this.allowedClass = allowedClass;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getAllowedClass(){
        return allowedClass;
    }
    public void decreaseQantity(){
        if(quantity > 0) quantity--;
    }
    @Override
    public String toString(){
        return super.toString() + "(disponible: " + quantity + allowedClass + ")";
    }
}

