package fr.campus.dungeoncrawler.items;

public class Weapon extends Item {
    private String name;
    private int damage;
    private String type; // weapon or spell
    public Weapon(String name, int damage, String type){
        this.name = name;
        this.damage = damage;
        this.type = type;
    }
    //Getters
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public String getType(){
        return type;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return name + " ("+ type + ") - Attack: " + damage;
    }
}
